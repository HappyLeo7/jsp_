<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<meta charset="UTF-8">
<title>상풍 목록</title>
</head>
<body>
<h1>상품 리스트 - 관리자 페이지</h1>
<div id="productWrite">
<a  href="productWrite.do">상품 등록</a>
</div>
<table border="1">
<tr>
<td>번호</td>
<td>이름</td>
<td>가격</td>
<td>수정</td>
<td>삭제</td>
</tr>

<c:forEach var="product" items='${productList }'>
<tr>
<td>${product.code }</td>
<td>${product.name }</td>
<td>${product.price } 원</td>
<td><a href='productUpdate.do?code=${product.code}'>상품 수정</a></td>
<td><a href='productDelete.do?code=${product.code}'>상품 삭제</a></td>
</tr>
</c:forEach>

<%-- <%
for(int i=0; ;i++){
	out.println("<tr>");
	out.println("<td>");
	out.println("");
	out.println("</td>");
	out.println("<td>");
	out.println("");
	out.println("</td>");
	out.println("<td>");
	out.println("");
	out.println("</td>");
	out.println("<td>");
	out.println("<a href='productUpdate.do?code=${product.code}'>상품 수정</a>");
	out.println("</td>");
	out.println("<td>");
	out.println("<a href='productDelete.do?code=${product.code}'>상품 삭제</a>");
	out.println("</td>");
	out.println("</tr>");
}
%>
 --%>
</table>
<!-- <form action="" method="" name="frm">
</form> -->
</body>
</html>