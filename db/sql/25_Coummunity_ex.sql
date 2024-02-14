USE community;

# 먼저 회원 상태를 추가하는 쿼리(이용 중, 기간 정지, 영구 정지, 탈퇴)
INSERT INTO member_state values('이용 중'), ('기간 정지'),('영구 정지'),('탈퇴');

# 3명이 각각 회원 가입을 진행할 때, 필요한 쿼리

# 아이디 : abc123, 비밀번호 : abc123, 이메일 : abc123@kh.co.kr 권한 : USER
INSERT INTO member(ME_ID, ME_PW, ME_EMAIL,ME_MS_STATE)
			values('abc123', 'abc123', 'abc123@kh.co.kr','이용 중');
            
# 아이디 : qwe123, 비밀번호 : qwe123, 이메일 : qwe123@kh.co.kr 권한 : USER
INSERT INTO member(ME_ID, ME_PW, ME_EMAIL,ME_MS_STATE)
			values('qwe123', 'qwe123', 'qwe123@kh.co.kr','이용 중');

# 아이디 : admin, 비밀번호 : admin, 이메일 : admin@kh.co.kr 권한 : ADMIN
INSERT INTO member(ME_ID, ME_PW, ME_EMAIL, ME_AUTHORITY,ME_MS_STATE)
			values('admin', 'admin', 'admin@kh.co.kr', 'ADMIN', '이용 중');
            
# 관리자가 커뮤니티를 등록 (공지, 자유, 토론, 공부)
INSERT INTO community(CO_NAME) values('공지');
INSERT INTO community(CO_NAME) values('자유');
INSERT INTO community(CO_NAME) values('토론');
INSERT INTO community(CO_NAME) values('공부');

# abc123 회원이 게시글을 등록했을 때 실행되는 쿼리
# 제목 : 테스트, 내용 : 테스트입니다. 첨부파일 : 없음
INSERT INTO BOARD(BO_CO_NUM, BO_ME_ID, BO_TITLE, BO_CONTENT)
VALUES(2, 'abc123', '테스트', '테스트입니다.');

INSERT INTO BOARD(BO_CO_NUM, BO_ME_ID, BO_TITLE, BO_CONTENT)
SELECT CO_NUM, 'abc123', '테스트', '테스트입니다.' FROM COMMUNITY WHERE CO_NAME = '자유';

# 위 2개 같은 것 방식이 조금 다름
SELECT * FROM board;

# admin 관리자가 공지 커뮤니티에 게시글을 등록했을 때 실행되는 쿼리
# 제목 : 공지사항, 내용 : 공지사항입니다., 첨부파일 : 공지사항1.jpg
# 첨부파일은 서버 업로드 되면 현재 날짜 기준으로 폴더를 생성해서 업로드 함
# 업로드된 첨부파일은 /2024/02/14/파일명으로 저장

SELECT * FROM community;
INSERT INTO BOARD(BO_CO_NUM, BO_ME_ID, BO_TITLE, BO_CONTENT)
SELECT CO_NUM, 'admin', '공지사항', '공지사항입니다.' FROM COMMUNITY WHERE CO_NAME = '공지';

INSERT FILE(FI_BO_NUM, FI_NAME, FI_ORI_NAME)
VALUES(3, '/2024/02/14/공지사항1.JPG', '공지사항1.JPG');

# 공지 커뮤니티에 등록된 모든 게시글들을 조회하는 쿼리
SELECT
	*
FROM
	BOARD
		JOIN
	COMMUNITY ON BO_CO_NUM = CO_NUM
WHERE
	CO_NAME = '공지';
    
# 공지 커뮤니티에 등록된 게시글 중 1페이지에 해당하는 게시글을 조회하는 쿼리
SELECT
	*
FROM
	BOARD
		JOIN
	COMMUNITY ON BO_CO_NUM = CO_NUM
WHERE
	CO_NAME = '공지'
ORDER BY BO_NUM DESC
LIMIT 0, 10;

# 3번 게시글을 상세 조회했을때 실행되는 쿼리

# 	순서 - 3번 게시글의 조회수를 증가하는 쿼리
UPDATE BOARD SET BO_VIEW = BO_VIEW + 1 WHERE BO_NUM = 3;

#	순서 - 3번 게시글 조회하는 쿼리
SELECT * FROM BOARD WHERE BO_NUM = 3;

# 게시글 목록에서 abc123 아이디를 클릭했을 때 실행되는 쿼리
SELECT
	*
FROM
	BOARD
WHERE
	BO_ME_ID = 'abc123'
