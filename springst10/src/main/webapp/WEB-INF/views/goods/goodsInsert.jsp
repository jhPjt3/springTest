<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="insertForm" action="goodsInsert.do" method="get">
<table align="center" border="1"> <!-- 이 11행은 주로 css로 처리 -->
<tr>
	<td>상품코드</td><td><input type="text" name="code"></td>
</tr>
<tr>
	<td>이름</td><td><input type="text" name="name" ></td>
</tr>
<tr>
	<td>가격</td>
	<td><input type="text" name="price"></td>
</tr>
<tr>
	<td>색상</td>
	<td><input type="text" name="color"></td>
</tr>
<tr>
<td colspan="2" ><input type="submit" value="입력"></td></tr><!-- 보내야 하니까 submit-->
</table>

</form>
</body>
</html>