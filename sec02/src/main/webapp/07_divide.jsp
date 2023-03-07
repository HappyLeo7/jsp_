<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- 에러 발생페이지 --%>
    <%@ page errorPage="07_error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나눗샘페이지</title>
</head>
<body>
0으로 나누는 것은 불가능합니다.
<%=2/0 %>
</body>
</html>