<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

    <%@page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!-- //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css
 --><link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">
<script>
$(document).ready(function() {
	$('#stutab').DataTable({
		"pagingType" : "full_numbers"
	});
});
</script>
<script>
	function deleteConfirm(){
		return confirm("Are you sure, you want to delete?");
	}
</script>
</head>
<body>
	<H3>view Students</H3>

	<a href="loadForm">Add Book Student</a>
	<table border="2" id="stutab">
		<thead>
			<tr>
				<th>BookID</th>
				<th>BookName</th>
				<th>BookAuthor</th>
				<th>BookPrice</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${bookrecordss}" var="book">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.authorName}</td>
					<td>${book.bookPrice}</td>
					<%-- ///@{'/edit/' + ${product.id}} --%>
<%-- 					<td><a href="editstu/${s.sno}">Edit</a></td>
 --%>
<%--  <td><a href="editstu/${s.sno}">Edit</a></td>
 --%>
  <td><a href="editstu?id=${book.bookId}">Edit</a></td>
     <td><a href="deletestu?id=${book.bookId}" onclick="deleteConfirm()">Delete</a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>