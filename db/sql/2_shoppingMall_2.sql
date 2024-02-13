# abc123 회원이 주문 내역을 확인하는 쿼리
SELECT * FROM `ORDER` WHERE OR_ME_ID = "abc123";

# 기타(1)에 포함된 모든 제품을 조회하는 쿼리
SELECT * FROM product WHERE PR_CA_NUM = 1;

# 기타,자동차, 의류에 포함된 모든 제품을 조회하는 쿼리
-- SELECT * FROM PRODUCT WHERE PR_CA_NUM = 3,5; (오답 / 아래 2가지의 방법이 있음)
SELECT * FROM PRODUCT WHERE PR_CA_NUM = 1 OR PR_CA_NUM = 3 OR PR_CA_NUM = 5;
SELECT * FROM PRODUCT WHERE PR_CA_NUM IN (1, 3, 5);

# 등록된 제품들의 카테고리 번호를 조회하는 쿼리 (DISTINCT : 중복된 값들을 제거해줌. 전체를 검색하면 기본키가 있어서 중복되진않은 결과를 볼 수 있다.)
SELECT DISTINCT PR_CA_NUM FROM PRODUCT;

# 가격이 높은 순으로 제품을 정렬하는 쿼리 (뒤에 PR_CODE 처럼 붙여서 가격이 같은 경우, 코드 순으로 나올 수 있도록 추가 해주었음.)
SELECT * FROM PRODUCT ORDER BY PR_PRICE DESC, PR_CODE;

# 제품 페이지에서 1페이지에 있는 제품을 조회하는 쿼리 (한 페이지에 제품은 2개 조회)
SELECT * FROM PRODUCT LIMIT 0, 2;

# 2페이지에 있는 제품을 조회하는 쿼리 (한 페이지에 제품은 2개 조회)
# 2번지 = 컨텐츠개수 * (2페이지 -1) => 번지가 나옴
SELECT * FROM PRODUCT LIMIT 2, 2;

# 10페이지에 있는 제품을 조회하는 쿼리
# 10번지 = 컨텐츠개수 * (10페이지 -1) => 번지가 나옴
SELECT * FROM PRODUCT LIMIT 18, 2;

# 카테고리 별 등록된 제품의 개수를 조회
SELECT
	PR_CA_NUM AS '카테고리 번호', COUNT(PR_CA_NUM) AS '제품수'
FROM
	PRODUCT
GROUP BY
	PR_CA_NUM;
    
# 카테고리 별 등록된 제품의 개수가 2개 이상인 카테고리를 조회
SELECT
	PR_CA_NUM AS '카테고리 번호', COUNT(PR_CA_NUM) AS '제품수'
FROM
	PRODUCT
/*WHERE
	COUNT(PR_CA_NUM) >= 2  직계함수라서 안됨*/
GROUP BY
	PR_CA_NUM
HAVING
	COUNT(PR_CA_NUM) >= 2;
    
# abc123 회원이 지금까지 주문한 총 금액을 조회하는 쿼리
SELECT
	OR_ME_ID AS '구매한 사람', SUM(OR_TOTAL_PRICE) AS '총 구매금액'
FROM
	`ORDER`
WHERE
	OR_ME_ID = 'abc123' AND OR_STATE NOT IN ("반품", "환불")
GROUP BY
	OR_ME_ID;
    
# 제품별 판매된 개수를 조회하는 쿼리 (순서 중요! SELET, FROM, WHERE 다음에 GROUP BY, HAVING, ORDER BY)
SELECT
	OR_PR_CODE AS '판매된 제품 코드' , SUM(OR_AMOUNT) AS '판매 개수'
FROM
	`ORDER`
WHERE OR_STATE NOT IN ("반품", "환불")
GROUP BY OR_PR_CODE;

SELECT * FROM PRODUCT;

# 제품별 카테고리명을 조회하기 위한 INNER JOIN 쿼리
SELECT *
FROM
	PRODUCT
JOIN
	CATEGORY
ON
	product.PR.CA_NUM = CATEGORY.CA_NUM;
    # PRODUCT의 외래키를 CATEGORY의 기본키와 연결
    # 속성명이 다르면 테이블명을 생략할수 있다. (PR.CA_NUM = CA_NUM;)
    
    SELECT PRODUCT.*, CA_NAME  # 프로덕트 모두와 카테고리 이름만
FROM
	PRODUCT
JOIN
	CATEGORY
ON
	PR.CA_NUM = CA_NUM;
    
# 기타로 등록된 제품들을 조회하는 쿼리
SELECT
	*
FROM
	PRODUCT
		JOIN
	CATEGORY ON PR_CA_NUM = CA_NUM
WHERE
	CA_NAME = "기타";
    
# abc123 회원이 주문한 제품목록을 조회하는 퀘리
SELECT distinct
	PR_TITLE AS 제품명
FROM `ORDER`
	JOIN
		PRODUCT ON OR_PR_CODE = PR+CODE
	WHERE
    OR_ME_ID = "abc123"  AND OR_STATE NOT IN("환불", "반품");
    
# 각 제품별 판매된 개수(판매된 제품에 한해서)
-- select
-- 	PR_TITLE, SUM(OR_AMOUNT)
-- FROM
-- 	`ORDER`
-- 		JOIN
-- 	PRODUCT ON  OR_PR_CODE = RR

# 각 제품 별 판매된 개수(모든 제품에 한해서)
SELECT
		#IFNULL (속성, 값A) : 속성이 NULL인 경우 NULL 대신 A로 변경
		PR_TITLE, IFNULL(SUM(OR_AMOUNT), 0) 
FROM
	PRODUCT
		LEFT JOIN
	`ORDRER` ON PR_CODE = OR_PR_CODE
WHERE
	OR_STATE IS NULL OR OR_
    


