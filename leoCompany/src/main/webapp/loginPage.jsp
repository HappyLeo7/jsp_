<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
</head>
<body>
회원 페이지
<a>
마이페이지
</a>
<form action="">
<h1>[자유 커뮤니티 게시판]</h1>

<table border="1">
<tr>
<th>no</th>
<th>제목</th>
<th>작성자</th>
<th>조회수</th>
</tr>
<tr>
<td>${community.no}</td>
<td>${community.title}</td>
<td>${community.content}</td>
<td>${community.id}</td>
<td>${community.viewcount}</td>
</tr>
</table>
</form>

[등록자료]
</body>
</html>