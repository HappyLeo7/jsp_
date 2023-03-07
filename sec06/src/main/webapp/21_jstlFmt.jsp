<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 출력</title>
</head>
<body>

<h1> 아래의 방법으로 2가지 출력 방법가능</h1>
<% request.setCharacterEncoding("UTF-8"); %>
이름 : <%=request.getParameter("name") %>

<fmt:requestEncoding value="UTF-8"/>
이름 : <c:out value="${param.name }" />



</body>
</html>