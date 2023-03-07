<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 표시</title>
</head>
<body>
<%
Calendar date =Calendar.getInstance();
SimpleDateFormat today = new SimpleDateFormat("y년M월d일");
SimpleDateFormat now = new SimpleDateFormat("h시m분s초");

%>
오늘은 <b><%= today.format(date.getTime()) %></b>
지금 시각은 <b><%= now.format(date.getTime()) %></b>
</body>
</html>