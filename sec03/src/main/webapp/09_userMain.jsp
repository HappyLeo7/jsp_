<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 페이지</title>
</head>
<body>

<h3>사용자 로그인 성공</h3>
<%= URLDecoder.decode(request.getParameter("userName"),"UTF-8") %>
<%=request.getParameter("id") %>님 환영합니다.
</body>
</html>