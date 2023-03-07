<%@page import="com.keduit.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--  <% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="memberBean" class="com.keduit.MemberBean"/>
 <jsp:setProperty property="*" name="memberBean"/> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

이름 : ${memberBean.name }              <br>
아이디 : ${memberBean.userid }          <br>
별명 : ${memberBean.nickname }          <br>
비밀번호 : ${memberBean.pwd }           <br>
이메일 : ${memberBean.email }           <br>
전화번호: ${memberBean.phone }          <br>
                                        <br>
이름 : ${param.name }                   <br>
아이디 : ${param.userid }               <br>
별명 : ${param.nickname }               <br>
비밀번호 : ${param.pwd }                <br>
이메일 : ${param.email }                <br>
전화번호: ${param.phone }               <br>  


</body>
</html>