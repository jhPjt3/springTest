<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뷰에서 수정할 수 있게 보여지는 부분</title>
</head>
<body>
<form name="insertForm" action="memberUpt.do" method="get">
<table align="center" border="1"> <!-- 이 11행은 주로 css로 처리 -->
<tr>
	<td>아이디</td><td><input type="text" name="id" value="${member.id }" readonly = "readonly"></td>
</tr>
<tr>
	<td>이름</td><td><input type="text" name="name" value="${member.name }"></td>
</tr>
<tr>
	<td>비번</td>
	<td><input type="password" name="passwd" value="${member.passwd }"></td>
</tr>
<tr>
<td colspan="2" ><input type="submit" value="수정"></td></tr><!-- 보내야 하니까 submit-->
</table>

</form>
</body>
</html>