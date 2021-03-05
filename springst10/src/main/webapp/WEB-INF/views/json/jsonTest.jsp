<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"    src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
// 페이지가 로딩되면 한 번 실행
	$(function() {
		$('#test1').on('click', function() {
			// 컨트롤러에서 데이터 받아오기
			$.ajax({
				url:'test1.do',
				type:'post',
				data: {name: "신사임당", age : 47},
				success: function(result) {
					if(result == 'ok') {
						alert('성공')
					} else {
						alert('전송 실패!')
					}
				},
				error : function(request, status, errorData) {
					alert("error code : " + requeest.status + "\n" // 500(컨트롤러-자바 에러), 404(url에러)
							+ "message : " + request.responseText	// 에러가 난 원인 나옴
							+ "\n" + "error : " + errorData)
				}
			});
		});
		//
		$('#test2').on('click',function() {
			$.ajax({
				url : 'test2.do',
				type : 'post',
				dataType : 'json',
				success : function(data) {
					$('#d2').html(
						"번호  : " + data.no
						+ "<br>제목 : " + data.title
						+ "<br>작성자 : " + decodeURIComponent(data.writer) //Controller에서(서버에서) 인코딩 해서 넘겼으므로
						+ "<br>내용 : " + decodeURIComponent(data.content.replace(/\+/g," ")) //공백 있으면 지우는 정규표현식
					);
				}
			});
		});
		//
		$('#test3').on('click',function() {
			$.ajax({
				url : 'test3.do',
				type : 'post',
				dataType : 'json',
				success : function(data) {
					//전달받은 data를 JSON 문자열 형태로 바꾸기
					var jsonStr= JSON.stringify(data); 
					var json = JSON.parse(jsonStr);
					//#d3의 <html>내용 있으면 values에 넣기
					var values = $('#d3').html(); 
					
					for(var i in json.list) {
						values += json.list[i].userId + ", "
							+ json.list[i].userPwd + ", "
							+ decodeURIComponent(json.list[i].userName) + ", "
							+ json.list[i].age + ", "
							+ json.list[i].email + "<br>";
						// values += '<li>'+json.list[i].userId+'</li>';
					}
					// values에 담은 값을 #d3 div에 출력한다
					$('#d3').html(values);
				},
				error : function(request, status, errorData) {
					alert("error code : " + requeest.status + "\n" // 500(컨트롤러-자바 에러), 404(url에러)
							+ "message : " + request.responseText	// 에러가 난 원인 나옴
							+ "\n" + "error : " + errorData)
				}
			});
		});
		// 선언한 jsonView를 사용해 Controller에서 Map객체를 전송하여 화면에 출력하자
		$("test4").on("click", function(){
			// 컨트롤러에서 맵 객체를 jsonView를 사용해 json객체로 리턴받아서 출력 처리
			$.ajax({
				url : "test4.do",
				type : 'post',
				dataType : 'json',
				success : function(data) {
					$('#d4').html('받은 맵 안의 samp 객체 정보 확인<br>'
							+'이름 : '+ decodeURIComponent(data.samp.name)
							+'나이 : ' + data.samp.age);
				},
				error : function(request, status, errorData) {
					alert("error code : " + requeest.status + "\n" // 500(컨트롤러-자바 에러), 404(url에러)
							+ "message : " + request.responseText	// 에러가 난 원인 나옴
							+ "\n" + "error : " + errorData)
				}
			});
		});
	});
</script>
</head>
<body>
<input type="button" id="test1" value="ajax test1">
<input type="button" id="test2" value="ajax test2">
<input type="button" id="test3" value="ajax test3">
<input type="button" id="test4" value="ajax test4">
<div id="d2"></div>
<div id="d3"></div>
<div id="d4"></div>
</body>
</html>