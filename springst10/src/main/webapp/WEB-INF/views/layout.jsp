<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
   #wrap {border:1px solid pink; width:600px; height: 500px; margin:auto;}
   #header {height:50px; background:pink; }
   #footer {height:50px; background:skyblue; }
   #main {margin-top:10px;}
   #main_left {float:left; height:300px; }
   #main_right {float:right;}
</style>
</head>
<body>
<div id="wrap"> <!-- div나 table 또는 html5에서는 header footer nav section article -->
   <div id="header"><%@ include file="sub/header.jsp" %></div>  <!-- 경로지정시 레이아웃 파일을 views에 넣고 sub아래에 푸터 헤더 등 파일 만들고 include file에 경로지정해서 파일 넣기  -->
   <div id="main">												<!-- run시킬때는 springst14폴더로 -->
   <div id="margin-left"><%@ include file="sub/left.jsp" %></div>
   <div id="main_right"><%@ include file="sub/right.jsp" %></div>
   </div>
   <div style="clear: both">
      <div id="footer"><%@ include file="sub/footer.jsp" %></div>
   </div>
</div>
</body>
</html>