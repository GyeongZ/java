<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
<h1>테스트로 잘 오셨습니다.</h1>
	<!-- 객체.변수명을 호출하면 멤버변수가 호출되는 것이 아니라 멤버변수의 getter가 호출됨 -->
	<h3>아이디 : ${user.id }</h3>
	<h3>비밀번호 : ${user.pw }</h3>
	<h3>아이디와 비밀번호 : ${user.idPw }</h3>
	
	<!--
	축구, 야구, 농구, 테니스, 음악감상 중에서 취미를 선택해서 서버에 전송하고,
	서버에서는 화면에서 보낸 취미를 콘솔에 출력하고 메인 페이지로 리다이렉트하기
	- 특징 : 다중 선택이 가능하다.
	- 힌트 : 첨부 파일 예제
	-->
	<form action="<c:url value="/hobby"/>" method="get">
		<h5>당신의 취미는?</h5>
		<label>
			<input type="checkbox" name="hobby" value="축구">축구
		</label>		
		<label>
			<input type="checkbox" name="hobby" value="야구">야구
		</label>		
		<label>
			<input type="checkbox" name="hobby" value="농구">농구
		</label>		
		<label>
			<input type="checkbox" name="hobby" value="테니스">테니스
		</label>		
		<label>
			<input type="checkbox" name="hobby" value="음악감상">음악감상
		</label>		
		<button type="sumbit">전송</button>
	</form>
</body>
</html>