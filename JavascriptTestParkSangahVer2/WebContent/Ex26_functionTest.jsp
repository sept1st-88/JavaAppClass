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
		var htmlStr = '';
		
		for (var i = 2; i <= 9; i++) {
			result = num * i;
			htmlStr = htmlStr + result + '\n';
		}
		
		/* danBox.innerHTML = htmlStr; */
		alert(htmlStr);
	}
	
	
</script>

</head>

<body>

	<button onclick="masterGugudanFnc(2);">2단</button>
	<button onclick="masterGugudanFnc(3);">3단</button>
	<button onclick="masterGugudanFnc(4);">4단</button>
	<!-- <div id='danBox'></div> -->
   
</body>


</html>