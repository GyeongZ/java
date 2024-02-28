<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
<!-- 부트스크랩5 css/js -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"/>
<div class=>
</div>
<div class="mb-3 mt-3">
	   		<label for="id" class="form-label">제목:</label>
	   		<input type="text" class="form-control" id="title" placeholder="제목" name="title">
		</div>
		<div class="mb-3 mt-3">
	   		<label for="writer" class="form-label">작성자:</label>
	   		<input type="text" class="form-control" id="writer" name="writer" value="${user.me_id}" readonly>
		</div>
		<div class="mb-3 mt-3">
	   		<label for="content" class="form-label">내용:</label>
	   		<textarea rows="10" class="form-control" id="content" name="content" placeholder="내용"></textarea>
		</div>
		<button class="btn btn-outline-warning col-12"> 글 수정 </button>
		
	</form>
</body>
</html>