package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookieTestServlet")
public class CookieTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Cookie servlet </title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>servlet Cookie servlet at"+request.getContextPath()+"</h1>");
		
		String lucky=request.getParameter("luckyno");
		Cookie cookie1=new Cookie("luckyno",lucky);
		response.addCookie(cookie1);
		pw.println("<a href='PrintCookieServlet'>Display cookie</a>");
		pw.println("</body>");
		pw.println("</html>");
		
	}

}
