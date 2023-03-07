<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form page</title>
</head>
<body>


<form action="09_actionTagTest.jsp">
로그인 화면 <br>

<input name="id" type="text" placeholder="ID입력" required="required" > <br>
<input name="password" type="password" placeholder="PASSWORD입력" required="required"> <br>
<input type="radio" name="logincheck" value="user" checked>사용자
<input type="radio" name="logincheck" value="manger">관리자 <br>
<input type="submit" value="로그인">
</form>
</body>
</html>