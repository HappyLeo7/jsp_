<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>설문 조사 결과</h1>
이름 : <% String name=request.getParameter("name"); %>
<%=name %>
<br>
성별 : <% String gender = request.getParameter("gender"); %>
<%=gender %>
계절 : <% String seasons[] = request.getParameterValues("Season"); %>
<%for(String season : seasons){%>
<%=season %>
<%
}
	%>		
</body>
</html>

