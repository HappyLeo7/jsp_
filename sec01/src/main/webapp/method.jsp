<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="GET" action="MethodServlet">
	<input type="submit" value="get방식">
	<br>
	<br>
	<hr>
	<br>
	</form>
	<form method="post" action="MethodServlet">
	<input type="submit" value="post방식">
	<a href="MethodServlet">링크 클릭</a> 
	
	</form>
	
</body>
</html>