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
<link rel="stylesheet" href="./css/studentList.css">
</head>


<body>
	<div class="mainContent">
	<h2>Student list:</h2>
	<table class="table table-sm table-striped">
	
	<thead class="thead-dark" >
	<tr>
	<th>Id</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Gender</th>
	<th>DOB</th>
	<th>Contact</th>
	<th>Email</th>
	<th></th>
	</tr>
	</thead>
	
	<c:forEach items="${allstudents}" var="student" >
		<tr>
			<td>${student.userId}</td>
			<td>${student.fname}</td>
			<td>${student.lname}</td>
			<td>${student.gender}</td>
			<td>${student.dateOfBirth}</td>
			<td>${student.contact}</td>
			<td>${student.email}</td>	
			<td><button class="btn btn-primary btn-sm">Edit</button></td>
				
		</tr>
	</c:forEach>
	
	

	
	</table>
 </div>
 
 <br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
</body>
</html>