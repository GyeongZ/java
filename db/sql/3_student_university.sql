/* 신입생이 5명이고, 5명을 등록하는 쿼리
전공
컴퓨터공학 : 160
화학공학 : 153
기계공학 : 123

전공이 컴퓨터공학인 신입생 5명이고, 5명을 등록하는 쿼리
홍길동, 입꺽정, 유재석, 둘리, 고길동

전공이 화학공학인 신입생이 3명이 있고, 3명을 등록하는 쿼리
나영석, 강호동, 이둘리

전공이 기계공학인 신입생이 3명 있고, 3명을 등록하는 쿼리
가나다, 박둘리, 마둘리

학번은 계산해서 넣으세요.
*/
USE UNIVERSITY;
#컴퓨터공학과 신입생 추가
INSERT INTO STUDENT(ST_NUM, ST_NAME, ST_MAJOR) VALUES
("2024160001", "고길동", "컴퓨터공학"),
("2024160002", "둘리", "컴퓨터공학"),
("2024160003", "유재석", "컴퓨터공학"),
("2024160004", "임꺽정", "컴퓨터공학"),
("2024160005", "홍길동", "컴퓨터공학");

#화학공학과 신입생 추가
INSERT INTO STUDENT(ST_NUM, ST_NAME, ST_MAJOR) VALUES
("2024135001", "강호동", "화학공학"),
("2024135002", "나영석", "화학공학"),
("2024135003", "이둘리", "화학공학");

#기계공학과 신입생 추가
INSERT INTO STUDENT(ST_NUM, ST_NAME, ST_MAJOR) VALUES
("2024123001", "가나다", "기계공학"),
("2024123002", "마둘리", "기계공학"),
("2024123003", "박둘리", "기계공학");

#컴퓨터공학과 신입교수 추가
INSERT INTO PROFESSOR(PR_NUM, PR_NAME, PR_ROOM, PR_MAJOR) VALUES
("2024160001", "박교수", "3관 101호", "컴퓨터공학" );

#화학공학과 신입교수 추가
INSERT INTO PROFESSOR(PR_NUM, PR_NAME, PR_ROOM, PR_MAJOR) VALUES
("2024135001", "이교수", "3관 201호", "화학공학" );

#기계공학과 신입교수 추가
INSERT INTO PROFESSOR(PR_NUM, PR_NAME, PR_ROOM, PR_MAJOR) VALUES
("2024123001", "김교수", "3관 301호", "기계공학" );

#강의 등록
# 컴퓨터개론, 1관 101호, 월1A,1B,2A,2B, 2, 2, 2024160001
INSERT INTO LECTURE (LE_TITLE, LE_ROOM, LE_SCHEDULE, LE_POINT, LE_TIME, LE_PR_NUM) VALUES
("컴퓨터개론", "1관 101호", "월1A,1B,2A,2B", "2", "2", "2024160001");

INSERT INTO LECTURE VALUES
(NULL, "프로그래밍언어", "1관 101호", "월5A,5B,6A,6B,수5A,5B,6A,6B", "3", "4", "2024160001");

INSERT INTO LECTURE (LE_TITLE, LE_ROOM, LE_SCHEDULE, LE_POINT, LE_TIME, LE_PR_NUM) VALUES
("화학 기초", "2관 101호", "화1A,1B,2A,2B,금1A,1B,2A,2B", "3", "4", "2024135001");

INSERT INTO LECTURE (LE_TITLE, LE_ROOM, LE_SCHEDULE, LE_POINT, LE_TIME, LE_PR_NUM) VALUES
("동역학", "4관 101호", "수1A,1B,2A,2B", "3", "4", "2024123001");

# 수강 신청
# 컴공 고길동, 임꺽정 학생은 컴퓨터 개론, 프로그래밍 언어를 수강 신청
INSERT INTO COURSE(CO_ST_NUM, CO_LE_NUM)VALUES
("2024160001", 1),
("2024160001", 2),
("2024160004", 1),
("2024160004", 2);
# 컴공 둘리, 홍길동 학생은 컴퓨터 개론을 수강 신청
INSERT INTO COURSE(CO_ST_NUM, CO_LE_NUM)VALUES
("2024160002", 1),
("2024160005", 1);
# 컴공 유재석 학생은 프로그래밍 언어를 수강 신청
INSERT INTO COURSE(CO_ST_NUM, CO_LE_NUM)VALUES
("2023160003", 2);
# 화공 강호동, 나영석 학생은 화학기초를 수강 신청
INSERT INTO COURSE(CO_ST_NUM, CO_LE_NUM)VALUES
("2024135001", 3),
("2024135002", 3);
# 기계 가나다, 마둘리, 박둘리 학생은 동역학을 수강 신청
INSERT INTO COURSE(CO_ST_NUM, CO_LE_NUM)VALUES
("2024123001", 4),
("2024123002", 4),
("2024123003", 4);
# 기계 가나다 학생은 프로그래밍 언어를 수강 신청

