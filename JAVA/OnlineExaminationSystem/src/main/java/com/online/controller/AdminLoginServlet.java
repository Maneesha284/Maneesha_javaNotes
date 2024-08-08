package com.online.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.model.StudentDAO;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String aname = request.getParameter("aname");
		String apswd = request.getParameter("apswd");
		
		StudentDAO obj=new StudentDAO();
		try {
			if(obj.validAdmin(aname, apswd)) {
				
				pw.println("<h1 style=color:green;text-align:center;>Valid user</h1>");
				response.sendRedirect("./AddQue.html");
			} 
			else {
				pw.println("<h1 style=color:red;text-align:center;>Invalid user</h1>");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
