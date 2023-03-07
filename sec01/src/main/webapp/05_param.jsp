<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>퀴리 스트링</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>

	<form name="frm" method="get" action="ParamServlet">
		GET_ID : <input type="text" name="id"> <br> 나이 : <input
			type="text" name="age"> <br> <input type="submit"
			value="get전송" onclick="return check()">
	</form>

	<form name="frm1" method="POST" action="ParamServlet">
		POST_ID : <input type="text" name="id1"> <br> 나이 : <input
			type="text" name="age1"> <br> <input type="submit"
			value="POST전송" onclick="return check1()">
	</form>

</body>
</html>