<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP addition</title>
</head>
<body>
20+10=30

자바코드
<%
 int num1 =200;
int num2=300;
int add = num1 +num2;
%>
<h1>
<%=num1 %> +<%=num2 %> = <%=add %>
</h1>

<%
 int[] a= new int[5];
%>
<%
 for(int i=0;i<5;i++){
%>
 <%=i %>
<%
 }
  %>
 


</body>
</html>