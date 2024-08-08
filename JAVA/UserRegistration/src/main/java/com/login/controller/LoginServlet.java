package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.model.UserDAO;
import com.user.model.User;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		UserDAO obj = new UserDAO();
		PrintWriter pw=response.getWriter();
		try {
			if(obj.validUser(uname, pswd)) {
				response.sendRedirect("./UserListServlet1");
			}
			else {
				pw.println("<h1 style=color:red>Invalid User</h1>");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
