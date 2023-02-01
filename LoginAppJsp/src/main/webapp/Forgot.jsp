<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.log.dao.*"  %>
	 <%@  include file="index.jsp"%>
<%   
		String usname=request.getParameter("uname");
		
		String type=request.getParameter("type");
		LoginDAOImpl logdao=new LoginDAOImpl();
		String psword=logdao.forgot(usname, type);
		out.println("Password for the username "+usname+" is "+psword);
		
				
				
		 %>