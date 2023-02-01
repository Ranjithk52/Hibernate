package com.log.model;

public class User {
	public int uid;
	public String userName;
	public String password;
	public String type;
	
	public User(){
		
		
	}
	
	public User(int uid, String userName, String password, String type) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
		this.type = type;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
