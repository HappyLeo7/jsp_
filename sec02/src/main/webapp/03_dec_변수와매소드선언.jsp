<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>변수와 메소드 선언하기</title>
</head>
<body>
<%!
//변수 선언
String str="안녕하세요";
int a = 5,b=-5;
// 매서드 선언
public int abs(int n){
	if(n<0){
		n=-n;
	}
				return n;
}

%>

<% out.print(str+"<br>");
		out.print(a+"의 절대값"+abs(a)+"<br>");
		out.print(b+"의 절대값"+abs(b)+"<br>");%>
		
		<%=str %><br>
		<%=a %>의 절대값 : <%=abs(a) %><br>
		<%=b %>의 절대값 : <%=abs(b) %><br>

</body>
</html>