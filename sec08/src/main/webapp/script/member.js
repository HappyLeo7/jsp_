/**
 * 
 */
 
 function loginCheck(){
	if(document.frm.id.value.length==0){
		alert("아이디를 넣어주세요.");
		frm.id.focus(); //id로 포커스
		return false;
	}
	if(document.frm.pwd.value==""){
		alert("비밀번호는 반드시 입력해야합니다.")
		frm.pwd.focus(); //pwd로 포커스
		return false;
	}
	return true;
}


function idCheck(){
	if(document.frm.id.value==""){
		alert("아이디를 입력해주세요")
		document.frm.id.focus();
		return;
	}
	var url = "idCheck.do?id="+document.frm.id.value;
	window.open(url,"_blank_1","toolbar=no, menubar=no, scrollbar=yes, resizable=no, width=450, height=200");
}

function idok(){
	opener.frm.id.value = document.frm.id.value;
	opener.frm.reid.value=document.frm.id.value; //숨겨둔 reid 이용
	self.close(); // 작은 창 닫는것
}

function joinCheck(){
	if(document.frm.name.value.length==0){
		alert("이름을 써주세요.")
		frm.name.focus(); 
		return false;
	}if(document.frm.id.value.length==0){
		alert("아이디를 써주세요.")
		frm.id.focus(); 
		return false;
	}if(document.frm.id.value.length<4){
		alert("아이디는 4글자 이상이어야 합니다.")
		frm.id.focus(); 
		return false;
	}if(document.frm.pwd.value==""){
		alert("암호는 반드시 입력해야 합니다.")
		frm.id.focus(); 
		return false;
	}
	return turn;
	}
