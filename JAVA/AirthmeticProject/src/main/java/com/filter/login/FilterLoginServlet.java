package com.filter.login;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;


public class FilterLoginServlet implements Filter {
	private static final long serialVersionUID = 1L;
	public ServletContext ctx=null;
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException, ServletException {
		String uname1 =req.getParameter("name");
		String pswd1=req.getParameter("pswd");
		if(uname1.equalsIgnoreCase("mani")&&pswd1.equalsIgnoreCase("123"))
		{
			req.setAttribute("name", uname1);
			chain.doFilter(req, res);
		}
		else{
			RequestDispatcher rd=ctx.getRequestDispatcher("/FilterLogin.html");
			rd.forward(req, res);
					
		}
	}
       
    

}
