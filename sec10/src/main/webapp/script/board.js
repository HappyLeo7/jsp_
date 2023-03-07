/**
 * 
 */
 function boardCheck(){
	if(document.frm.name.value==""){
		alert("작성자를 등록해주세요.");
		frm.name.focus();
		return false;
	}
	if(document.frm.pass.value==""){
		alert("비밀번호를 등록해주세요.");
		frm.psaa.focus();
		return false;
	}
	if(document.frm.title.value.length==0){
		alert("제목을 입력해주세요.");
		frm.title.focus();
		return false;
	}
	
	
	//숫자가 아닌게 들어오는지 여부 확인
	if(isNaN(document.frm.price.value)){
		alert("가격은 숫자로 입력하세요.");
		frm.price.focus();
		return false;
	}
	if(document.frm.pictureurl.value==""){
		alert("상품이미지를 등록해주세요.");
		frm.pictureurl.focus();
		return false;
	}
	if(document.frm.description.value==""){
		alert("상품 설명을 적어주세요")
		frm.description.focus();
		return false;
	}
	return turn;
	
}
function open_win(url,name){
	window.open(url, name, "width=500, height=230");
}
function passCheck(){
	if(document.frm.pass.value.length==0){
		alert("비밀번호를 입력하세요.");
		return false;
	}
	return true;
} 