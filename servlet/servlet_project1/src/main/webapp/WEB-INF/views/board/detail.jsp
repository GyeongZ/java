<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세</title>

<!-- 부트스크랩5 css/js -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<jsp:include page="/WEB-INF/views/header.jsp"/>

<div class="container">
	<h3 class="mb-3 mt-3">게시글 상세</h3>
	<div>
		<div class="mb-3 mt-3">
	   		<label for="community" class="form-label">게시판 : </label>
	   		<input type="text" class="form-control" id="community" name="community" readonly value="${board.community.co_name}">
		</div>
		<div class="mb-3 mt-3">
	   		<label for="id" class="form-label">제목 : </label>
	   		<input type="text" class="form-control" id="title" name="title" readonly value="${board.bo_title}">
		</div>
		<div class="mb-3 mt-3">
	   		<label for="writer" class="form-label">작성자 : </label>
	   		<input type="text" class="form-control" id="writer" name="writer"readonly value="${board.bo_me_id}">
		</div>
		<div class="mb-3 mt-3">
	   		<label for="view" class="form-label">조회수 : </label>
	   		<input type="text" class="form-control" id="view" name="view" readonly value="${board.bo_view}">
		</div>
		<div class="mb-3 mt-3">
	   		<label for="content" class="form-label">내용 : </label>
	   		<textarea rows="10" class="form-control" id="content" name="content" readonly >${board.bo_content}</textarea>
		</div>
		<c:if test="${file != null}">
			<div class="mb-3 mt-3">
				<label for = "content" class="form-label">첨부파일 : </label>
				<a href="<c:url value="/download?filename=${file.fi_name}"/>" class="form-control" download="${file.fi_ori_name}">${file.fi_ori_name}</a>
			</div>
		</c:if>
		<a href="<c:url value="/board/list"/>" class="btn btn-outline-dark">목록으로</a>
		
		<!-- c;if로 삭제버튼은 로그인 한 사람만 볼 수 있도록 처리 -->
		<c:if test="${board.bo_me_id == user.me_id }">
			<a href="<c:url value="/board/delete?num=${board.bo_num }"/>" class="btn btn-outline-danger">삭제</a>	
			<a href="<c:url value="/board/update?num=${board.bo_num }"/>" class="btn btn-outline-danger">수정</a>	
		</c:if>	
	</div>
	
</div>
</body>
</html>