<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
	 <link rel="stylesheet" href="./css/login.css">
</head>
<body>
<form method="post" action="Login">
<div class="box">
<h1>Login</h1>

<input type="email" name="email" placeholder="email" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" />
  
<input type="password" name="password" placeholder="*****" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" />
  
<div> <button type="submit"  class="btn">Sign In</button></div> <!-- End Btn -->

<a href="#"><div id="btn2">Sign Up</div></a> <!-- End Btn2 -->



  
</div> <!-- End Box -->
  
</form>

<c:if test="${fn:contains(param.message,'error')}">
<br><p>Login failed</p><br/>
</c:if> 

<p>Forgot your password? <u style="color:blue">Click Here!</u></p>
</body>
</html>

