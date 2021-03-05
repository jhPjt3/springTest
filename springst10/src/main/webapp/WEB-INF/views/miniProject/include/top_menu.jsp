<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--<c:url var='root' value='/'/>-->
<!-- 상단 메뉴 부분 -->
<nav class="navbar navbar-expand-md bg-dark navbar-dark fixed-top shadow-lg">
	<a class="navbar-brand" href="testMain.do">SoftCampus</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
	        data-target="#navMenu">
		<span class="navbar-toggler-icon"></span>        
	</button>
	<div class="collapse navbar-collapse" id="navMenu">
		<ul class="navbar-nav">
		<!-- 자유 게시판만 설정. 자유게시판만 다룰 것임 -->
			<li class="nav-item">
				<a href="testBoardMain.do" class="nav-link">자유게시판</a>
			</li>
		</ul>
		
		<ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a href="testLogin.do" class="nav-link">로그인</a>
			</li>
			<li class="nav-item">
				<a href="testJoin.do" class="nav-link">회원가입</a>
			</li>
			<li class="nav-item">
				<a href="testModify.do" class="nav-link">정보수정</a>
			</li>
			<li class="nav-item">
				<a href="testLogout.do" class="nav-link">로그아웃</a>
			</li>
		</ul>
	</div>
</nav>