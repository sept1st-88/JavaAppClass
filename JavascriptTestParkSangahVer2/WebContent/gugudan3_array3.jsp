<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   
   var danArr = ['2단', '3단', '4단', '5단', '6단', '7단', '8단', '9단'];
   var guguArr = [2, 3, 4, 5, 6, 7, 8, 9];
   var result = new Array();
   var count = 0;
   
   function setGugudan(){
      for (var i = 0; i < 9; i++) {
         for (var j = 0; j < guguArr.length; j++) {
            result[count] = guguArr[j] * ( i + 1 );
            count++;
         }
      }
   }
   
   function getGugudan(){
      count = 0;
      var objList = document.getElementById('setDisplay');
      
      for (var i = 0; i < danArr.length; i++) {
         objList.innerHTML += danArr[i] + ' '; 
         
         if(i == danArr.length-1){
            objList.innerHTML += '<br/>';
         }
      }
      
      for (var i = 0; i < 9; i++) {
         
         for (var j = 0; j < guguArr.length; j++) {
            objList.innerHTML += guguArr[j] + ' * ' + (i+1) + ' = ' + result[count] + ' ';
            count++;
         }
         objList.innerHTML += '<br/>';
      }
   }
   
</script>

</head>

<body>
   
   <div id='setDisplay' style="width: 800px; height: 400px; border: 1px solid black;"></div>
   <button onclick="setGugudan();">입력</button>
   <button onclick="getGugudan();">출력</button>

</body>


</html>