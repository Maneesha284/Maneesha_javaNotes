package com.req;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name1=request.getParameter("name");
		String pswd1=request.getParameter("pswd");
		
		request.setAttribute("username", name1);
		request.setAttribute("password", pswd1);
		
		RequestDispatcher rd=request.getRequestDispatcher("/SecondServlet1");
		pw.println("<h1 style=color:maroon;>FirstServlet</h1>");
		rd.include(request, response);
		
				
	}

	

}
