<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>

<!-- js를 쓰기위해서 script파일 안에 있는 member.js의 경로를 연결 -->
<script type="text/javascript" src="script/member.js"></script>

</head>
<body>

<form action="login.do" method="POST" name="frm">
<h1>로그인</h1>
<table>
<tr>
<td>
<input type="text" name="id" placeholder="ID입력" style="width:100%" > <br>
</td>
</tr>
<tr>
<td>
<input type="password" name="password" placeholder="PWD입력" style="width:100%"> <br>
</td>
</tr>
<tr><td>${message }</td></tr>
<tr>
<td>
<!-- 로그인버튼을 누르면 아이디와 비밀번호가 맞는지 데이터를 찾아올수 있게 만든다. js를 이용하여 매서드 생성필요, js연결링크 필요 -->
<input type="submit" value="로그인" style="width: 100%" onclick="return loginCheck()"> <!-- logincheck()을 통해서 입력을 하였는지 유무확인 -->
</td>
</tr>
</table>
</form>
<a href="">비밀번호찾기</a>
<a href="">아이디찾기</a>
<a href="">회원가입</a>

</body>
</html>