ORDER BY BO_NUM DESC
LIMIT 0, 10;

# qwe123 회원이 1번 게시글의 추천 버튼을 클릭 했을 때 실행되는 쿼리
#	순서 - qwe123 회원이 1번 게시글에 추천한 기록을 조회
-- SELECT
-- 	BO_NUM = 1
-- FROM
-- 	BOARD
-- 		JOIN
-- 	RECOMMEND ON RE_BO_NUM = BO_NUM
-- WHERE
-- 	BO_ME_ID = 'qwe123';
# 강사님
SELECT
	*
FROM
	RECOMMEND
WHERE
	RE_ME_ID = 'abc123' AND RE_BO_NUM = 1;
#	순서 - 추천한 기록이 없다면 추천을 추가
INSERT INTO RECOMMEND(RE_ME_ID, RE_BO_NUM, RE_STATE)
VALUES('abc123', 1, 1);
#	순서 - 추천한 기록이 있다면 추천을 수정
#			- 추천한 기록이 추천인 경우 => 추천을 취소
UPDATE RECOMMEND SET RE_STATE = 0 WHERE RE_BO_NUM = 1 AND RE_ME_ID = 'abc123';
#			- 추천한 기록이 추천이 아닌 경우 => 비추천이거나 추천/비추천을 취소한 경우(2번 눌렀다 => 비추로 바뀜)
UPDATE RECOMMEND SET RE_STATE = 1 WHERE RE_BO_NUM = 1 AND RE_ME_ID = 'abc123';

# 아이디와 게시글이 주어졌을 때 추천을 추가하거나 수정하는 프로시저
DROP PROCEDURE IF EXISTS BOARD_RECOMMEND;
DELIMITER //
CREATE PROCEDURE BOARD_RECOMMEND(
	IN _ID VARCHAR(13),
    IN _BO_NUM INT,
    IN _STATE INT # 1이면 추천, -1이면 비추천
)
BEGIN
	DECLARE _RE_NUM INT;
    DECLARE _RE_STATE INT;
    DECLARE _NEW_STATE INT;
 
	# 순서1. 아이디, 게시글 번호를 이용하여 등록된 추천 번호를 조회해서 변수에 저장
 --    SELECT _RE_NUM FROM RECOMMEND WHERE RE_ME_ID = 'abc123' AND RE_BO_NUM = 1;
	SET _RE_NUM = (SELECT RE_NUM FROM RECOMMEND WHERE RE_ME_ID = _ID AND RE_BO_NUM = _BO_NUM);
   
   # 순서2_1. 추천 번호가 NULL이면 추천 테이블에 추가 (위에서 가져오되 변수 수정)
    IF _RE_NUM IS NULL THEN
		INSERT INTO RECOMMEND(RE_ME_ID, RE_BO_NUM, RE_STATE)
		VALUES(_ID, _BO_NUM, _STATE);
   
   # 순서2_2. 추천 번호가 NULL이 아니면(ELSE)
    ELSE
		# 2-2-0. 추천 번호에 맞는 추천 상태를 가져옴
        SET _RE_STATE = (SELECT RE_STATE FROM RECOMMEND WHERE RE_NUM = _RE_NUM);
	/*	# 2-2-1. 추천 상태가 _STATE와 같으면 취소(0으로 수정)
        IF _RE_STATE = _STATE THEN
			UPDATE RECOMMEND SET RE_STATE = 0 WHERE RE_BO_NUM = _BO_NUM AND RE_ME_ID = _ID;
        # 2-2-2. 추천 상태가 _STATE와 다르면 _STATE로 수정 (그리고 END IF;로 마지막 마무리)
        ELSE
			UPDATE RECOMMEND SET RE_STATE = _STATE WHERE RE_BO_NUM = _BO_NUM AND RE_ME_ID = _ID;
	*/
		# 2-2-1. 추천 상태가 _STATE와 같으면 취소(0으로 수정)
        IF _RE_STATE = _STATE THEN
			SET _NEW_STATE = 0;
        # 2-2-2. 추천 상태가 _STATE와 다르면 _STATE로 수정 (그리고 END IF;로 마지막 마무리)
        ELSE
			SET _NEW_STATE = _STATE;
		END IF;
        UPDATE RECOMMEND SET RE_STATE = _STATE WHERE RE_BO_NUM = _BO_NUM AND RE_ME_ID = _ID;
	END IF;
END //
DELIMITER ;

CALL BOARD_RECOMMEND('abc123', 1, 1);
SELECT * FROM RECOMMEND;
