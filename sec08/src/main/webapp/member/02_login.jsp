<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인화면</title>

<!-- ??? -->
<script type="text/javascript" src="script/member.js"></script> 

</head>
<body>

<h2>로그인</h2>
<form action="02_login.do" method="post" name="frm">
<table>
<tr>
<td>
<!-- 아이디  -->
<input name="id" type="text" placeholder="ID입력" 
<%-- value="${id}" --%>
>
</td>
</tr>
<tr>
<td>
<!-- 비밀번호 -->
<input name="pwd" type="password" placeholder="PWD입력">
</td>
</tr>
<tr>
<td >
<!-- 로그인 -->
<input name="login" type="submit" value="LOGIN" onclick="return loginCheck()">
<input name="" type="reset" value="취소">
</td>
</tr>

</table>
</form>

<table>
<tr>
<td>
<input name="" type="submit" value="회원가입" onclick="location.href='join.do'">
</td>
</tr>
<tr>
<td colspan="2">${message }</td>
</tr>
</table>



</body>
</html>