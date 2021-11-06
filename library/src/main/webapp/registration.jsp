
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="style.css">
     <link rel="stylesheet" href="./css/registration.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">  
   </head>
<body>

  <div>
  
  <div class="container">
    <div class="title">Registration</div>
    <div class="content">
      <form action="RegisterStudent" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">First Name</span>
            <input type="text" placeholder="Enter first name" name="fname" required>
          </div>
          <div class="input-box">
            <span class="details">Last Name</span>
            <input type="text" placeholder="Enter last username" name="lname" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" placeholder="Enter your email" name="email" required>
          </div>
          <div class="input-box">
            <span class="details">Contact</span>
            <input type="text" placeholder="Enter your number" name="contact" required>
          </div>
          <div class="input-box">
            <span class="details">Date Of Birth</span>
            <input type="date" name="dateOfBirth" required>
          </div>
          
        </div>
        <div class="gender-details">
          <input type="radio" name="gender" id="dot-1" value="male">
          <input type="radio" name="gender" id="dot-2" value="female">
          <input type="radio" name="gender" id="dot-3" value="other">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">Other</span>
          </label>
          </div>
        </div>
        
        <div class="user-details">
        <div class="input-box ">
            <span class="details">Password</span>
            <input type="password" name="password" required>
          </div>
          </div>
        
        <div class="button">
          <input type="submit" value="Register" >
        </div>
      </form>
    </div>
  </div>
  
  </div>

</body>
</html>
