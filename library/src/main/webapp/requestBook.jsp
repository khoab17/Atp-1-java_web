<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request a Book</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ include file="navStudent.jsp" %> 
<link rel="stylesheet" href="./css/addBook.css">
</head>
<body>

<div class="mainContent">

<h3>Request a Book</h3>
<hr>

<form action="RequestBook" method="post">

	
	<div class="row ">
    <div class="col">
      <div class="form-outline">
      <label class="form-label" for="form3Example1">Title</label>
        <input type="text" class="form-control" name="title"/>    
      </div>
    </div>
    <div class="col">
      <div class="">
      <label class="form-label" >Author</label>
        <input type="text"  class="form-control" name="author"/>   
      </div>
    </div>
    <div class="col"></div><div class="col"></div>
    </div>
    
    <div class="row mb-4">
	    <div class="col">
	      <div class="">
	      <label class="form-label" >Edition</label>
	        <input type="text"  class="form-control" name="edition" />   
	      </div>
	    </div><div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
  	
  	

  	
  	  <div class="row mb-4">
	    <div class="col">
	      <div class="">
	      <label class="form-label" >Note</label>
	        <textarea   class="form-control" name="note" ></textarea>
	      </div>
	    </div><div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
  
	
	<div class="row ">
		<input type="submit" class="btn btn-sm btn-primary col" value="Send Request" >
		<div class="col"></div><div class="col"></div>
	</div>

</form>
</div>
<br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
</body>
</html>