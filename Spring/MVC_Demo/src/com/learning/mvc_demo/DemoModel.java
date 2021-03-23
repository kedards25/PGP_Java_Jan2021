package com.learning.mvc_demo;

public class DemoModel {

	private String userName;

	public DemoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoModel(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "DemoModel [userName=" + userName + "]";
	}
	
	
}
