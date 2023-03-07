package com.keduit.dto;

public class MemberVO {
 
	//필드
	private String name;
	private String id;
	private String pwd;
	private String email;
	private String phone;
	private int admin; //일반 0 , 관리자 1 
	
	// 각 get set toString 생성(3개) 
	@Override
	public String toString() {
		return "memberVO [name=" + name + ", userid=" + id + ", pwd=" + pwd + ", email=" + email + ", phone="
				+ phone + ", admin=" + admin + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getid() {
		return id;
	}
	public void setid(String userid) {
		this.id = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
}
