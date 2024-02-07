# 영화 웡카의 영화 정보를 검색하는 쿼리(배우 X, 감독 X, 제작국가 X, 장르 X)
select * from movie where mo_title = '웡카';

# 영화 웡카에 출연한 배우 및 감독을 조회하는 쿼리
select
	mo_title as 제목, ch_name as 이름, mp_role as 구분
from
	movie
		join
	`join` on jo_mo_num = mo_num
		join
	movie_person on mp_num = jo_mp_num
		join
	`character` on mp_ch_num = ch_num
where
	mo_title = '웡카';