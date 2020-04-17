<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	var obj1 = '';
	var obj2 = '';

	obj1 = {
		productNum : 1,
		productName : '커피',
		price: 1800
	}
	
	obj2 = {
		productNum : 2,
		productName : '쥬스',
		price: 2000
	}
	
	var product1SummaryStr = '';
	var product2SummaryStr = '';
	
	product1SummaryStr = product1SummaryStr + obj1.productNum + '\n';
	product1SummaryStr = product1SummaryStr + obj1.productName + '\n';
	product1SummaryStr = product1SummaryStr + obj1.price;
	
	product2SummaryStr = product2SummaryStr + obj2.productNum + '\n';
	product2SummaryStr = product2SummaryStr + obj2.productName + '\n';
	product2SummaryStr = product2SummaryStr + obj2.price;
	
	alert(product1SummaryStr);
	alert(product2SummaryStr);
</script>

</head>

<body>



</body>
</html>