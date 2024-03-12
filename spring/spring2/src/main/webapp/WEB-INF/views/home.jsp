<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>

<br>
<form action="<c:url value="/"/>" method="get">
	<input type="text" name="id">
	<br>
	<button type="submit">전송</button>

</form>
</body>
</html>
