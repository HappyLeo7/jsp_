<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main page</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<h3>메인 페이지</h3>
<a href="sub.jsp">서브페이지로 이동합니다.</a>
<%@ include file="footer.jsp" %>

</body>
</html>