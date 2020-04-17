<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>구구단</title>
</head>
<body>

<!-- 단만 있는 배열, 결과값이 있는 배열 -->

</body>

<script type="text/javascript">

	var danArr = new Array();
	var resultArr = new Array();
	var count = 0;
	
	for (var i = 2; i <= 9; i++) {
		danArr[i] = i;
		for (var j = 1; j <= 9; j++) {
			resultArr[count] = i * j;
			count++;
		}
	}
	
	count = 0;
	
	for (var i = 2; i <= 9; i++) {
		document.write(danArr[i] + '단');
		document.write('<br/>');
		for (var j = 1; j <= 9; j++) {
			document.write(i + '*' + j + '=' + resultArr[count] + ' ');
			count++;
		}
		document.write('<br/>');
	}
	
	/* document.write(resultArr[71]); */
	
</script>
</html>