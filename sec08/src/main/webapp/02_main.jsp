<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 전용 페이지</title>
</head>
<body>

<h2>회원 전용 페이지</h2>
<form action="02_logout.do">
<table>
<tr>
<td>안녕하세요. ${loginUser.name }(${loginUser.id})님</td>
</tr>
<tr><td align="center"> <!-- 가운데정령 -->
<input type="submit" value="로그아웃"> &nbsp;&nbsp;&nbsp;
<input type="button" value="회원정보변경" onclick="location.href='MemberUpdate.do?id=${loginUser.id}'">
</td></tr>

</table>
</form>

</body>
</html>