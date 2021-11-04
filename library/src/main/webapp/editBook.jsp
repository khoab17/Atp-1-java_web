<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
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

<h3>Register a New Book</h3>
<hr>

<form action="" >
	<div class="row " >
    <label>  Select Category</label>
    <div class="col form-group">
	    <select class="form-control " id="" name="category">
	      <option value="Historical fiction">Historical fiction</option>
	      <option value="Graphic novel">Graphic novel</option>
	      <option value="Poetry">Poetry</option>
	    </select>
	    </div>
    <div class="col"></div><div class="col"></div><div class="col"></div>
  	</div>
	
	<div class="row ">
    <div class="col">
      <div class="form-outline">
      <label class="form-label" for="form3Example1">Book Title</label>
        <input type="text" class="form-control" name="title" value="${book.title}"/>    
      </div>
    </div>
    <div class="col">
      <div class="">
      <label class="form-label" >Author Name</label>
        <input type="text"  class="form-control" name="author" value="${book.author}"/>   
      </div>
    </div>
    </div>
    
    <div class="row mb-4">
	    <div class="col">
	      <div class="">
	      <label class="form-label" >Publisher</label>
	        <input type="text"  class="form-control" name="publisher" value="${book.publisher}"/>   
	      </div>
	    </div>
  	</div>
  
  <div class="row mb-4">
    <div class="col">
      <div class="">
      <label class="form-label" >Number Of Copies</label>
        <input type="text"  class="form-control" name="numberOfCopies" value="${book.numberOfCopies}"/>   
      </div>
    </div>
    <div class="col"></div>
	</div>
	
	<div class="row ">
		<input type="submit" class="btn btn-sm btn-primary col" value="Save" >
	</div>

</form>
</div>

</body>
</html>