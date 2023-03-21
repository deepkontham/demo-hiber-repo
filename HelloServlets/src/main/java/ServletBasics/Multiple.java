package ServletBasics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Multiple extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	 int i=Integer.parseInt(req.getParameter("number1"));
     int j=Integer.parseInt(req.getParameter("number2"));
     
     int k=i*j;
     HttpSession se=req.getSession();
     se.setAttribute("k", k);
     resp.sendRedirect("multi");
     
//     PrintWriter writer=resp.getWriter();
//     writer.println("result is :"+k);
//     
	}

}
