<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">
	var num = 0;
	var result = 0;
	
	function masterGugudanFnc(num){
		result = 100 + Number(num.trim());
		alert(result);
	}
</script>

</head>

<body>

	<button onclick="masterGugudanFnc('     2    ');">2단</button>
   
</body>


</html>