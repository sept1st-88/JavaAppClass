<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	var member1 = '';
	var member2 = '';
	var member3 = '';

	member1 = {
		name : '이환상',
		age : 29,
		job : '팀장'
	}
	
	member2 = {
		name : '이찬양',
		age : 25,
		job : '대리'
	}
	
	member3 = {
		name : '박상아',
		age : 33,
		job : '팀팀장'
	}
	
	var member1SummaryStr = '';
	var member2SummaryStr = '';
	var member3SummaryStr = '';
	
	member1SummaryStr = member1SummaryStr + member1.name + '\n';
	member1SummaryStr = member1SummaryStr + member1.age + '\n';
	member1SummaryStr = member1SummaryStr + member1.job;
	
	member2SummaryStr = member2SummaryStr + member2.name + '\n';
	member2SummaryStr = member2SummaryStr + member2.age + '\n';
	member2SummaryStr = member2SummaryStr + member2.job;
	
	member3SummaryStr = member3SummaryStr + member3.name + '\n';
	member3SummaryStr = member3SummaryStr + member3.age + '\n';
	member3SummaryStr = member3SummaryStr + member3.job;
	
	alert(member1SummaryStr);
	alert(member2SummaryStr);
	alert(member3SummaryStr);
</script>

</head>

<body>



</body>
</html>