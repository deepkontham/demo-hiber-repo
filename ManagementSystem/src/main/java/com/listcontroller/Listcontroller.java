package com.listcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Engineer;
import com.services.ServicesImplt;

/**
 * Servlet implementation class Listcontroller
 */
public class Listcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicesImplt service=new ServicesImplt();
		List<Engineer> engineers=service.getAll();
		request.setAttribute("jio", engineers);
		request.getRequestDispatcher("FindAlljsp.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
