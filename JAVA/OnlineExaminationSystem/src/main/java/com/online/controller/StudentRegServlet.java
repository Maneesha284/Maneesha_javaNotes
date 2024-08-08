package com.online.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.model.Student;
import com.online.model.StudentDAO;

@WebServlet("/StudentRegServlet")
public class StudentRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String sname = request.getParameter("sname");
		String email = request.getParameter("email");
		String contactno = request.getParameter("contactno");
		String suname = request.getParameter("suname");
		String spswd = request.getParameter("spswd");

		Student std = new Student(sname, email, contactno, suname, spswd);
		StudentDAO obj = new StudentDAO();
		try {
			if (obj.addStudent(std)) {
				pw.println("<h1 style=color:green;text-align:center;>Student Successfully registerd</h1>");
				response.sendRedirect("./StudentPage.html");
			} 
			else {
				pw.println("<h1 style=color:red;text-align:center;>Try again!</h1>");
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
