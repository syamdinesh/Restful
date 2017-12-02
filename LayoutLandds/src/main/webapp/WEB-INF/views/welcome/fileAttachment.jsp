<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
    form{
        text-align:center;
        margin:30px;
        padding: 30px;
        border:10px;
        font-family:calibri;
    }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Attachment</title>
</head>
<body>
	<form action="uploadFileToController" enctype="multipart/form-data" method="post">
		<h1>Attach An ExcelSheet Here</h1>
    	Attach File: <input type="file" name="excelFile" accept=".xlsx"><br><br>
    	<input type="submit" value="Upload">
    </form> 
</body>
</html>