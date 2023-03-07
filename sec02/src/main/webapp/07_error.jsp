<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--이 페이지는 에러 페이지입니다. --%>
<%-- <%@ page errorPage="error.jsp" %> --%>
<%@ page isErrorPage = "true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp에러페이지</title>
</head>
<body>
다음과 같이 에러가 발생했습니다.
<%= exception.getMessage() %>
</body>
</html>