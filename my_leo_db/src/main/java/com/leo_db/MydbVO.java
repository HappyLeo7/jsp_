package com.leo_db;

public class MydbVO {
//데이터 테이블
	private int no; //넘버
	private String title; //제목
	private String explanation;//가게설명
	private String reviews;//리뷰수
	private String phone;//전화
	
	public int getNo() {
		
		return no;
	}
	public void setNo(int no) {
		
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
