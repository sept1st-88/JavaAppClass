<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">

	/* 2차원 배열 */
	
	var testArr = [];
	
	testArr[0] = new Array();
	
	for (var i = 0; i < testArr.length; i++) {
		for (var n = 0; n < 3; n++) {
			testArr[i][n] = '' + i + ',' + n + ' ';
		}
	}
	
	for (var i = 0; i < testArr.length; i++) {
		for (var n = 0; n < testArr[i].length; n++) {
			document.write(testArr[i][n]);
		}
	}
	
	
</script>

</head>

<body>

   
   
</body>
</html>