package com.kunal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnectionServlet
 */

public class ConnectionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String user, password, url, driver;
	Connection conn;
	ServletContext context;
	   @Override
	public void init(ServletConfig config) throws ServletException{
		   context = config.getServletContext();
		user = context.getInitParameter("userName");
		password = context.getInitParameter("password");
		url = context.getInitParameter("url");
		driver = context.getInitParameter("driver");
			
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					System.out.println(conn);
					System.out.println(config+"From conn1");
					System.out.println(context+"From conn2");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
	}
	 @Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//super.service(req, resp);
		 System.out.println("Hello from service()");
		 
		 
		}
	 
}


