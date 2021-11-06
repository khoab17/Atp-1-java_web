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

<h3>Register a User</h3>
<hr>

<form action="AddUser" method="post">

	
	<div class="row ">
    <div class="col">
      <div class="form-outline">
      <label class="form-label" for="form3Example1">First Name</label>
        <input type="text" class="form-control" name="fname"/>    
      </div>
    </div>
    <div class="col">
      <div class="">
      <label class="form-label" >Last Name</label>
        <input type="text"  class="form-control" name="lname"/>   
      </div>
    </div>
    <div class="col"></div><div class="col"></div>
    </div>
    
    <div class="row mb-4">
	    <div class="col">
	      <div class="">
	      <label class="form-label" >Email</label>
	        <input type="text"  class="form-control" name="email" />   
	      </div>
	    </div><div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
  	
  	
  		<div class="row mb-4" >
    <label class="col ">Select Gender</label>
	    <select class="form-control col " id="" name="gender">
	      <option value="Male">Male</option>
	      <option value="Female">Female</option>
	      <option value="Other">Other</option>
	    </select>
    <div class="col"></div><div class="col"></div><div class="col"></div><div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
  	
  	  <div class="row mb-4">
	    <div class="col">
	      <div class="">
	      <label class="form-label" >Date Of Birth</label>
	        <input type="date"  class="form-control" name="dateOfBirth" />   
	      </div>
	    </div><div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
  
  <div class="row mb-4">
    <div class="col">
      <div class="">
      <label class="form-label" >Contact</label>
        <input type="text"  class="form-control" name="contact"/>   
      </div>
    </div>
    <div class="col"></div><div class="col"></div>
	</div>
	
	 <div class="row mb-4">
    <div class="col">
      <div class="">
      <label class="form-label" >Password</label>
        <input type="password"  class="form-control" name="password"/>   
      </div>
    </div>
    <div class="col"></div><div class="col"></div>
	</div>
	
	<div class="row ">
		<input type="submit" class="btn btn-sm btn-primary col" value="Add" >
		<div class="col"></div><div class="col"></div>
	</div>

</form>
</div>
<br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
</body>
</html>