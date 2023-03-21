package ServletBasics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Httpsessions extends HttpServlet {
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession se=req.getSession();
	int k=(int) se.getAttribute("k");
	k=k*k;
	PrintWriter out=resp.getWriter();
	out.println("multiplication of two numbers"+k);
	
}

}
