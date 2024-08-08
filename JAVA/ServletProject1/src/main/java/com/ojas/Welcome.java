package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public Welcome() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method");
	}

	public void destroy() {

	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.println("<h1 style=color:red;>WELCOME </h1>");

	}
}
