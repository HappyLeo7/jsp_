<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>설문 조사</h1>
<form method="get" action="09_reserch.jsp">
이름 : <input type="text" name="name">
<br>
성별 : 
<input type="radio" name="gender" value="남자" checked="checked">남자
<input type="radio" name="gender" value="여자">여자
<br>
좋아하는 게절 : 
<input type="checkbox" name="Season" value="봄">봄
<input type="checkbox" name="Season" value="여름">여름
<input type="checkbox" name="Season" value="가을">가을
<input type="checkbox" name="Season" value="겨울">겨울
<br>

<input type="submit" value="전송">
</form>

</body>
</html>