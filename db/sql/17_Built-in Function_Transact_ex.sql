# 내장 함수 - 문자열 함수
SELECT LENGTH("안녕"); # 바이트 수를 리턴
SELECT CHAR_LENGTH("안녕하세요"); # 글자수를 리턴
SELECT CONCAT("%", "안녕", "%"); # 문자열들을 이어 붙여서 리턴
SELECT FIELD("안녕", "HI", "HELLO", "안녕", "안녕하세요", "안녕"); # "안녕" 이 있는 위치를 리턴. 1부터 시작, 없으면 0
SELECT INSTR("안녕하세요", "안녕"); # 안녕의 시작 위치를 리턴, 1부터 시작
SELECT LOCATE("안녕", "안녕하세요"); # 안녕의 시작 위치를 리턴, 1부터 시작
SELECT FORMAT(10000000000.123, 2); # 소수점 2째자리까지 표현. 3자리마다 ',' 추가
SELECT BIN(31), OCT(31), HEX(31); # BIN 2진수, OCT(8진수), HEX(16진수)
# 16진수는 색상 표현할때 사용할 수 있다.
SELECT CONCAT(LPAD(HEX(255),2,'0'),LPAD(HEX(0),2,'0'),LPAD(HEX(0),2,'0')) AS '색상코드';
SELECT INSERT('C의 정석',1,1, '수학'); # 1번지부터 1글자를 제거하고 ('C'를 제거), 주어진 문자열 ('수학')을 추가
SELECT LEFT("안녕하세요.", 2); # 왼쪽 기준으로 2글자만 리턴
SELECT RIGHT("안녕하세요.", 4); # 오른쪽 기준으로 4글자만 리턴
SELECT LOWER("ABCdef"), UPPER("ABCdef"); # 대소문자로 리턴
SELECT LPAD("1", 3, "0"), RPAD("1", 3, "0"); #
SELECT REPEAT("안녕", 3); # 3번 반복한다.
SELECT REPLACE("C의 정석", "C", "수학"); # 단어를 골라서 교체
SELECT REVERSE("ABCDEF");
SELECT SUBSTRING("자바의 정석", 1, 2);

# 내장 함수 - 날짜 / 시간 함수
SELECT ADDDATE(NOW(), 5); # 5일 뒤 시간 리턴
SELECT SUBDATE(NOW(), 2); # 2일 전 시간 리턴
SELECT ADDTIME("11:30", "2:00:00"); # 적은 시간에서 "2:00:00" 를 추가
SELECT SUBTIME("11:30", "1:00:00"); # 적은 시간에서 "1:00:00" 를 뺀다
SELECT YEAR(NOW()), MONTH(NOW()), DAY(NOW()); #
SELECT DATE(NOW()), TIME(NOW());
SELECT DATEDIFF("2024-03-02", NOW()); # 2024년3월2일에서 오늘 날짜를 뺀 것
SELECT TIMEDIFF("11:30", "9:00");
SELECT DATE_ADD(NOW(), INTERVAL 1 DAY); # 오늘 기준으로 하루 뒤 날
SELECT DATE_ADD(NOW(), INTERVAL 3 WEEK); # 오늘 기준으로 3주 뒤 날
SELECT DATE_ADD(NOW(), INTERVAL 10 YEAR); # 오늘 기준으로 10년 뒤 날
SELECT DATE_ADD(NOW(), INTERVAL "1 1" YEAR_MONTH); # 

# 내장 함수 - 수학 함수
SELECT FLOOR(1.234), CEIL(1.23), ROUND(1.23), ABS(-1); #

