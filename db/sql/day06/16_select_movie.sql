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
    
    
# 0208_ SELECT 조회 예제
# CGV강남 1상영관에 등록된 좌석을 조회하는 쿼리

#내 생각
select th_seat from theater
where th_name = 'CGV강남';
#강사님 생각
select * from seat
		join
	screen on se_sc_num = sc_num
		join
	theater on sc_th_num = th_num
where
	sc_name = 1 and th_name = 'CGV강남';
    
# CGV강남에 등록된 좌석을 조회하는 쿼리
select *
from seat
		join
	screen on se_sc_num = sc_num
		join
	theater on sc_th_num = th_num
where
	th_name = 'CGV강남';
    
# CGV강남에 등록된 좌석 수를 조회하는 쿼리
select count(*)
from seat
		join
	screen on se_sc_num = sc_num
		join
	theater on sc_th_num = th_num
where
	th_name = 'CGV강남';
    
# 영화 웡카를 상영하고 있는 극장 이름을 조회하는 쿼리
select distinct 
	th_name, mo_title
from
	theater
		join
	screen on sc_th_num = th_num
		join
	schedule on sh_sc_num = sc_num
		join
	movie on mo_num = sh_mo_num
where
	mo_title = '웡카';
    
# CGV강남 1상영관에 웡카 상영 시간을 조회하는 쿼리
select
	mo_title as 영화, th_name as 극장, sh_date as 날짜, sh_time as 시간 
from
	schedule
		join
	screen on sh_sc_num = sc_num
		join
	theater on th_num = sc_th_num
		join
	movie on mo_num = sh_mo_num
where
	th_name = 'CGV강남' and sc_num = 1 and mo_title = '웡카';

# CGV강남 1상영관에 있는 좌석들을 조회하는 쿼리
select 
	se_name
from
	seat
		join
	screen on sc_num = se_sc_num
		join
	theater on th_num = sc_th_num
where
	th_name = 'CGV강남' and sc_name = 1; 

# 2024-02-09 10:30 CGV강남 1상영관에서 상영하는 웡카 예매 가능한 좌석을 조회하는 쿼리
select 
	sh_date, sh_time, se_name
from
	seat
		join
	screen on sc_num = se_sc_num
		join
	theater on th_num = sc_th_num
		join
	schedule on sh_sc_num = sc_num
where
	th_name = 'CGV강남' and sc_name = 1 and sh_date = '2024-02-09'and sh_time='10:30';
    
# CGV강남 1상영관 2월 9일 10:30 웡카를 예매한 좌석들을 조회

# 1번 스케줄을 예매한 좌석들을 조회
select 
	se_name
from
	schedule
		join
	ticketing on ti_sh_num = sh_num
		join
	ticketing_list on tl_ti_num = ti_num
		join
	seat on se_num = tl_se_num
where sh_num = 1;

# 1번 스케줄을 좌석 예약 상태를 확인을 하는 쿼리 (예약 되면 tl_num을 보여주고 아니면 null)
select
	se_name as 좌석, ifnull(tl_num, "좌석 예약 가능합니다")
from
	seat
		join
	screen on sc_num = se_sc_num
		join
	schedule on sh_sc_num = sc_num
		left join
	(select
		*
	from
		ticketing_list
			join
	ticketing on ti_num = tl_ti_num
    where
		ti_sh_num = 1)
    as t on tl_se_num = se_num
where
	sh_num = 1;

# abc123 회원이 예매한 영화 목록을 조회하는 쿼리
# ticketing과 schedule과 movie를 join하여 조회
select distinct
	mo_title as 영화제목
from
	ticketing
		join
	schedule on sh_num = ti_sh_num
		join
	movie on mo_num = sh_mo_num
where
	ti_me_id = 'abc123';
    
# 1번 상영시간(웡카, CGV강남 1상영관 10:30 스케줄)이 예매된 수량

# 내가 한것
select
	count(*) as 예매수량
from
	ticketing_list
		join
	seat on se_num = tl_se_num
		join
	screen on sc_num = se_sc_num
		join
	schedule on sh_sc_num = sc_num
where
	sh_num = 1;
# 강사님
select
	sum(ti_adult) + sum(ti_teenager) as 예매수량
from
	ticketing
where
	ti_sh_num = 1;
    
# 폴킹 감독이 감독으로 연출한 영화를 조회하는 쿼리
select
	mo_title
from
	movie
		join
	`join` on jo_mo_num = mo_num
		join
	movie_person on mp_num = jo_mp_num
		join
	`character` on ch_num = mp_ch_num
where mp_role = '감독' and ch_name = '폴킹';

# 장르별 등록된 영화 개수를 조회하는 쿼리 (outer join)
select
	ge_name, count(gi_mo_num)
from
	genre_include
		right join
	genre on ge_name = gi_ge_name
group by
	ge_name;
    
# 환타지로 등록된 모든 영화를 조회하는 쿼리
select
	gi_ge_name, mo_title
from
	movie
		join
	genre_include on gi_mo_num = mo_num
where gi_ge_name = '환타지';

# 상영 예정인 영화를 조회하는 쿼리
select
	*
from
	movie
where mo_date > '2024-02-08';

# 전체관람가 영화를 조회하는 쿼리
select
	*
from
	movie
where mo_ag_name = '전체관람가';

# 영화 제목에 카를 포함하는 영화를 조회하는 쿼리 (like % 이용)
select
	*
from
	movie
where mo_title like '%카%';

	


    
    