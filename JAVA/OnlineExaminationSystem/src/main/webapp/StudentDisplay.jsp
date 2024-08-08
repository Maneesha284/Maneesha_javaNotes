<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.online.model.*"%>
<%@ page import="com.online.controller.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
	crossorigin="anonymous"></script>
</head>
<body style="background-color:powderblue;"><h4>
	<p style="text-align:center;background-color:maroon;">ONLINE EXAM</p>
	<form action="ScoreServlet" method="post" class="form-inline" class="form-horizontal">
		<div class="row">
			<div class="col-md-12">
				<div class="alert alert-default">

					<%
					StudentDAO std  = new StudentDAO();
					List<Question> li =std.listQuestions();
						%>
					<%
					for(Question q: li)
					{
						int qno =q.getQid();
						
						String qname=q.getQname();
						%>
					<div class="form-group">
					<strong><label><%= qno %>). <%= qname %></label></strong>
					</div>

					<div class="radio">
						<input type="radio" name="<%= qno %>" value="<%=q.getOption1() %>" /><%=q.getOption1()  %></div>

					<div class="radio">
						<input type="radio" name="<%= qno %>" value="<%=q.getOption2() %>"  /><%= q.getOption2() %></div>

					<div class="radio">
						<input type="radio" name="<%= qno %>" value="<%=q.getOption3() %>"  /><%= q.getOption3() %></div>

					<div class="radio">
						<input type="radio" name="<%= qno %>" value="<%=q.getOption4() %>" /><%= q.getOption4() %></div>
						<br>
					<%
				
					} %>
					<input type="submit" value="Finish Exam" class="btn btn-primary">
					<input type="reset" value="Reset" class="btn btn-danger">
				</div>
			</div>
		</div>
	</form>
</h4></body>
</html>