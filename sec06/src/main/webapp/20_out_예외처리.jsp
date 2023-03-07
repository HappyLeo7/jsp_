<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- set해서 var에 value를 넣어두면 out으로 불러내면 우선순위는 저장된 값이 나온다  -->
<c:set var="age" value="40" scope="page"/>
나이 : <c:out value="${age }">50</c:out><br>  <!-- age에 40값이 들어가있어서 50이라는 숫자를 주어도 40이 출력된다 -->

<c:remove var="age" scope="page"/>
나이 : <c:out value="${age }">10</c:out><br> <!-- age를 삭제했기때문에 10이 나온다 -->

<c:catch var="errmsg">
예외 발생전 <br>
<%=1/0 %><br>
예외 발생 후 <br>
</c:catch>

<c:out value="${errmsg }"/>


</body>
</html>