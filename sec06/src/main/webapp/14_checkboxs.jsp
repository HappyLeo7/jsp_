<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>악세사리</title>
</head>
<body>

<h2> 악세사리 </h2>
관심 항목을 선택하세요.
<hr>
<form method="get" action="14_paramValues.jsp">
<input type="checkbox" name="item" value='신발'>신발 <br>
<input type="checkbox" name="item" value='가방'>가방	<br>
<input type="checkbox" name="item" value='벨트'>벨트<br>
<input type="checkbox" name="item" value='양말'>양말<br>
<input type="checkbox" name="item" value='바지'>바지<br>
<input type="checkbox" name="item" value='점퍼'>점퍼<br>
<input type="checkbox" name="item" value='모자'>모자<br>
<input type="checkbox" name="item" value='시계'>시계<br>
<input type="checkbox" name="item" value='반지'>반지<br>
<input type="checkbox" name="item" value='목걸이'>목걸이<br>
<hr>


<input type="submit" value="선택" style="float:right; margin-right: 50px">

</form>

</body>
</html>