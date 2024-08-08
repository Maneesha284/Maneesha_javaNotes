package com.online.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.model.Question;
import com.online.model.StudentDAO;

@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Question q = new Question();
		StudentDAO dao = new StudentDAO();
		List<Question> li;
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		try {
			li = dao.listQuestions();

			int count = 0;
			for (Question qu : li) {
				int qno = qu.getQid();
				String res = request.getParameter("" + qno + "");
				String ans = qu.getCorrect();

				if (res.equalsIgnoreCase(ans)) {
					count++;
				}

			}
			pw.println("<h1 style=color:green;text-align:center;>Your score marks is : "+count+"</h1>");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

}
