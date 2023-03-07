<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL URL,import</title>
</head>
<body>
<c:import url="http://localhost:8080/sec01/index.jsp"/>
<c:import url="http://localhost:8080/sec05/04_el.jsp" var="data"/>
${data } 
<c:url value="44.PNG" var="data"/>
<h3>${data }</h3>
<img src="${data }" width="150" height="150"/>
</body>
</html>