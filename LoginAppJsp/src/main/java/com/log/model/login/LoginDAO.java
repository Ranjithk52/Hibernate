package com.log.model.login;

import com.log.model.User;

public interface LoginDAO {
	public String createAccount(User user);
	public String loginAccount(String uname,String pword);
	public String forgot(String uname,String type);
	
}
