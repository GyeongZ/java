<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<!-- 부트스크랩5 css/js -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%=request.getContextPath() %>/">경재의 첫페이지</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath() %>/signup">회원가입</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath() %>/login">로그인</a>
        </li>
       </ul>
    </div>
  </div>
</nav>

<div class = "container">
	 <!-- 회원가입 정보를 입력받아 서버로 전송하는 코드를 작성 post 방식으로 전송 -->
	 <!-- 아이디, 비밀번호, 비밀번호 확인, 이메일을 입력받아 서버로 전송하는 코드 중 get과 post 중 선택해서 전송 -->
 	<form action="<%=request.getContextPath() %>/signup" method="post">
		
		<h2>회원가입</h2>
		<div class="mb-3 mt-3">
   		<label for="id" class="form-label">아이디:</label>
   		<input type="text" class="form-control" id="id" placeholder="아이디" name="id">
   		</div>
   		
		<div class="mb-3 mt-3">
   		<label for="pw" class="form-label">비밀번호:</label>
   		<input type="password" class="form-control" id="pw" placeholder="비밀번호" name="pw">
   		</div>
   		
		<div class="mb-3 mt-3">
   		<label for="pw" class="form-label">비밀번호 확인:</label>
   		<input type="password" class="form-control" id="pw2" placeholder="비밀번호 확인" name="pw2">
   		</div>
   		
		<div class="mb-3 mt-3">
   		<label for="email" class="form-label">이메일:</label>
   		<input type="text" class="form-control" id="email" placeholder="이메일" name="email">
   		</div>
		<button class="btn btn-outline-success col-12">회원가입</button>
	</form>
</div>
</body>
</html>