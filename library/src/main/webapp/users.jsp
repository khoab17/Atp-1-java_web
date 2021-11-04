<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
    

<!DOCTYPE html>
<html>
<head> <%-- <link rel="stylesheet" href="./css/users.css">  --%> 
<link rel="stylesheet" href="./css/users.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<%@ include file="navbar.jsp" %>   
<title>User List</title>
</head>

<body>
   <div class="mainContent">
   <h2>User List:</h2>
    <table class ="table table-sm table-striped">
      <thead class="thead-dark">
        <tr>
          <th>UserId</th>
          <th>Full Name</th>
          <th>Gender</th>
          <th>Date Of Birth</th>
          <th>email</th>
          <th>contact</th>	
          <th>Action</th>
        </tr>
      </thead>
	
	<c:forEach var="user" items="${allusers}">
	<tr>
		<td>${user.userId }</td>
		<td>${user.fname },${user.lname }</td>
		<td>${user.gender }</td>
		<td>${user.dateOfBirth}</td>
		<td>${user.contact}</td>
		<td>${user.email}</td>
		<td><button class="btn btn-primary btn-sm"> Edit </button></td>
	</tr>
	</c:forEach>   
    </table>
   </div>
   
   <br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
  </body>
</html>
