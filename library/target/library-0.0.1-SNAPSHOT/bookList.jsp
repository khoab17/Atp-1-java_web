<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ include file="navbar.jsp" %> 
<link rel="stylesheet" href="./css/bookList.css">
</head>


<body>
	<div class="mainContent">
	<h2>Book Details:</h2>
	<table class="table table-sm table-striped">
	
	<thead class="thead-dark" >
	<tr>
	<th>Id</th>
	<th>Title</th>
	<th>Author</th>
	<th>Publisher</th>
	<th>Number Of Copies</th>
	<th>Available</th>
	<th>Category</th>
	<th>Action</th>
	<th></th>
	</tr>
	</thead>
	
	<c:forEach items="${allbooks}" var="book" >
		<tr>
			<td>${book.bookId}</p></td>
			<td>${book.title}</td>
			<td>${book.author}</td>
			<td>${book.publisher}</td>
			<td>${book.numberOfCopies}</td>
			<td>${book.numberOfAvailableCopies}</td>
			<td>${book.category}</td>	
			<td><a class="btn btn-primary btn-sm" href="UpdateBook?id=${book.bookId}">Edit</a></td>
			<td><a class="btn btn-danger btn-sm" href="RemoveBook?id=${book.bookId}">Remove</a></td>
				
		</tr>
	</c:forEach>
	
</table>
 </div>
 
 <br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
</body>
</html>