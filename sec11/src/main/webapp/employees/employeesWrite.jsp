<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원등록</title>
</head>
<body>
<h2>직원등록</h2>
<form action="" name="frm">

 <table>
 <tr>
 <td>
 id : 
 </td>
 <td><input type="text" name="id"></td>
 </tr>
 <tr>
 <td>
 pass : 
 </td>
 <td><input type="password" name="pass"></td>
 </tr>
 <tr>
 <td>
 name : 
 </td>
<td> <input type="text" name="name"></td>
 </tr>
 <tr>
 <td>
 lev : 
 </td>
<td> <select name="lev">
 	<option value="">선택</option>
 	<option value="A">A일반사원</option>
 	<option value="B">B팀장</option>
 	<option value="D">D임원</option>
 	<option value="E">E대표</option>
 </select>
 </td>
 </tr>
  <tr>
 <td>
 enter : 
 </td>
<td>
 <input type="date" name="enter"></td>
 </tr>
   <tr>
 <td>
 gender : 
 </td>
<td> <select name="gender">
 	<option value="">선택</option>
 	<option value="1">남자</option>
 	<option value="2">여자</option>
 </select></td>
 </tr>
  <tr>
 <td>
 phone : 
 </td>
 <td><input type="tel" name="phone" placeholder="ex)010-0000-0000"></td>
 </tr>
<tr>
<td colspan="2" rowspan="2">
<input type="submit" value="노예계약등록">
</td>
</tr> 
 </table>
 </form>
</body>
</html>