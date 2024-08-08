package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Calculation extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int num1=Integer.parseInt(request.getParameter("fno"));
		int num2=Integer.parseInt(request.getParameter("sno"));
		PrintWriter pw=response.getWriter();
		String btn1=request.getParameter("btn");
		if(btn1.equals("add")) {
			pw.println("<h1 style=color:green>Addition of two numbers:"+(num1+num2)+"</h1>");
		}
		else if(btn1.equals("sub")) {
			pw.println("<h1 style=color:green>Subtraction of two numbers:"+(num1-num2)+"</h1>");
		}
		else if(btn1.equals("mul")) {
			pw.println("<h1 style=color:green>Product of two numbers:"+(num1*num2)+"</h1>");
		}
		else {
			pw.println("<h1 style=color:green>Divison of two numbers:"+(num1/num2)+"</h1>");
		}		
		
	}

}
