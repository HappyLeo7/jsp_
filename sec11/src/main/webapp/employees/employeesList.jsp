<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 리스트</title>
</head>
<body>
<h2>직원 리스트</h2>
<a href="EmployeesServlet?command=employees_write_form">
정보등록
</a>
<form action="" name="frm">
<input type="hidden" name="command" value="employees_write">
<table border="1">
<tr>
<th>아이디</th>
<th>이름</th>
<th>권한</th>
<th>성별</th>
<th>전화번호</th>
</tr>

<c:forEach var="employees" items="${employeesList }">
<tr>
<td>${employees.id }</td>
<td><a href="">${employees.name }</a></td>
<td>${employees.lev }</td>
<td>${employees.gender }</td>
<td>${employees.phone }</td>
</tr>
</c:forEach>
</table>

</form>

</body>
</html>