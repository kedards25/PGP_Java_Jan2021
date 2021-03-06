package com.learning.springmvcdemo.models;

import org.springframework.stereotype.Component;

@Component
public class UserModel {
	
	private int userId;	
	private String userName;	
	private String userAddr;	
	private String userNumber;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(int userId, String userName, String userAddr, String userNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddr = userAddr;
		this.userNumber = userNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", userName=" + userName + ", userAddr=" + userAddr + ", userNumber="
				+ userNumber + "]";
	}
	
	

}
