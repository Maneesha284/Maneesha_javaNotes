package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/HiddenServlet")
public class HiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>servlet hidden</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>servlet hiddeservlet at"+request.getContextPath()+"</h1>");
		String name=request.getParameter("name");
		String conno=request.getParameter("num");
		pw.println("<h3>Welcome "+name+"!!!</h3>");
		pw.println("<form action='HiddenServlet2'>");
		pw.println("Email id: <input type=text name='txtEmailID'>");
		pw.println("<input type='hidden' name='hname' value='"+name+"'>");
		pw.println("<input type='hidden' name='hnum' value='"+conno+"'>");
		pw.println("<input type='submit' value='submit' >");
		
		
		
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		
		
		
		
		
		
	}

}
