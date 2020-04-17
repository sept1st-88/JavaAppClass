<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">
   function callGuGudanBtn(txtDan){      
      if(txtDan.substring(0,txtDan.length-1) < 10){
         dan = txtDan.charAt(0);   
      }else if(txtDan.substring(0,txtDan.length-1) >= 10 && txtDan.substring(0,txtDan.length-1) < 100){
         dan = txtDan.substring(0,2);
      }
      
      var resultStr = '';
      for (var i = 0; i < 9; i++) {
         resultStr = resultStr + (dan + ' * ' + ( i + 1 ) + ' = ' + dan * (i+1)) + '\n';
      }
      alert(resultStr);
   }
</script>

</head>

<body>

	<button onclick="callGuGudanBtn('2단');">2단</button>
	<button onclick="callGuGudanBtn('3단');">3단</button>
	<button onclick="callGuGudanBtn('11단');">11단</button>
   
</body>


</html>