<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>

<h1>회원가입</h1>
[*] 표시 항목은 필수 입력 항목입니다.

<form name="frm" action="02_join.do" method="post" >

<table >
<tr>
<td>
이름
</td>
<td>
<input type="text" name="name" required="required"> *</td>
</tr>

<tr>
<td>
아이디
</td>
<td>
<input type="text" name="id"> *
<!-- ???? 뭐니넌 -->
<input type="hidden" name="reid"> 
<!-- 아이디 중복확인 -->
<input type="button" value="중복확인" onclick="idCheck()">
</td>
</tr>

<tr>
<td>
암호
</td>
<td>
<input type="password" name="pwd" required="required"> *
</td>
</tr>

<tr>
<td>
암호 확인
</td>
<td>
<input type="password" name="pwd1" required="required"> *
</td>
</tr>

<tr>
<td>
이메일
</td>
<td>
<input type="email" name="email">
</td>
</tr>

<tr>
<td>
전화번호
</td>
<td>
<input type="tel" name="tel">
</td>
</tr>

<tr>
<td>
등급
</td>
<td>
<input type="radio" name="name" checked="checked" value="0">일반회원
<input type="radio" name="name" value="1">관리자
</td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="확인" name="ok" style="margin-left: 20px" onclick="return joinCheck()">
<input type="reset" value="취소" style="margin-left: 50px">
</td>

</tr>
<tr ><td colspan="2"> ${me }</td></tr>

</table>
</form>
</body>
</html>