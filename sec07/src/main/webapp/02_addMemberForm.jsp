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
<td>상품명</td>
<td><input type="text" name="name" placeholder="상품명입력"></td>
</tr>
<tr>
<td>가격</td>
<td><input type="text" name="price" placeholder="가격입력"></td>
</tr>
<tr>
<td>상품설명</td>
<td><textarea name="description" placeholder="상품설명입력" cols="30" rows="5"></textarea></td>
</tr>
<tr>
<td>상품코드</td>
<td><input type="text" name="cod" placeholder="상품코드입력"></td>
</tr>

<tr> 
<td><input type="submit" value="등록"> <input type="reset" value="취소"></td> </tr>
</table>
</form>

<form action="02_addMemberFormText.jsp">
<input type="submit" value="MYSQL로 직접 관리">
</form>

</body>
</html>