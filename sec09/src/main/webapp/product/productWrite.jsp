<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" type="text/css" href="css/hopping.css">
<script type="text/javascript" src="script/product.js"></script>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/hopping.css">
<title>상품 등록</title>
</head>
<body>
<div id="wrap">

<h1>상품 등록 - 관리자페이지</h1>
<form action="productWrite.do" method="post" name="frm" encType="multipart/form-data">
	<table>
	<tr>
	<th>상 품 명</th>
	<td><input type="text" name="name" size="80"></td>
	</tr>
	<tr>
	<th>가   격</th>
	<td><input type="text" name="price">원</td>
	</tr>
	<tr>
	<th>이 미 지</th>
	<td><input type="file" name="pictureurl"><br>
	(주의사항 : 이미지를 변경하고자 할때만 선택하세요.)
	</td>
	</tr>
	<tr>
		<th>설   명</th>
		<td><textarea name="description" cols="80" rows="10"></textarea><br>
	</td>
	</tr>
	
	</table>
<br>
<input type="submit" value="등록" onclick="return productCheck()">
<input type="reset" value="다시작성">
<input type="button" value="목록" onclick="location.href='productList.do'">


</form>
</div>

</body>
</html>