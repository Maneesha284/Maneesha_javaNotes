
<% String m1=request.getMethod();
	if(m1.equalsIgnoreCase("GET")){%>
<html>
<body>
	<form action="loginJSP.jsp" method="POST">
		<h4>
			<label style="color: maroon; text-align: left;">Enter User name: </label> 
			<input type="text" name="name"><br><br> 
			<label style="color: maroon; text-align: left;">Enter password: </label> 
			<input type="password" name="pswd"><br><br>
			<input type="submit" value="SIGNIN" ><br><br>
		</h4>
	</form>
</body>
</html>
<%}
	else{
		String name1=request.getParameter("name");
		String pswd1=request.getParameter("pswd");
		if(name1.equalsIgnoreCase("anu")&& pswd1.equalsIgnoreCase("anu")){
			out.println("<h1 style=color: green;>Valid</h1>");
		}
		else{
			out.println("<h1 style=color: red;>Invalid</h1>");
		}
		
	}

%>
