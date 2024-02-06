use shoppingmall;

# 이것만은! 필수! 꼭! 다 할 줄 알도록!

# 모든 제품을 조회하는 쿼리
select * from product;

# 모든 카테고리를 조회하는 쿼리
select * from category;

# 제품별 카테고리를 조회. 카테고리, 제품을 조회
select
	ca_name as "카테고리 이름", pr_title as "제품 이름"
from
	product
		join
    category on ca_num = pr_ca_num;

# 기타 카테고리에 포함된 모든 제품을 조회
select 
	ca_name, product.*
from
	product
		join
	category on ca_num = pr_ca_num
where ca_name = "기타";

#abc123회원이 주문한 제품 목록을 조회
-- select or_me_id
-- from
-- 	`order`
-- 		join
-- 	member on or_me_id = me_id
--     where me_id = "abc123";
    
select pr_title
from
	`order`
		join
	product on pr_code = or_pr_code
where or_me_id = 'abc123';

# 제품별 판매수량을 조회하는 쿼리

-- select or_amount
-- from
-- 	`order`
-- 		join
-- 	product on ca_num = pr_ca_num
-- where or_state = "결제완료"; 내가 한것

select
	product.*, IFNULL(SUM(or_amount), 0) AS "판매수량"
from
	`order`
		right join
	product on pr_code = or_pr_code
where or_state not in("반품","환불")
group by pr_code;

# 인기 제품 조회. (인기 제품은 누적 판매량을 기준으로 상위 5개 제품) (ORDER BY, LIMIT 이용하여 작업)
select
	product.*, IFNULL(SUM(or_amount), 0) AS "판매수량"
from
	`order`
		right join
	product on pr_code = or_pr_code
where or_state not in("반품","환불")
GROUP BY pr_code
ORDER BY 판매수량 DESC, pr_price ASC
LIMIT 0,5;

# 가격이 제일 비싼 제품을 조회
SELECT pr_title, pr_price AS "가격순 조회"
FROM
	product
ORDER BY pr_price DESC
LIMIT 0, 1;