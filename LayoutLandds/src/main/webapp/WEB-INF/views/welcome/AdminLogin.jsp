<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
	
</style>
<script type="text/javascript">
    function formValidation(){
    	var uname=document.AdminForm.adminUserName.value;
    	var upass=document.AdminForm.adminPassword.value;
    	
    	if(uname == null && uname==""){
    		window.alert("Name can't be empty ");
    		return false;
    	}
    	else if(upass.length<6){
    		window.alert("Password can't be less than 6");
    		return false;
    	}
    }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
   
    <form action="AdminL" name="AdminForm" onsubmit="return formValidation()">
     	<h1>Admin Login</h1>
     		Username ::<input type="text" name="adminUserName" required><br><br>
     		Password ::<input type="password" name="adminPassword" required><br><br>
     	<input type="submit" value="AdminLogin"> 
   </form>

</body>
</html>