<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- 디렉티브 써주기. core는 반복문 할 때 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<%--  ${memberList }
<c:forEach var="i" begin="1" end="3">  <!-- var에 값이?담김?, el을 이용해 출력 -->
i= ${i}
<c:forEach>는 목록을 입력 받아 목록의 갯수만큼 반복하는 반복문. var변수명, items콜렉션 객체
--%>

<tr><th>ID</th><th>이름</th><th>비번</th><th>삭제</th></tr>
<c:forEach var="member" items="${memberList }">
	<tr>
	<td><a href="memberView.do?id=${member.id }">${member.id }</a></td><td>${member.name } </td>
	<td>${member.passwd }</td><td><a href="memberDel.do?id=${member.id }">삭제</a></td> <!-- 이름/비번 출력, id클릭하면 memberView.do로 이동 -->
	
</tr>

</c:forEach>

</table>
<div id="btnIns">
<a href = "memberForm.do">입력하기</a> <!-- insert로 보내줌 -->
</div>
</body>
</html>