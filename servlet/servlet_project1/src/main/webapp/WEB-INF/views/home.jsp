<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<!-- 부트스크랩5 css/js -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	
<jsp:include page="/WEB-INF/views/header.jsp"/>

<div class="container">
	<h1>메인 페이지입니다.</h1>
	
	<c:forEach begin="1" end="10" var="i" step="2">
	${i },
	</c:forEach>
	
	<c:set var = "name" value = "홍길동"/>
	${name}
	
	<!-- 같다 == : (eq), 같지 않다 !== :(ne) -->
	<c:if test='${name == "홍길동" }'>홍길동입니다.</c:if>
	
	<c:choose>
		<c:when test='${name eq "홍길동" }'>홍길동입니다.</c:when>
		<c:otherwise>홍길동이 아닙니다.</c:otherwise>
	</c:choose>
	
	<!-- 서버에서 보낸 id가 "abc"로 되어 있으면 -->
	<input type = "text" value= "${id }">
	
	<br>
	
	<c:forTokens items="a|b|c|d" delims="|" var = "ch">${ch}</c:forTokens>
	
	<!-- c:url 자주 사용함! -->
	
	<br>
	
	<c:url value = "/">
		<c:param name="name" value="홍길동"/>
		<c:param name="age" value="30"/>
	</c:url>
	4{url
		
	
</div>

<!--
	<%
	//자바 코드도 넣을 수 있음
	int num = 10;
	%>

	<h1>메인 페이지입니다.</h1>
	<a href="<%=request.getContextPath() %>?data=안녕">데이터 전송</a>
	 --> 
	<!-- <form action="<%=request.getContextPath() %>">
		<h2>from태그 get방식 전송</h2>
		<input type="text" name="id">
		<button>전송</button>
	</form>
	-->
	<!--
	<h1><%=num %></h1>
	<h1><%=request.getContextPath() %></h1>
	<a href="<%=request.getContextPath() %>/login">로그인으로</a>
	-->
	<!-- /login을 처리하는 서블릿을 추가한 후 login.jsp와 연결하는 작업-->
	<!-- <br> -->
	<!-- <a href="<%=request.getContextPath() %>/signup">회원가입으로</a> -->
	<!-- /signup을 처리하는 서블릿을 추가한 후 signup.jsp와 연결하는 작업-->
	<!--
	<h1>서버에서 보낸 나이 : ${age}</h1>
	 서버에서 보낸 나이 30이였는데 자바스크립트로 수정한것이 수정되게 하려면 `나이 : \${5}` => 역따옴표, 역슬래쉬 사용 
	<script type="text/javascript">
		let age = 20;
		let str = `나이 : \${age}`;
		console.log(str);
	</script>
	-->
		
</body>
</html>