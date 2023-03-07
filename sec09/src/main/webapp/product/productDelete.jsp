<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="script/product.js"></script>
<meta charset="UTF-8">
<title>상품 삭제</title>
</head>
<body>
<h1>상품 삭제 - 관리자페이지</h1>
<form action="productDelete.do" method="post" name="frm">
	
	<table>
	<tr>
	<td>
	<c:choose>
	<c:when test="${empty product.pictureurl }">
	<img src="upload/noimage.gif">
	</c:when>
	
	<c:otherwise>
	<img src="upload/${product.pictureurl }">
	</c:otherwise>
	</c:choose>
	image</td>
	<td>
	<table>
	<tr>
	<th>상 품 명</th>
	<td><input type="text" name="name" size="80" value="${product.name }"></td>
	</tr>
	<tr>
	<th>가   격</th>
	<td><input type="text" name="price" value="${product.price }">원</td>
	</tr>
	<tr>
	<th>이 미 지</th>
	<td><input type="file" name="pictureurl" ><br>
	(주의사항 : 이미지를 변경하고자 할때만 선택하세요.)
	</td>
	</tr>
	<tr>
		<th>설   명</th>
		<td><textarea name="description" cols="80" rows="10">${product.description }</textarea><br>
	</td>
	</tr>
	
	</table>
	</td>
	</tr>
	</table>
	
<br>
<input type="hidden" name="code" value="${product.code }">
<input type="submit" value="삭제">
<input type="button" value="목록" onclick="location.href='productList.do'">


</form>
</body>
</html>