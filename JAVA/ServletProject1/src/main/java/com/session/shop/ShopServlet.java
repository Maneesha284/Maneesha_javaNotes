package com.session.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	HttpSession session;
	String pcode, qty;

	HttpSession clickButton;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		session=request.getSession(true);
		clickButton=request.getSession();
		
		if(clickButton.equals("removeitem")) {
			pcode=request.getParameter("pcode");
			session.removeAttribute(pcode);
			response.sendRedirect("shopExample.html");
		}
		
		if(clickButton.equals("showitem")) {
			java.util.Enumeration e=session.getAttributeNames();
			if(e.hasMoreElements()) {
				pw.println("");
			}
			
		}
		
	}
}
