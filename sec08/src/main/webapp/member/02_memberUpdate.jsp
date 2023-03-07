<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- js 연결필요 -->
<script type="text/javascript" src="script/member.js"></script>

</head>
<body>

<h1>회원정보수정</h1>
[*] 표시 항목은 필수 입력 항목입니다.

<form name="frm" action="MemberUpdate.do" method="post" >

<table >
<tr>
<td>
이름
</td>
<td>
<input type="text" name="name" required="required" readonly="readonly" value='${mVO.name }'> *</td>
</tr>

<tr>
<td>
아이디
</td>
<td>
<input type="text" name="id" value="${mVO.id }" readonly="readonly"> *
<!-- ???? 뭐니넌 -->
<input type="hidden" name="reid"> 
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
<input type="email" name="email" value="${mVO.email }">
</td>
</tr>

<tr>
<td>
전화번호
</td>
<td>
<input type="tel" name="phone" value="${mVO.phone }">
</td>
</tr>

<tr>
<td>
등급
</td>
<td>
<c:choose>
<c:when test="${mVO.admin==0 }"> 
<input type="radio" name="admin" checked="checked" value="0">일반회원
<input type="radio" name="admin" value="1">관리자
</c:when>
<c:otherwise>
<input type="radio" name="admin"  value="0">일반회원
<input type="radio" name="admin" checked="checked" value="1">관리자
</c:otherwise>
</c:choose>
</td>
</tr>
<tr>
<td></td>
<td colspan="2" align="center">

<input type="submit" value="확인" name="ok" style="margin-left: 20px" onclick="return joinCheck()">
<input type="reset" value="취소" style="margin-left: 50px">
</td>

</tr>

</table>
</form>


</body>
</html>