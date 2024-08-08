package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrintCookieServlet")
public class PrintCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Cookie servlet print</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>servlet Cookie servlet at"+request.getContextPath()+"</h1>");
		
		pw.println("<h2>cookie details</h2>");
		Cookie[] cookie=request.getCookies();
		for(int i=0;i<cookie.length;i++) {
			pw.println("Cookie key/name "+cookie[i].getName()+"<br>");
			pw.println("Cookie value "+cookie[i].getValue()+"<br>");
		}
		pw.println("</body>");
		pw.println("</html>");
	}

}
