#대학생 관리 프로그램 물리적 설계

# DB 생성 (DROP 먼저 둔 이유 : 혹시 파일이 있을 수 있으니 미리 지우고 새로 생성한다.)
DROP DATABASE IF EXISTS university;
CREATE DATABASE IF NOT EXISTS university;

# 중요!! 하이라이트 된 곳을 활성화하여 거기에다가 만들겠다
USE university;

drop table if exists student;
create table if not exists student(member
	st_num char(10) PRIMARY KEY,
    st_name varchar(30) not null,
    st_major varchar(15) not null,
    st_grade int  not null default 1
);
DESC student;

drop table if exists professor;
create table if not exists professor(
	pr_num char(10) PRIMARY KEY,
    pr_name varchar(30) not null,
    pr_room varchar(1000),
    pr_major varchar(15) not null
);
DESC professor;

drop table if exists lecture;
create table if not exists lecture(
	le_num int AUTO_INCREMENT PRIMARY KEY,
    le_title varchar(30) not null,
    le_room varchar(20),
    le_schedule varchar(50) not null,
    le_point int not null default 0,
    le_time int not null default 0,
    le_pr_num char(10) default 0,
    FOREIGN key(le_pr_num) REFERENCES professor(pr_num)
);
DESC lecture;

drop table if exists course;
create table if not exists course(
	co_num int auto_increment PRIMARY KEY,
    co_st_num CHAR(10) not null,
    co_le_num int not null,
    FOREIGN KEY(co_st_num) REFERENCES student(st_num),
    FOREIGN KEY(co_le_num) REFERENCES lecture(le_num)
);
DESC course;

#contact 테이블 삭제 후 추가
drop table if exists coteat;
create table if not exists contact(
	ct_st_num char(10) primary key,
    ct_phone varchar(13) not null,
    ct_addr varchar(30) not null,
    ct_detail varchar(30) not null default "",
    foreign key(ct_st_num) references student(st_num)
);