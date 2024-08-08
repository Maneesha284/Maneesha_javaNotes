package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.user.model.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		PrintWriter pw=response.getWriter();
		int uid=Integer.parseInt(request.getParameter("uid"));
		UserDAO obj=new UserDAO();
		try {
			if(obj.deleteUser(uid)) {
				response.sendRedirect("./UserListServlet1");
			}
			else {
				pw.println("<h1 style=color:red>Tryagain</h1>");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
