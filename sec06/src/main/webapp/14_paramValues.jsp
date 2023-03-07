<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다중항목의 jstl처리</title>
</head>
<body>
<%-- 
서블릿에서 표현
request.getParameterValues("item")
jstl에서 표현
${paramValues.item } 
--%>

<c:forEach var="item" items="${paramValues.item }" varStatus="status">
${item } <c:if test="${not status.last}">,
</c:if>
</c:forEach>
</body>
</html>