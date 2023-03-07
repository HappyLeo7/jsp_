<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%@ page import="java.net.URLDecoder" %>
<h3>마스터 로그인 성공</h3>
<%= URLDecoder.decode(request.getParameter("managerName"),"UTF-8") %>
"<%=request.getParameter("id") %>"님 환영합니다.
</body>
</html>