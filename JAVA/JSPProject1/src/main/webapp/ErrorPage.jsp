<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page errorPage="ShowError.jsp"%>
	<h3 aligh=center>Maths</h3>

	<%
	String str1 = request.getParameter("t1");
	String str2 = request.getParameter("t2");
	double nr = Double.parseDouble(str1);
	double dr = Double.parseDouble(str2);
	%>
	<center>
	Numerator is: <%= nr %>
	Denominator is: <%= dr %>
	Denominator is: <%= nr/dr %>
	</center>

</body>
</html>