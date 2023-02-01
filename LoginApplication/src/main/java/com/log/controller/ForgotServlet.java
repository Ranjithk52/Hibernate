package com.log.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.log.dao.LoginDAOImpl;

/**
 * Servlet implementation class ForgotServlet
 */
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		System.out.println(req.getParameter("uname"));
		System.out.println(req.getParameter("type"));
		String usname=req.getParameter("uname");
		
		String type=req.getParameter("type");
		LoginDAOImpl logdao=new LoginDAOImpl();
		String psword=logdao.forgot(usname, type);
		out.println("Password for the username "+usname+" is "+psword);

    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    doGet(req,res);
    }
	

}
