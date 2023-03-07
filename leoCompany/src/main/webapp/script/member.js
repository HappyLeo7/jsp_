/**
 * 로그인 체크 매서드()
 */

function loginCheck() {
	//비어있다면 아이디와 비밀번호를 입력하게 해준다.
	// id의 value의 length가 0이면 
	if(document.frm.id.value==""){
		alert("아이디를 입력하세요")
		frm.id.focus();
		return false;
	}
	//password의 value의 length가 0이면 
	if (document.frm.password.value.length==0) {
		alert("비밀번호는 반드시 입력해야 합니다.")
		frm.pwd.focus();
		return false;
	}
	return true;
}
function joinMeMberShipCheck() {
	if(document.frm.id.value.length==0){
		alert("ID를 입력하세요")
		frm.id.focus();
		return false;
	}

	if(document.frm.password.value==""){
		alert("PWD를 입력하세요")
		frm.password.focus();
		return false;
	}
	if(document.frm.birthday.value==""){
		alert("생일을 입력하세요")
		frm.birthday.focus();
		return false;
	}
	if(document.frm.gender.value==""){
		alert("성별을 선택해주세요")
		//frm.gender.focus();
		return false;
	}
	if(document.frm.email.value==""){
		alert("Email을 입력하세요")
		frm.email.focus();
		return false;
	}
	if(document.frm.telFirst.value==""){
		alert("전화번호를 입력하세요")
		frm.telFirst.focus();
		return false;		
	}
	if(document.frm.telSecond.value==""){
		alert("전화번호를 입력하세요")
		frm.telSecond.focus();
		return false;		
	}
	if(document.frm.telThird.value==""){
		alert("전화번호를 입력하세요")
		frm.telThird.focus();
		return false;		
	}
	if(document.frm.admin.value=="0"){
		alert("관리자를 선택할수 없습니다.")
		return false;
		//windown.open
	}
	if(document.frm.admin.value==""){
		
	}
	if(document.frm.admin.value==""){
		
	}
		return true;
}
