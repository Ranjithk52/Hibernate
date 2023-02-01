package com.log.dp;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.Properties;

	public class DBUtility {
		 
		public static Connection getCOnnections(){
			Connection con=null;
			try {
				File path=new File("D:\\Javaneonworkspace\\LoginApplication\\src\\main\\resources\\db.properties");
				FileInputStream fis=new FileInputStream(path);
				Properties p=new Properties();
				p.load(fis);
				System.out.println(p.getProperty("url"));
				System.out.println(p.getProperty("username"));
				System.out.println(p.getProperty("password"));
				System.out.println(p.getProperty("driver"));
				Class.forName(p.getProperty("driver"));
				con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
				
			System.out.println(con);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(con);
			return con;
			
		}
		
		
		
	}


