<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이 파일은 강사님 수업 참고 한 것이라 삭제해도 됨</title>
</head>
<body>
<form action="memberUpt.do" method="get">
<table align="center" border="1"> <!-- 이 11행은 주로 css로 처리 -->
<tr>
	<td>아이디</td><td><input type="text" name="id" value=""></td><!--name을 vo에 있는 거와 맞추기 -->
</tr>
<tr>
	<td>이름</td><td><input type="text" name="name"></td>
</tr>
<tr>
	<td>비번</td>
	<td><input type="password" name="passwd"></td>
</tr>
<!-- 남여구분: 남<input type="radio" name="gender" value="M">여<input type="radio" name="gender" value="F"><br/> -->
<!-- 나이:<input type="text" name="age" value="0"><br/> -->
<tr>
<td colspan="2" ><input type="submit" value="등록"></td></tr>
</table>

</form>
</body>
</html>