<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String url = "jdbc:mysql://localhost:3306/keduit?serverTimezone=UTC";
	String uid = "root";
	String pass = "0000";
	String sql = "select * from item";
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이클립스에서 MYSQL회원 목록</title>
</head>
<body>

	<table width='800' border='1'>
		<tr>
			<th>상품명</th>
			<th>가격</th>
			<th>상품설명</th>
			<th>상품코드</th>
		</tr>
		<%
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url,uid,pass);
		stmt= conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			out.println("<tr>");
			out.println("<td>"+rs.getString("name")+"</td>");
			out.println("<td>"+rs.getString("price")+"</td>");
			out.println("<td>"+rs.getString("description")+"</td>");
			out.println("<td>"+rs.getString("cod")+"</td>");
			out.println("<tr>");
		}
		}catch(Exception e){
		e.printStackTrace();
		}finally {
	          try{
	               if(rs != null){
	                  rs.close();
	               }
	               if(stmt != null){
	                  stmt.close();
	               }
	               if(conn != null){
	                  conn.close();
	               } 
	            }catch(Exception e){
	               e.printStackTrace();
	            }

		}
		%>
		<form action="02_addMemberForm.jsp"> 
		<input type="submit" value="다시목록등록">
		</form>
	</table>



</body>
</html>