package com.req;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String str1=(String) request.getAttribute("username");
		String str2=(String) request.getAttribute("password");
		
		if(str1.equalsIgnoreCase("maneesha")&&str2.equalsIgnoreCase("mani")) {
			pw.println("<h1 style=color:green;>ValidateUser</h1>");
		}
		else {
			pw.println("<h1 style=color:red;>InvalidUser</h1>");
		}
	}

}
