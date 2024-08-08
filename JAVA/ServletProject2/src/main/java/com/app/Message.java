package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Message extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init started");
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pswd");
		PrintWriter pw = response.getWriter();
		if(name.equals("mani") && (pwd.equals("123"))){
			pw.println("<h1 style=color:green;>Valid user</h1>");
		}
		else {
			pw.println("<h1 style=color:red;>Invalid user</h1>");
		}
		
		
	}

}
