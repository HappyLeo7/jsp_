<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 예제</title>
</head>
<body>

	<form action="upload.do" method="POST" enctype="multipart/form-data">
		글쓴이 : <input type="text" name="name"><br>
		제 목 : <input type="text" name="title"><br>
		파일 지정하기 : <input type="file" name="uploadFile"><br>
		<input type="submit" value="전송">
	</form>

</body>
</html>
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 예제</title>
</head>
<body>

<form action="upload.do" method="POST" enctype="multipart/form-data"> <!-- get은 255자까지만 됨(경량)! 용량이 클테니 post 사용 -->
   글쓴이 : <input type="text" name="name"><br>
   제  목 : <input type="text" name="title"><br>
   파일 지정하기 : <input type="file" name="uploadFile"><br>
   <input type="submit" value="전송"> 
</form>
</body>
</html> --%>