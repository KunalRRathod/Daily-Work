package com.cts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void task2() {
		// TODO Auto-generated method stub
		System.out.println("from task 2");

	}
	public MyServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("from constructor");
	}
       
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("from init method");
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	System.out.println("from service method");
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("from destroy method");
	}
	
	public static void main(String[] args) {
		System.out.println("from main method");
	}

}
