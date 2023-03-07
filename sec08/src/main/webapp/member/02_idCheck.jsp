<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- jstl 추가 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>

<%--js 연결 링크 추가 --%>
<script type="text/javascript" src="script/member.js">

</script>

<meta charset="UTF-8">
<title>아이디 중복확인</title>
</head>
<body>

<h2>아이디 중복확인</h2>
<form action="idCheck.do" method='post' name="frm">
아이디 <input type="text" name="id" value='${id }'>
<input type="submit" value="중복 확인"> <br>
<c:if test='${result==1 }'>
	<script type="text/javascript">
		opener.document.frm.id.value=""; //opener : 부모창
	</script>
	${id }는 이미 사용중인 아이디입니다.
</c:if>
<c:if test="${result==-1 }">
${id }는 사용 가능한 아이디입니다.
<input type="button" value="사용" class="cancel" onclick="idok()">
</c:if>
</form>


</body>
</html>