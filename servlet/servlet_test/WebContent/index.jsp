<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 조회</title>
</head>
<body>
<h1>게시글 조회</h1>
<form action="<c:url value="/servlet__test/selectBoard"/>">
	<input type="text" name="boardNum">
	<button type="submit">조회</button>
</form>
</body>
</html>