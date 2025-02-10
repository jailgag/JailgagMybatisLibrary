package com.mybatis.customer.model.vo;

import java.sql.Date;

public class Customer {
	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String addr;
	private String gender;
	private Date enrollDate;
	
	public Customer () {}
	
	
	
	

	//로그인!!
	public Customer(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}






	public int getUserNo() {
		return userNo;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public String getAddr() {
		return addr;
	}

	public String getGender() {
		return gender;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	@Override
	public String toString() {
		return "Customer [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userAge=" + userAge + ", addr=" + addr + ", gender=" + gender + ", enrollDate=" + enrollDate + "]";
	} 
	
	
	
}
