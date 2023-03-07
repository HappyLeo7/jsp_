<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
</head>
<body>
<% response.sendRedirect("http://localhost:8080/sec10/BoardServlet?command=board_list"); %>
<%-- sendRedirect는 해당되는 주소를 바로 입력해서불러와줌 --%>
</body>
</html>