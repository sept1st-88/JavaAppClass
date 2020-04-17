<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	숫자를 입력해주세요
	<input id='yourNumberObj' type="text">
	
	<input type="button" value="계산 버튼" onclick="calculateFnc()">
	버튼을 누르면 누군가 적은 숫자를 + 10 해준다
	
	<h1 id='h1Html'></h1>

</body>

<script type="text/javascript">

	/* innerHTML 추가 Ver. By. 홍 */

	function calculateFnc(){
		var inputText = document.getElementById('yourNumberObj').value;
		var h1Html = document.getElementById('h1Html');
		var sum = Number(inputText) + 10;
		
		alert(sum);
		h1Html.innerHTML = sum;
	}
</script>

</html>