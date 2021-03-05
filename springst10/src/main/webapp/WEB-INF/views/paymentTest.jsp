<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"    src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$("#check_module").click(function() {
		var IMP = window.IMP; 
		IMP.init('imp34761928');
		
		IMP.request_pay({
			pg : 'inicis',
			pay_method: 'card',
			merchant_uid: 'merchant_' + new Date().getTime(),
			name : '주문명 : 결제 테스트',
			amount: 1, // 가격
			buyer_email: "iamport@siot.do",
			buyer_name: '구매자 이름',
			buyer_tel : '01012345678',
			buyer_addr : '서울특별시 ',
			buyer_postcode: '123-456',
			m_redirect_url: 'https://www.yourdomain.com/payments/complete'
		}, function(rsp) {
			console.log(rsp);
			if (rsp.success) {
				var msg = '결제가 완료 되었습니다';
				msg += '고유 ID : ' + rsp.imp_uid;
				msg += '결제 금액 : ' + rsp.paid_amount;
				msg += '카드 승인 번호 : ' + rsp.apply_num;
			} else {
				var msg = '결제에 실패하였습니다.';
				msg += '에러내용 : ' + rsp.error_msg;
			}
			alert(msg);
		});
	});
</script>
</head>
<body>
<p>
	<h3>아임 서포트 결제 모듈 테스트 해보기</h3>
	<button id="check_module" type="button">아임 서포트 결제 모듈 테스트 해보기</button>
</p>
</body>
</html>