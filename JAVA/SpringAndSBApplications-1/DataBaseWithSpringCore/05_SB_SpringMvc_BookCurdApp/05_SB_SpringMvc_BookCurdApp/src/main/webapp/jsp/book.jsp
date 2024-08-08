<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>

<form:form  action="insert" modelAttribute="book" method="post">
Book Name : <form:input path="bookName"/>

Book Author : <form:input path="authorName"/>

Book Price : <form:input path="bookPrice"/>

<input type="submit" value="Insert"/>


</form:form>
<a href="viewAllRecords">ViewAllRecords</a>
</body>
</html>