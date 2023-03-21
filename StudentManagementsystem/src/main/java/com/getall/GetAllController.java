package com.getall;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Studentdoaimplt;
import com.model.Student;

/**
 * Servlet implementation class GetAllController
 */
public class GetAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//Studentdoaimplt dao=new Studentdoaimplt();
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.println("asdfghjkoiuysdf");
//	List<Student> students=dao.getall();
//	request.setAttribute("all", students);
//	request.getRequestDispatcher("GetAll.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
