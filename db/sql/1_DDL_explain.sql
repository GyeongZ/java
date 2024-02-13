/*
여러줄 주석
*/ 
-- 한 줄 주석
# 한 줄 주석

# 데이터베이스 삭제 (있으면)
drop database if exists test;
# drop schema if exists `test`;

-- 데이터베이스 추가 (없으면)
create database if not exists test;
-- create schema if nor exists `test`;

use test;

# 테이블 삭제
drop table if exists member;
#테이블 생성
create table if not exists member(
	ID varchar(14) primary key,
    pw varchar(15) not null,
    Email varchar(30) not null unique
);
desc member;

DROP table if exists board;

create table if not exists board(
	num int AUTO_INCREMENT,
    title varchar(50) not null,
    content longtext not null,
    VIEW INT NOT NULL DEFAULT 0,
	ID varchar(14) NOT NULL,
	PRIMARY KEY(NUM)
);
DESC BOARD;

DROP table if exists board;

CREATE table if NOT exists board(
	num int AUTO_INCREMENT,
    title varchar(50) not null,
    content longtext not null,
    VIEW INT NOT NULL DEFAULT 0,
	ID varchar(14) NOT NULL,
	PRIMARY KEY(NUM),
    FOREIGN KEY(ID) REFERENCES MEMBER(ID)
);
DESC BOARD;

USE test;
# MEMBER 테이블에 가입일 컬럼을 추가 (만들어진 테이블에 속성을 추가하는 것)
ALTER TABLE `MEMBER` ADD `DATE` DATETIME NOT NULL; 

# MEMBER 테이블에 가입일을 의미한 DATE , REG_DATE 로 변경 (만들어진 테이블에 속성을 추가하는 것)
ALTER TABLE MEMBER CHANGE `DATE` `REG_DATE` DATETIME NOT NULL; 

# MEMBER 테이블에 불필요한 컬럼 COUNT 를 추가
ALTER TABLE `MEMBER` ADD `COUNT` INT NOT NULL; 

# MEMBER 테이블에서 COUNT 컬럼을 삭제
ALTER TABLE `MEMBER` DROP `COUNT`;



