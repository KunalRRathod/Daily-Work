package com.kunal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException{
		super.init();
	}
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		//super.service(req, resp);
    	if(req.getMethod().equals("GET"))
    	{
    		doGet(req, resp);
    	}
    	else {
    		doPost(req, resp);
    	}
    	System.out.println("from service");
    	}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(req, resp);
    	System.out.println("from doGet");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doPost(req, resp);
    	System.out.println("from doPost");
    }

}
