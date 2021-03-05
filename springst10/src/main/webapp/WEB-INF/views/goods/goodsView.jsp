<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 뷰</title>
</head>
<body>
<table align="center" border="1"> <!-- 이 11행은 주로 css로 처리 -->
<tr>
	<td>상품코드</td><td><input type="text" name="id" value="${goods.code}" readonly = "readonly"></td>
</tr>
<tr>
	<td>이름</td><td><input type="text" name="name" value="${goods.name }"></td>
</tr>
<tr>
	<td>가격</td>
	<td><input type="text" name="price" value="${goods.price }"></td>
</tr>
<tr>
	<td>색상</td>
	<td><input type="text" name="color" value="${goods.color }"></td>
</tr>
<tr>
<td colspan="2" ><input type="submit" value="수정"></td></tr><!-- 보내야 하니까 submit-->
</table>

</form>
</body>
</html>