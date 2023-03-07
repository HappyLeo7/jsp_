<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키삭제</title>
</head>
<body>
<%
Cookie cookie = new Cookie("id","gildong");
cookie.setMaxAge(0);
response.addCookie(cookie);
%>
삭제되었습니다
<a href="02_getCookies.jsp"> 삭제후 쿠키확인</a>
</body>
</html>