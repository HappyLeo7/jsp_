package com.leoCompany.valueObject;

public class MemberValueObject {
	String id; //아이디
	String password; //비밀번호
	String name; //이름
	String birthday; //생일
	int gender; //성별 1:남자 2:여자
	String email; //이메일
	String tel; //전화
	int admin; //회원등급 0:관리자 1:일반회원 2:비회원
	@Override
	public String toString() {
		return "MemberValueObject [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday
				+ ", gender=" + gender + ", email=" + email + ", tel=" + tel + ", admin=" + admin + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
