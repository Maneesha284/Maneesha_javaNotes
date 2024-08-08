package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.model.User;
import com.user.model.UserDAO;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int uid=Integer.parseInt(request.getParameter("uid"));
		UserDAO dao=new UserDAO();
		try {
			User user=dao.getUser(uid);
			StringBuffer str=new StringBuffer();
			str.append("<html>\r\n");
			str.append("<head>\r\n");
			str.append("<meta charset=\"ISO-8859-1\">\r\n");
			str.append("<title>Insert title here</title>\r\n");
			str.append("<!-- CSS only -->\r\n");
			str.append("<link\r\n");
			str.append("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
			str.append("	rel=\"stylesheet\"\r\n");
			str.append("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
			str.append("	crossorigin=\"anonymous\">\r\n");
			str.append("<!-- JavaScript Bundle with Popper -->\r\n");
			str.append("<script\r\n");
			str.append("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
			str.append("	integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
			str.append("	crossorigin=\"anonymous\"></script>\r\n");
			str.append("<style>\r\n");
			str.append(".card-header {\r\n");
			str.append("	background-color: light-grey;\r\n");
			str.append("	text-align: center;\r\n");
			str.append("}\r\n");
			str.append("\r\n");
			str.append(".card-body {\r\n");
			str.append("	background-color: cyan;\r\n");
			str.append("	text-align: center;\r\n");
			str.append("}\r\n");
			str.append(".card-tail {\r\n");
			str.append("	background-color: light-grey;\r\n");
			str.append("	text-align: center;\r\n");
			str.append("}\r\n");
			str.append("</style>\r\n");
			str.append("</head>\r\n");
			str.append("<body>");
			str.append("<form action=UpdateServlet method=post>\r\n" + "		<div class=\"container\">\r\n");
			str.append("			<div class=\"card\">\r\n");
			str.append("				<div class=\"card-header\"><h1>WELCOME TO Updation PAGE<h1></h1></div>\r\n");
			str.append("				<div class=\"card-body\">\r\n");
			
			str.append("					<label for=\"fname\">  Name </label>\r\n");
			str.append("					 <input type=\"text\"	name=\"uname\" size=\"15\" value= " + user.getUname());
			
			str.append("> <br> \r\n" + "					<label for=\"lname\">Password: </label>\r\n");
			str.append("					 <input type=\"text\" name=\"pswd\" size=\"15\" value= " + user.getPswd());
			
			str.append(" ><br>\r\n" + "					<label for=\"email\"> Email: </label>\r\n");
			str.append("					 <input type=\"email\" id=\"email\"	name=\"email\"  value= " + user.getEmail());
			
			str.append("> <br> \r\n" + "					 <label for=\"uname\"> Contact number: </label>\r\n");
			str.append("					<input type=\"text\" id=\"uname\" name=\"contact\" value= " + user.getContact());
			
			str.append("> <br> \r\n" + "					<label	for=\"pwd\"> Gender</label> \r\n");
			str.append("					<input type=\"Password\" id=\"pwd\"	name=\"gender\"  value= " + user.getGender());
			
			str.append("> <br> \r\n" + "					 <label for=\"uname\"> Address: </label>\r\n");
			str.append("					<input type=\"text\" id=\"uname\" name=\"address\" value= " + user.getAddress());
			
			str.append("> <br> \r\n" + "				</div>\r\n");
			
			str.append("				<div class=\"card-tail\"><input type=\"submit\" value=\"submit\" /></div>\r\n");
			str.append("			</div>\r\n" + "		</div>\r\n" + "	</form>");

			pw.println(str);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		User u=new User(uname,pswd,email,contact,gender,address);
		UserDAO obj=new UserDAO();
		try {
			if(obj.updateUser(u)) {
				response.sendRedirect("./UserListServlet1");
			}
			else {
				pw.println("Not Updated");
				response.sendRedirect("./UserListServlet1");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
