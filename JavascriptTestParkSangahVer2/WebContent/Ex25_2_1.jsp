<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	var obj = new Array();
	
	obj[0] = {
		name : '이환상',
		age : 29,
		job : '팀장'	
	}

	obj[1] = {
		name : '이찬양',
		age : 25,
		job : '대리'	
	}
	
	obj[2] = {
		name : '박상아',
		age : 33,
		job : '사원'	
	}
	
	for (var i = 0; i < obj.length; i++) {
		alert(obj[i].name + '\n' + obj[i].age + '\n' + obj[i].job);
	}
</script>

</head>

<body>



</body>
</html>