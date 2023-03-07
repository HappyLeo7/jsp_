<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보관리</title>
</head>
<body>

<form method="POST" action="02_addMember.jsp">
<table>

<tr>
<td>MYSQLTEXT</td>
<td><textarea name="textMysql" placeholder="입력" cols="30" rows="5"></textarea></td>
</tr>

</table>
</form>

<form action="02_addMysqlText.jsp">
<input type="submit" value="MYSQL로 전송">
</form>

</body>
</html>