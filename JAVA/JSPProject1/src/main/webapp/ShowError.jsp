
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page isErrorPage="true"%>
<h4>This is showError.jsp page </h4>

<% exception.printStackTrace (new java.io.PrintWriter(out)); %>

</body>
</html>