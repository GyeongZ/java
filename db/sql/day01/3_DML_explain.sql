/*
테이블명만 쓰는 것과 DB명.테이블명을 쓰는 것의 차이
- 테이블명만 쓰는 경우는 내가 작업하려는 DB가 선택됐을 때
DB명.테이블명은 현재 선택된 DB와 상관없이 작업할 수 있다.
*/

USE TEST;

# 테이블에 등록된 컬럼 순서에 상관 없이 추가할 때 내가 적으며 나열한 컬럼 순서대로 값들을 넣어주면 실행 된다.
-- INSERT INTO `MEMBER`(기본값이 없는 것들) VALUES();
-- INSERT INTO `MEMBER`(ID, PW, EMAIL, REG_DATE) VALUES("ID1", "비번123", "ABC@NAVER.COM", NOW());

-- INSERT INTO `MEMBER`(PW, ID, REG_DATE, EMAIL) VALUES("비번123", "ID1", NOW(), "ABC@NAVER.COM");

# 속성명을 생략한 대신, (MEMBER 뒤에 '()'생략 했음) 테이블에 등록된 컬럼 순서대로 값들을 넣어주어야 한다.
-- INSERT INTO MEMBER VALUES();
-- INSERT INTO MEMBER("ID2", "비밀번호입니다.", "ABC@GMAIL.COM", NOW()); VALUES();
# 위 코드를 아래처럼 바꾸었을때
-- NOW()를 날짜로 문자열에 저장하면 날짜가 문자열로 변환되서 문제가 없음.
-- 날짜형태가 아닌 문자열을 DATATIME에 저장하려고 하면 에러가 발생됨. 
-- INSERT INTO MEMBER("ID2", "비밀번호입니다.", NOW(), "ABC@GMAIL.COM"); VALUES();


# 아이디가 ID3인 회원의 이메일을 ID3@NAVER.COM으로 수정하는 쿼리
UPDATE
	MEMBER
SET
	EMAIL = "ID3@NAVER.COM"
WHERE
	ID = "ID3";

# 아이디가 ID1인 회원의 비번을 IDABC로, 이메일을 IDABC@NAVER.COM으로 수정하는 쿼리
UPDATE
	MEMBER
SET
	PW = "IDABC",
    EMAIL = "IDABC@NAVER.COM"
WHERE
	ID = "ID1";
    
# 아이디가 ABC인 회원의 정보를 삭제하는 쿼리
DELETE
FROM
	MEMBER
WHERE
	ID = "ABC";
    
# MEMBER 테이블을 조회
SELECT ID, PW, EMAIL, REG_DATE FROM MEMBER;
SELECT * FROM MEMBER;
-- *표시는 모든 것들을 조회하는 것 

# ID가 ID1인 회원의 정보를 조회
SELECT * FROM MEMBER WHERE ID = "ID1";
    
    