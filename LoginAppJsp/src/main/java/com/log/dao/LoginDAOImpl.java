package com.log.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.log.dp.DBUtility;
import com.log.model.User;
import com.log.model.login.LoginDAO;
import com.log.query.QueryDAO;

public class LoginDAOImpl implements LoginDAO {
	public static Connection con=DBUtility.getCOnnections();
	PreparedStatement ps=null;
	ResultSet rs=null;
	User user=null;
	String message=null;
	int n=0;
	
	public String createAccount(User user) {
		
		
		
		return null;
	}

	
	
	public String loginAccount(String uname, String pword) {
		System.out.println(con);
		if(con!=null){
			System.out.println("connected");
		}else{
			System.out.println("not connected");
		}
		String type=null;
		try {
			ps=con.prepareStatement(QueryDAO.GET_USER);
			type = null;
			ps.setString(1, uname);
			ps.setString(2, pword);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				type=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return type;
	}

	public String forgot(String uname, String type) {
		String password=null;
		try {
			ps=con.prepareStatement(QueryDAO.GET_PASSWORD);
			ps.setString(1, uname);
			ps.setString(2, type);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				password=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return password;
	}


}
