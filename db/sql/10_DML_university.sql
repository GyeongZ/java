USE UNIVERSITY;
# 컴퓨터공학 고길동 학생이 수강lecture신청한 강의 개수를 조회하는 쿼리
SELECT
	ST_NAME AS "이름", ST_MAJOR AS "전공", COUNT(*) AS "신청한 강의 수"
FROM
	COURSE
		JOIN
	STUDENT ON CO_ST_NUM = ST_NUM
WHERE
	ST_MAJOR = "컴퓨터공학" AND ST_NAME = "고길동";
    
# 컴퓨터공학 고길동 학생이 수강 신청한 학점을 조회하는 쿼리
SELECT
    ST_NAME AS "이름", ST_MAJOR AS "전공", SUM(LE_POINT) AS "수강 신청 학점"
FROM
	COURSE
		JOIN
	STUDENT ON CO_ST_NUM = ST_NUM
		JOIN
	LECTURE ON CO_LE_NUM = LE_NUM
WHERE
	ST_MAJOR = "컴퓨터공학" AND ST_NAME = "고길동";

# 24학년 신입생을 조회하는 쿼리
SELECT * FROM STUDENT WHERE ST_NUM LIKE '2024%' AND ST_GRADE = 1;

# 각 전공별 학생수를 조회하는 쿼리
SELECT
	ST_MAJOR AS " 전공" , COUNT(*) AS "학생수"
FROM
	STUDENT
GROUP BY
	ST_MAJOR;
    
# 강의별 수강신청한 학생 수를 조회해보는 쿼리 : 강의명, 학생수 순으로 조회
SELECT
	LE_TITLE AS "강의명", COUNT(CO_ST_NUM) AS "학생수"
FROM
	COURSE
		JOIN
        LECTURE ON CO_LE_NUM = LE_NUM
GROUP BY
	LE_NUM;
    
#0206_수업_복습
# 컴퓨터공학을 다니는 학생 정보를 조회 (모름, 복습 불량 아에 모름 x)
select * from student where st_major = "컴퓨터공학";

# 컴퓨터공학을 다니는 1학년 학생 정보를 조회 (X)
SELECT * FROM student
WHERE st_major = '컴퓨터공학' and st_grade = 1;

# 컴퓨터공학 또는 화학공학을 다니는 1학년 학생 정보를 조회 : or이랑 and가 여러개 있는 경우 ()괄호를 쳐서 구분짓기
select * from student
where (st_major = '컴퓨터공학' or st_major = '화학공학') and st_grade = 1;

select * from student
where st_major in ('컴퓨터공학','화학공학') and st_grade = 1;
#위와 같은 코드

#컴퓨터공학을 다니는 학생 수를 조회 (group by와 count() 사용하기)
select count(*)
from student
where st_major = '컴퓨터공학'
group by st_major;

# 학생들이 등록된 학과를 조회
select distinct st_major
from student;
#distinct 사용 (정확하게 알기)

SELECT
	ST_MAJOR
FROM
	STUDENT
GROUP BY
	ST_MAJOR;
#group by 사용 (distinct 가 더 간단함)

# 학생들이 3명이상 등록된 학과들을 조회 (having 절 이용)
select st_major from student group by st_major having count(st_num) >= 3;

# 컴퓨터개론을 수강하는 학생 수를 조회 (join을 이용)
select
	count(*)
from
	course
		join
	lecture on co_le_num = le_num
where le_title = '컴퓨터개론'
group by co_le_num;

# 각 강의별 수강하는 학생 수를 조회, 강의명과 학생 수를 조회
select le_title as "강의명", count(co_st_num) as "학생수"
from
course
		join
	lecture on co_le_num = le_num
group by co_le_num;

# 홍길동 학생이 수강하는 강의 목록을 조회
-- select ST_NAME AS "이름"
-- from course
-- 		join
-- 	lecture on st_le_
-- where st_name = "홍길동"; 내가 한거 아니였음
select st_name, le_title
from course
		join
	student on co_st_num = st_num
		join
	lecture on co_le_num = le_num
where
	st_name = "홍길동";
    
# 기계공학에 소속된 교수의 수를 조회
-- select count(*) from professor
-- where lecture = "기계공학"; 내가 한거
select count(*) from professor
where pr_major = "기계공학";

# 김교수가 강의하는 강의명을 조회
select distinct pr_name, le_title
from course
		join
	lecture on co_le_num = le_num
		join
	professor on le_pr_num = pr_num
where
	pr_name = "김교수";

#승주형의 예제 (열 = Columns)
select * from professor
		join
	lecture on le_pr_num = pr_num
where le_room = "4관 101호";

