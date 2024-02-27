<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
<!-- 부트스크랩5 css/js -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="<c:url value="/"/>">경재의 첫페이지</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
      <ul class="navbar-nav">
      	<c:if test="${user == null }">
	        <li class="nav-item">
	          <a class="nav-link" href="<c:url value="/signup"/>">회원가입</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="<c:url value="/login"/>">로그인</a>
	        </li>
        </c:if>
        <li class="nav-item">
        	<a class="nav-link" href="<c:url value="/board/list"/>">게시글</a>
        </li>
       </ul>
    </div>
  </div>
</nav>

<div class="container">
	<form action="<c:url value="/board/insert" />" method="post">
	
		<div class="mb-3 mt-3">
			<label for = "community" class="form-label">게시판:</label>
			<select class="form-label" id="community" name="community">
				<c:forEach items="${list}" var="community">
				<option value="${community.co_num}">${community.co_name}</option>
				</c:forEach>
			</select>
			
		<div class="mb-3 mt-3">
	   		<label for="id" class="form-label">제목:</label>
	   		<input type="text" class="form-control" id="title" placeholder="제목" name="title">
		</div>
		<div class="mb-3 mt-3">
	   		<label for="writer" class="form-label">작성자:</label>
	   		<input type="text" class="form-control" id="writer" name="writer" value="${user.me_id}">
		</div>
		<div class="mb-3 mt-3">
	   		<label for="content" class="form-label">내용:</label>
	   		<textarea rows="10" class="form-control" id="content" name="content" placeholder="내용"></textarea>
		</div>
		<button class="btn btn-outline-warning col-12"> 글 등록 </button>
		
	</form>
	${list}
</div>

</body>
</html>