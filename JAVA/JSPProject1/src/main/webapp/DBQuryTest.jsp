<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://org-ojas/hello-taglib" prefix="db"%>
<db:dbquery diver="" url="" user="" pass="" query='<%= request.getParameter("sql") %>'/>
<-- comment -->