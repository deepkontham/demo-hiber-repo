package com.sms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.dao.Employee;
import com.employee.dao.Employeedaoimpl;

/**
 * Servlet implementation class EmployeeGetAll
 */
public class EmployeeGetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Employeedaoimpl dao=new Employeedaoimpl();
	response.setContentType("text/html");
	List<Employee> E=dao.getall();
	PrintWriter writer=response.getWriter();
	
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<table border='1px'>");
	writer.print("<tr><th>Eid</th><th>firstname</th><th>Lastname</th><th>Salary</th></tr>");

	for (Employee Em : E) {
		writer.print("<tr>");
		writer.print("<td>" + Em.getEid() + "</td>");
		writer.print("<td>" + Em.getFname() + "</td>");
		writer.print("<td>" + Em.getLname() + "</td>");
		writer.print("<td>" + Em.getSalary() + "</td>");
		writer.print("</tr>");
	}
    writer.println(E);
	writer.println("</table>");
	writer.println("</body>");
	writer.println("</html>");
	writer.close();
}
	
	}
	


