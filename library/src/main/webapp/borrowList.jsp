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
<%@ include file="navStudent.jsp" %> 
<link rel="stylesheet" href="./css/bookList.css">
</head>


<body>
	<div class="mainContent">
	<h2>Borrow List:</h2>
	<table class="table table-sm table-striped">
	
	<thead class="thead-dark" >
	<tr>
	<th>Id</th>
	<th>Book ID</th>
	<th>Date Of Issue</th>
	<th>Date Of Return </th>
	<th>Status</th>
	</tr>
	</thead>
	
	<c:forEach items="${issues}" var="issue" >
		<tr>
			<td>${issue.issueId}</p></td>
			<td>${issue.bookId}</td>
			<td>${issue.dateOfIssue}</td>
			<td>${issue.dateOfReturn}</td>
			<td>${issue.status}</td>
		</tr>
	</c:forEach>
	
</table>
 </div>
 
 <br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
</body>
</html>