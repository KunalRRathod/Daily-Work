package com.kunal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbConnection
 */

public class DbConnection extends HttpServlet {
	/**
	 * 
	 */
	String user, pass, url, driver;
	private static final long serialVersionUID = 1L;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//super.init(config);
		user = config.getInitParameter("userName");
		pass = config.getInitParameter("password");
		url = config.getInitParameter("url");
		driver = config.getInitParameter("driver");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException
	{  
		  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		String id=request.getParameter("userId");
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String e=request.getParameter("userEmail");  
		//String c=request.getParameter("userCountry");  
		          
		try{  
		Class.forName(driver);  
		Connection con=DriverManager.getConnection(  
		"com.mysql.cj.jdbc.Driver","root","root");  
		  
		PreparedStatement ps=con.prepareStatement(  
		"insert into test values(?,?,?,?)");  
		  
		ps.setString(1, id);
		ps.setString(2,n);  
		ps.setString(3,p);  
		ps.setString(4,e);  
		//ps.setString(5,c);  
		          
		int i=ps.executeUpdate();  
		if(i>0)  {
		out.print("You are successfully registered...");  
		}    
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  

}

  
