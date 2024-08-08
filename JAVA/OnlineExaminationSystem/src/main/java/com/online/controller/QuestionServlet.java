package com.online.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.model.Question;
import com.online.model.StudentDAO;


@WebServlet("/QuestionServlet")
public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int qid=Integer.parseInt(request.getParameter("qid"));
		String qname = request.getParameter("qname");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String option3 = request.getParameter("option3");
		String option4 = request.getParameter("option4");
		String correct = request.getParameter("correct");
		Question q=new Question(qid,qname,option1,option2,option3,option4,correct);
		StudentDAO obj=new StudentDAO();
		try {
			if(obj.addQuestion(q)) {
				pw.println("<h1 style=color:green;text-align:center;>Question is added into an exam</h1>");
				response.sendRedirect("./AddQue.html");
			} 
			else {
				pw.println("<h1 style=color:red;text-align:center;>Question is not added</h1>");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
