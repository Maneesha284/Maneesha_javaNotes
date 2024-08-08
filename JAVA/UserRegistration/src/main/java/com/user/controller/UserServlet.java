package com.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.model.User;
import com.user.model.UserDAO;

public class UserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		User user = new User(uname, pswd, email, contact, gender, address);
		UserDAO obj = new UserDAO();

		try {
			if (obj.addUser(user)) {
				pw.println("<h1 style=color:green>User Successfully registerd</h1>");
			} else {
				pw.println("<h1 style=color:red>Try again!</h1>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
