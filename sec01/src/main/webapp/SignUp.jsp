<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUP</title>

<script type="text/javascript" src="SignUp.js"></script>


</head>
<body>


<form method='get' action="SignUpServlet" name="join">
	이름			 <input name='name' id='name' type="text" autofocus="autofocus" ><br>
	주민등록 번호		 <input name='unique_number' id='unique_number' type="text" >
						-
					<input name='unique_number1' id='unique_number1	' type="password"><br>
	아이디     		 <input name='id' id='id' type="text" ><br>
	비밀번호    		 <input name='password' id='password' type="password" ><br>
	비밀번호 확인		 <input name='ok_password' id='ok_password' type="password" ><br>
	이메일			 
	<input name='email' id='email' type="text" >@ 
	<input name='email1' class="box" id="domain-txt" type="text" disabled="disabled"/>
<select class="box" id="domain-list">
 <option value="">선택하세요</option>
 <option value="type" onclick="ofn()">직접 입력</option>
  <option value="naver.com">naver.com</option>
  <option value="google.com">google.com</option>
  <option value="hanmail.net">hanmail.net</option>
  <option value="nate.com">nate.com</option>
  <option value="kakao.com">kakao.com</option>
</select>
				<br>	
				
				    

					
					
					
					
	우편번호		 <input name='zip_code' id='zip_code' type="text" ><br>
	주소 			 <input name='address' id='address' placeholder="??시 ??구 ??동" type="text" >
				<input name='address1'id='address1' type="text" placeholder="상세주소입력하세요"><br>
	핸드폰번호		 <input name='phone' id='phone' type="number">
				<input name='phone1'id='phone1' type="number">
				<input name='phone2'id='phone2' type="number">
				<br>

	<span>

	<label for='job' style="float:left;">
	직업</label>

	<select name='job' id='job' size='3'>
	<option value=''>선택하세요</option>
	<option value='학생'>학생</option>
	<option value='교사'>교사</option>
	<option value='IT'>IT</option>
	<option value='공무원'>공무원</option>
	<option value='회사원'>회사원</option>
	<option value='자영업'>자영업</option>
	<option value='군인'>군인</option>
	</select>
	</span>
	<br>

	메일/SMS 정보 수신 <input type="radio" name='sms' value='yes' id='yes' checked="checked"><label for='yes'>수신</label>
					<input type="radio" name='sms' value='no' id='no'><label for='no'>수신거부</label>
					<br>
	관심분야 
	<input name='interesting' type="checkbox" value="생두">생두			 
	<input name='interesting' type="checkbox" value="원두">원두			 
	<input name='interesting' type="checkbox" value="로스팅">로스팅			 
	<input name='interesting' type="checkbox" value="핸드드립">핸드드립			 
	<input name='interesting' type="checkbox" value="에스프레소">에스프레소			 
	<input name='interesting' type="checkbox" value="창업">창업
	<br>
	
	<input type="submit" value='취소' style="float: right;">
	<input type="submit" value='회원가입' style="float: right;">
	
	
				 
	
</form>
	

</body>
</html>