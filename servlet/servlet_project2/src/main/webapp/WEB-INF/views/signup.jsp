<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"/>
<div class="container">
	<form action="<c:url value="/singup"/>" metod="post">
		<h3 class="mb-3 mt-3">회원가입</h3>
		<div class="mb-3 mt-3">
			<label for="id" class="form-label">아이디</label>
			<input type="text" class="form-control" id="id" placeholder="아이디를 입력하세요." name="id">
		</div>
		<div class="mb-3 mt-3">
			<button type="button" id=idcheck class = "btn btn-outline-success col-12">아이디 중복 검사</button>
		</div>
		<div class="mb-3 mt-3">
			<label for="pw" class="form-label">비밀번호</label>
			<input type="password" class="form-control" id="pw" placeholder="비밀번호를 입력하세요." name="pw">
		</div>
		<div class="mb-3 mt-3">
			<label for="pw2" class="form-label">비밀번호 확인</label>
			<input type="password" class="form-control" id="pw2" placeholder="비밀번호를 한번 더 입력하세요." name="pw2">
		</div>
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">이메일</label>
			<input type="text" class="form-control" id="email" placeholder="이메일을 입력하세요." name="email">
		</div>
		<button type="submit" class="btn btn-outline-success col-12">회원가입</button>
	</form>
</div>
<script src="//code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
	let flag = false;
	$("#idCheck").click(function(){
		
		let id = $("[name=id]").val();

		$.ajax({ //j쿼리에서 제공하는 메서드
			url : '<c:url value="/id/check"/>',
			method : 'get',
			async : true, //동기/비동기 선택, true:비동기통신(앞에 통신 작업이 끝나기전에 실행), false:동기통신(앞에 작업이 끝나는걸 기다려서 실행)
			data : {
				"id" : id //속성이름 : 변수명
			},
			success : function(data){
				if(data){
					alert("사용 가능한 아이디입니다.");
					flag = true;
				}else{
					alert("이미 사용중인 아이디입니다.");
				}
			},
			error : function(a, b, c){
				console.error("예외 발생");
			}
		}); //ajax 끝
	}); //click 끝
	
	$("form").submit(function(){
		if(!flag){
			alert("아이디 중복 검사를 해야합니다.");
			return false;
		}
	})
	$("[name=id]").change(function(){
		flag = false;
	})
</script>
</body>
</html>