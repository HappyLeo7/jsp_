<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>

<form method="POST" action="01_addMember.jsp">
<table>
<tr>
<td>이름</td>
<td><input type="text" name="name" placeholder="이름입력"></td>
</tr>
<tr>
<td>아이디</td>
<td><input type="text" name="id" placeholder="ID입력"></td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" name="password" placeholder="PWD입력"></td>
</tr>
<tr>
<td>이메일</td>
<td><input type="email" name="email" placeholder="Email입력"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="tel" name="tel" placeholder="Tel입력"></td>
</tr>
<tr>
<td>등급</td>
<td><input type="radio" name="userPermissions" value="1" checked="checked" >관리자
<input type="radio" name="userPermissions" value="0" >일반회원</td>
</tr>
<tr> 
<td><input type="submit" value="가입"> <input type="reset" value="취소"></td> </tr>
</table>
</form>


</body>
</html>