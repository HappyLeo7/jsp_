<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title> <%-- 타이틀은 이곳으로 나옴 --%>
</head>
<body>
forward 방식으로 이동된 페이지 <br>
<%String age = request.getParameter("age"); %>
나이 :  <%=age %>
이름 : <%=request.getAttribute("name") %>
</body>
</html>