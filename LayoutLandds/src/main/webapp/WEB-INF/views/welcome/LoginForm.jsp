<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>

<script type="text/javascript">
function validateform(){
 
   var name=document.myform.name.value;
   var password=document.myform.password.value;
   
   if(name==null || name==""){
	   alert("Name can't be blank");
	   return false;
   }else if(password.length<6){
	   alert("Password must be at least 6 character long.");
	   return false;
   }
}   
</script>

</head>
<body>

<form action="AdminLogin" name="myform" method="post" onsubmit="return validateform()">
					<!-- JavaScript Form Validations -->
   Name:: <input type="text" name="name"><br><br>
   Password:: <input type="password" name="password"><br><br>
   <input type="submit" value="register">
</form>

</body>
</html>