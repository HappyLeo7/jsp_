<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
<%
if(session.getAttribute("loginUser")==null){
	response.sendRedirect("10_loginForm.jsp");
}else{
	%>
	<%=session.getAttribute("loginUser") %>님 안녕하세여.<br>
	저희 홈페이지를 방문해 주셔서 감사합니다. <br>
	즐거운 시간되세요... <br>
	<form method="post" action="10_logout.jsp">
	<input type="submit" value="lngout">
	</form>
	<%
}
%>
</body>
</html>