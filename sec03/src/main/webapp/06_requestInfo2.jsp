<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request info</title>
</head>
<body>
컨텍스트 패스 : <%=request.getContextPath() %> <br>
요청방식 : <%=request.getMethod() %> <br>
요청한 URL : <%=request.getRequestURL() %><br>
요청한 URI : <%=request.getRequestURI() %><br>
서버의 이름 : <%=request.getServerName() %><br>
프로토콜 : <%=request.getProtocol() %><br>
<br>
<hr>
<br>
앱 서버 정보 : <%= application.getServerInfo() %><br>
앱 컨텍스트 정보 : <%=application.getContextPath() %><br>
앱 리얼패스 : <%=application.getRealPath("06_requstinfo2.jsp") %><br>
MIME 타입 : <%= application.getMimeType("19.PNG")%><br>

</body>
</html>