<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
${"안녕하세요"} <br>
<%="안녕하세요"%> <br>
<% out.print("안녕하세요"); %> <br>
<%String input=null; %>
El에서의 null 표현 : ${null } <br>  <!-- null 표시안됨 -->
표현식에서의 null : <%=input %><br>  <!-- null표시됨 -->
El에서의 empty : ${empty input }<br>

<h3>
El의 연산자
</h3>
\${5+2 } : ${5+2} <br>
\${2 gt 10 } : ${2 gt 10} <br>
\${(5>2)? 5:2} : ${(5>2)?5:2} <br>
\${(5>2)||(2<10)} : ${5>2||2<10} <br>
 </body>
</html>