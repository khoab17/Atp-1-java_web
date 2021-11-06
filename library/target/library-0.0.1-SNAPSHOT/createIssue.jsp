<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ include file="navbar.jsp" %> 
<link rel="stylesheet" href="./css/addBook.css">
</head>
<body>

<div class="mainContent">

<h3>Create an Issue:</h3>
<hr>

<form action="CreateIssue" method="post">	
	<div class="row ">
    <div class="col">
      <div class="form-outline">
      <label class="form-label" for="form3Example1">Book ID</label>
        <input type="text" class="form-control" name="bookId"/>    
      </div>
    </div>
    <div class="col">
      <div class="">
      <label class="form-label" >Student ID </label>
        <input type="text"  class="form-control" name="studentId"/>   
      </div>
    </div>
    </div>
    
    <div class="row mb-4">
	    <div class="col">
	      <div class="">
	      <label class="form-label" >Date Of Issue</label>
	        <input type="date"  class="form-control" name="dateOfIssue" />   
	      </div>
	    </div>
	    <div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
  
  <div class="row mb-4">
    <div class="col">
      <div class="">
      <label class="form-label" >Date Of Return</label>
        <input type="date"  class="form-control" name="dateOfReturn"/>   
      </div>
    </div>
    <div class="col"></div><div class="col"></div><div class="col"></div>
	</div>
	
	<div class="row ">
		<input type="submit" class="btn btn-sm btn-primary col" value="Create" >
	</div>

</form>
</div>
<br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
</body>
</html>