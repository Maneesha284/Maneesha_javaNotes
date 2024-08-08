package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HiddenServlet2")
public class HiddenServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>servlet hiddenservlet2</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>servlet hiddeservlet at"+request.getContextPath()+"</h1>");
		String name1=request.getParameter("hname");
		String conno1=request.getParameter("hnum");
		String mail1=request.getParameter("txtEmailID");
		pw.println("<h3>Details are /h3>");
		
		pw.println("Name: " +name1+"<br>");
		pw.println("conno1: " +conno1+"<br>");
		pw.println("mail1: " +mail1+"<br>");
	
		
		
		pw.println("</body>");
		pw.println("</html>");
	}

	

}
