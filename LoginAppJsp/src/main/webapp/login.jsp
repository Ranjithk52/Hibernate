<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.log.dao.*"  %>
    <%@  include file="Navbar.jsp"%>
   <%@ include file="Form.jsp" %>
<%

LoginDAOImpl logdao=new LoginDAOImpl();
String usname=request.getParameter("uname");
String psword=request.getParameter("pword");
String messg=logdao.loginAccount(usname, psword);
if(messg!=null){
out.println("Welcome to "+messg);


}
else{
	out.println("Give Correct Credentials");
}
%>