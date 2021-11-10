<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request a Book</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ include file="navbar.jsp" %> 
<link rel="stylesheet" href="./css/addBook.css">
</head>
<body>

<div class="mainContent">

<h3>Make a Fine</h3>
<hr>

<form action="AddFine" method="post">

	<% String id=request.getParameter("id"); %>
	<div class="row ">
    <div class="col">
      <div class="form-outline">
      <label class="form-label" for="form3Example1">Issue Id</label>
        <input type="text" class="form-control" name="issueId" value="<% out.print(id); %>" disabled/> 
        <input type="hidden" name="id" value="<%=request.getParameter("id")%>" />   
      </div>
    </div>
    <div class="col">
      <div class="">
      <label class="form-label" >Fine</label>
        <input type="text"  class="form-control" name="fine"/>   
      </div>
    </div>
    <div class="col"></div><div class="col"></div>
    </div>
    
	 <div class="row mb-4">
	    <div class="col">
	      <div class="">
	      <label class="form-label" >Comment</label>
	        <textarea   class="form-control" name="comment" ></textarea>
	      </div>
	    </div><div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
  
	
	<div class="row ">
		<input type="submit" class="btn btn-sm btn-primary col" value="submit" >
		<div class="col"></div><div class="col"></div>
	</div>

</form>
</div>
<br><br><br><br><br><br>
<%@ include file="footer.jsp" %> 
</body>
</html>