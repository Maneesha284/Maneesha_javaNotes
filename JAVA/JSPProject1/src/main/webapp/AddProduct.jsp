<%@ page import="java.sql.*"%>
<%!
	Connection con=null;
	public void jspInit(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maneesha","root","root");
			System.out.println("con success");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
%>
<%
	int pid=Integer.parseInt(request.getParameter("pid"));
	String pname=request.getParameter("pname");
	float price=Float.parseFloat(request.getParameter("price"));
	try{
		PreparedStatement ps=con.prepareStatement("insert into product1 values(?,?,?)");
		ps.setInt(1, pid);
		ps.setString(2,pname);
		ps.setFloat(3,price);
		int result=ps.executeUpdate();
		if(result>0){
			out.println("insert successfully");
		}
		else{
			out.println("insert failed");
		}
	}
	catch(Exception e){
		System.out.println(e);
	}

%>

