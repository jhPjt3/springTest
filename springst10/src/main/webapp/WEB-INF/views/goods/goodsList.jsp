<%@page import="com.mvcproject.goods.controller.model.vo.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><th>상품코드</th><th>상품이름</th><th>가격</th><th>색상</th><th>삭제</th></tr>
<c:forEach var="goods" items="${goodsList }">
	<tr>
	<td><a href="goodsView.do?code=${goods.code }">${goods.code }</a></td><td>${goods.name } </td>
	<td>${goods.price}</td><td>${goods.color }</td><td><a href="goodsDelete.do?code=${goods.code }">삭제</a></td> <!-- 이름/비번 출력, id클릭하면 memberView.do로 이동 -->
	</tr>

</c:forEach>

</table>
<div id="btnIns">
<a href = "goodsForm.do">입력하기</a> <!-- insert로 보내줌 -->
</div>
</body>
</html>