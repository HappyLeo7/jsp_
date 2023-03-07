<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력 폼</title>
</head>
<body>
<div>
<h1>회원정보입력</h1>
<form method="post" action="03_addMemberTest.jsp">
<input name="name" type="text" placeholder="name입력">         <br>
<input name="userid" type="text" placeholder="userid입력">     <br>
<input name="nickname" type="text" placeholder="pwd입력">      <br>
<input name="pwd" type="text" placeholder="nickname입력">      <br>
<input name="email" type="text" placeholder="email입력">       <br>
<input name="phone" type="text" placeholder="phone입력">       <br>
<input type="submit" value="가입">
<input type="reset" value="취소">
</form>
</div>

</body>
</html>