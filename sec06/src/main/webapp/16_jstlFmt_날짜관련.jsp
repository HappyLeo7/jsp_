<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL FMT</title>
</head>
<body>

<c:set var="now" value="<%=new java.util.Date()%>"></c:set>
\${now }:${now }
<fmt:formatDate value="${now}"></fmt:formatDate>
<hr>
date : <fmt:formatDate value="${now }" type="date"></fmt:formatDate><hr>
time : <fmt:formatDate value="${now }" type="time"></fmt:formatDate><hr>
both : <fmt:formatDate value="${now }" type="both"></fmt:formatDate><hr>
default : <fmt:formatDate value="${now }" type="both" dateStyle="default" ></fmt:formatDate><hr>
long : <fmt:formatDate value="${now }" type="both" dateStyle="long" ></fmt:formatDate><hr>
medium : <fmt:formatDate value="${now }" type="both" dateStyle="medium" ></fmt:formatDate><hr>
short : <fmt:formatDate value="${now }" type="both" dateStyle="short" ></fmt:formatDate><hr>


pattern="yyyyㄴ MMㅇ ddㅇ hh시 mm분 ss초": <br>
<fmt:formatDate value="${now }" pattern="yyyyㄴ MMㅇ ddㅇ hh시 mm분 ss초"/>

default:<cout value="${now }"/>
Korea KST : <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>
<hr>
<fmt:timeZone value="GMT">
Swiss GMT : <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>
</fmt:timeZone>
<hr>

<fmt:timeZone value="GMT-8">
New York GMT-8: <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>
</fmt:timeZone>
<hr>
톰켓서버의 기본 로케일 : <%=response.getLocale() %>
<hr>
<h1>한국</h1> <br>
<fmt:setLocale value="ko_kr"/>
로케일은 한국어로 설정후 로케일 확인 : <%=response.getLocale() %>
<br>
통화(currency) : <fmt:formatNumber value="100000" type="currency"></fmt:formatNumber>
<br>
날짜 : <fmt:formatDate value="${now }"/>
<hr>
<h1>일본</h1> <br>
<fmt:setLocale value="ja_jp"/>
로케일은 한국어로 설정후 로케일 확인 : <%=response.getLocale() %>
<br>
통화(currency) : <fmt:formatNumber value="100000" type="currency"></fmt:formatNumber>
<br>
날짜 : <fmt:formatDate value="${now }"/>

<hr>
<h1>미국</h1> <br>
<fmt:setLocale value="en_us"/>
로케일은 한국어로 설정후 로케일 확인 : <%=response.getLocale() %>
<br>
통화(currency) : <fmt:formatNumber value="100000" type="currency"></fmt:formatNumber>
<br>
날짜 : <fmt:formatDate value="${now }"/>


</body>
</html>