package com.keduit.dto;

public class ProductVO {
	
			@Override
	public String toString() {
		return "ProductVO [code=" + code + ", name=" + name + ", price=" + price + ", pictureurl=" + pictureurl
				+ ", description=" + description + "]";
	}
			int code;
			String name;
			int price;
			String pictureurl;
			String description;
			public int getCode() {
				return code;
			}
			public void setCode(int code) {
				this.code = code;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getPrice() {
				return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public String getPictureurl() {
				return pictureurl;
			}
			public void setPictureurl(String pictureurl) {
				this.pictureurl = pictureurl;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			
}
