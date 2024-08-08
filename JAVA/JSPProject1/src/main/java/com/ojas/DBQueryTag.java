package com.ojas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


@WebServlet("/DBQueryTag")
public class DBQueryTag extends TagSupport {
	String driver,url,user,pass,query;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	public int doStartTag() {
		System.out.println("doStartTag()");
		try {
			JspWriter out=pageContext.getOut();
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.prepareStatement("");
			ResultSet rs=st.executeQuery(query);
		}
		catch(Exception e) {
			
		}
		return 0;
		
	}
}
