package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer=resp.getWriter();
		String user=req.getParameter("username");
		String pass=req.getParameter("pwd");
		if(user.equalsIgnoreCase("pradeep")&&(pass.equals("pradeep"))) {
			writer.println(user);
			req.getRequestDispatcher("/employ").forward(req, resp);
			
		}else {
			writer.println("invaid username and password");
		}
		writer.close();
		

	}

}
