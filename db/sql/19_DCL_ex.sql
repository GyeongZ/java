# 사용자 추가하는 법
CREATE USER 'GyeongZ'@'%' IDENTIFIED BY 'abc123';

#CREATE USER ‘사용자아이디’@’호스트명’ IDENTIFIED BY ‘비밀번호’;
# 호스트명
# ‘localhost’ : 내부에서만 접근 가능
# ‘%’ : 외부에서도 접근 가능 

# 사용자 비밀번호 변경하는 법
SET PASSWORD FOR 'GyeongZ'@'%' = 'def123';

# 사용자 계정 삭제하는 법
DROP USER 'GyeongZ'@'%';

# 전체 조회 하는 것
SELECT User, Host FROM mysql.user;

# 권한 부여 : GRANT 권한 종류 ON DB명.테이블명 TO '사용자명'@'호스트명';
GRANT ALL PRIVILEGES ON `SHOPPINGMALL`.PRODUCT TO 'GyeongZ'@'%';

# 권한 제거 : REVOKE 권한 종류 ON DB명.테이블명 FROM '사용자명'@'호스트명';
REVOKE ALL PRIVILEGES ON `SHOPPINGMALL`.PRODUCT FROM 'GyeongZ'@'%';

#
GRANT ALL PRIVILEGES ON `SHOPPINGMALL`.* TO 'GyeongZ'@'%'; 
