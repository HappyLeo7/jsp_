<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 악세사리 </h2>
관심 항목을 선택하세요.
<hr>
<form method="get" action="CheckboxSErvlet">
<input type="checkbox" name="item" value='신발'>신발 <br>
<input type="checkbox" name="item" value='가방'>가방	<br>
<input type="checkbox" name="item" value='벨트'><br>
<input type="checkbox" name="item" value='양말'>양말<벨트br>
<input type="checkbox" name="item" value='바지'>바지<br>
<input type="checkbox" name="item" value='점퍼'>점퍼<br>
<input type="checkbox" name="item" value='모자'>모자<br>
<input type="checkbox" name="item" value='시계'>시계<br>
<input type="checkbox" name="item" value='반지'>반지<br>
<input type="checkbox" name="item" value='목걸이'>목걸이<br>
<hr>


<span style="float:left; margin-left: 20px">
	<label for='job' >직업</label>
	<select id='jod' name='job' size='1'>
	<option value=''>선택하세요</option>
	<option value='학생'>학생</option>
	<option value='교사'>교사</option>
	<option value='IT'>IT</option>
	<option value='공무원'>공무원</option>
	<option value='회사원'>회사원</option>
	<option value='자영업'>자영업</option>
	<option value='군인'>군인</option>
	</select>
	<br>
	
	
	<label for='interest' style='float:left'>취미</label>
	<select id='interest' name='interest' size='5'multiple='multiple'>
	<option value=''>선택하세요</option>
	<option value='수영'>수영</option>
	<option value='테니스'>테니스</option>
	<option value='춤'>춤</option>
	<option value='헬스'>헬스</option>
	<option value='볼링'>볼링</option>
	<option value='독서'>독서</option>
	<option value='음악감상'>음악감상</option>
	</select>
	<br>
	
</span>
<input type="submit" value="선택" style="float:right; margin-right: 50px">

</form>

</body>
</html>