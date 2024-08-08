package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.model.User;
import com.user.model.UserDAO;

public class UserListServlet1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		UserDAO obj = new UserDAO();
		PrintWriter pw=response.getWriter();
		try {
			List<User> list=obj.listUser();
			pw.println("<table align-center border=2>");
			for(User u:list) {
				int num=u.getUid();
				pw.println("<tr>");
				
				pw.println("<td>"+num+"</td>");			
				pw.println("<td>"+u.getUname()+"</td>");
				pw.println("<td>"+u.getPswd()+"</td>");
				pw.println("<td>"+u.getEmail()+"</td>");
				pw.println("<td>"+u.getContact()+"</td>");
				pw.println("<td>"+u.getGender()+"</td>");
				pw.println("<td>"+u.getAddress()+"</td>");
				pw.println("<td><a href=DeleteServlet?uid="+num+">delete</a></td>");
				pw.println("<td><a href=UpdateServlet?uid="+num+">update</a></td>");
				
				pw.println("</tr>");
			}
			pw.println("</table>");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}

}
