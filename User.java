package com.training.web.model;

import java.util.Date;

public class User {
	private String userName;

	private String password;
    private Date date1;
	public User() {

	 

	}

	public User(String userName, String password ,Date date1) {

	super();

	this.userName = userName;

	this.password = password;
	this.date1=date1;

	}

	public String getUserName() {

	return userName;

	}

	public void setUserName(String userName) {

	this.userName = userName;

	}

	public String getPassword() {

	return password;

	}

	public void setPassword(String password) {

	this.password = password;

	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	 

}
