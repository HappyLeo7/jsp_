<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String name = "Leeuoo";
    String id = request.getParameter("id");
    String pwd=request.getParameter("password");
    request.setCharacterEncoding("UTF-8");
    %>
    <%if(id.equals("aa")&&pwd.equals("123")){
    	response.sendRedirect("04_main.jsp?name="+URLEncoder.encode(name,"UTF-8"));
    }else{
    	response.sendRedirect("04_loginForm.jsp");
    }
    	%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>