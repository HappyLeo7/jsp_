<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입페이지</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<h2>회원가입 페이지</h2>

	<form action="joinMemberShip.do" method="post" name="frm">
		<table>
			<tr>
			
				<td><input type="text" name="id" placeholder="ID입력"></td>
			</tr>
			<tr>
				<td><input type="password" name="password" placeholder="PWD입력">
				</td>
			</tr>
			<tr>
				<td>생일 : <input type="date" name="birthday">
				</td>
			</tr>
			<tr>
				<td><input type="radio" id="gender" name="gender" value="1">남자
				<input type="radio" id="gender" name="gender" value="2">여자</td>
			</tr>
			<tr>
				<td><input type="email" name="email" placeholder="Email입력">
			</tr>
			<tr>
				<td>전화번호 : <input type="number" name="telFirst" size="10" style="white:10px">-<input type="number" name="telSecond">-<input type="number" name="telThird"></td>
			</tr>
			<tr>
			<td><input type="radio" id="admin" name="admin" value="0">관리자
			<input type="radio" id="admin" name="admin" value="1" checked="checked">일반회원
			<input type="radio" id="admin" name="admin" value="2">비회원</td>
			</tr>
		</table>
		<input type="submit" value="회원가입" onclick="return joinMeMberShipCheck()">
		<input type="reset" value="다시작성">
	</form>


</body>
</html>