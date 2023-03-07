<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

    <%!Connection conn = null;
    PreparedStatement pstmt = null;
	//ResultSet rs = null;
	ResultSet insert = null;
	
	String url = "jdbc:mysql://localhost:3306/keduit?serverTimezone=UTC";
	String uid = "root";
	String pass = "0000";
	//String sql = "select * from member";
	String into = "";
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");
String textMysql= request.getParameter("textMysql");
String price= request.getParameter("price");
String description=request.getParameter("description");
String cod=request.getParameter("cod");

try{
	//1단계 : JDBC 드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	//2단계 : 데이터베이스 연결 객체인 Connection생성
	conn=DriverManager.getConnection(url, uid, pass);
	//3단계 : Statement 객체 생성
	pstmt=conn.prepareStatement(into);
	//4단계 : 바인딩 변수를 채워줌.
	pstmt.setString(1,textMysql);

	//5단계 : SQL문을 실행하고 결과를 처리
	pstmt.executeUpdate();
	
}catch(Exception e){
	e.printStackTrace();
	//6단계 : 사용한 자원(리소스)를 반납(해제하는것)
	}finally{
		try{
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>
<form method="POST" action="02_allMember.jsp">
<input type="submit" value="목록확인">
</form>
</body>
</html>