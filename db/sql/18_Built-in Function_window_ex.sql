# 내장 함수 - 원도우 함수 

# 쇼핑몰을 이용한 윈도우 함수 예제
USE SHOPPINGMALL;
# 제품을 가격순으로 정렬 ROW_NUMBER
SELECT
	ROW_NUMBER() OVER(ORDER BY PR_PRICE DESC) AS '순서', PRODUCT.*
FROM
	PRODUCT;
    # 값이 같더라도 다른 번호를 부여하는 방식
    
# 제품을 가격순으로 정렬 RANK
SELECT
	RANK() OVER(ORDER BY PR_PRICE DESC) AS '금액순', PRODUCT.*
FROM
	PRODUCT;
    
# 제품을 가격순으로 정렬 DENSE_RANK
SELECT
	DENSE_RANK() OVER(ORDER BY PR_PRICE DESC) AS '순서', PRODUCT.*
FROM
	PRODUCT;

# 윈도우 함수 - 순위함수
# 검색 결과 전체를 지정된 그룹으로 분할하여 번호를 할당
# 제품을 비싼 제품, 싼 제품으로 정렬 NTILE (즉 2가지 그룹으로 나누었다)
SELECT
	NTILE(2) OVER(ORDER BY PR_PRICE DESC) AS '그룹', PRODUCT.*
FROM
	PRODUCT;
    
# 가장 비싼 제품들을 조회하는 쿼리 (DENSE_RANK)를 사용
SELECT
	*
FROM
(SELECT
	DENSE_RANK() OVER(ORDER BY PR_PRICE DESC) AS 'pr_rank', PRODUCT.*
FROM
	PRODUCT
) AS RANKED_PRODUCT
WHERE
	PR_RANK = 1;