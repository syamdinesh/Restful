<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/css/stylesheet.css">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
  <title>Listing the Records</title>	
</head>
<body>
   <div class="container-wrapper">
       <div class="top_header">
            <div class="container" style="line-height: 31px; font-size: 1em;">
            	<div class="col-md-4 col-sm-4">
                	<span style="color: #FFF; font-weight:bold;">Customer Service # 9590400400</span>
            	</div>
            	<a class="btn btn-default btn-logout pull-right" href="<%=request.getContextPath()%>/AdminLogin">
     				<i class="fa fa-sign-in"></i>
     				Login
     			</a>
     		</div>	
     	</div>	
   </div>
   <div class="container layoutlands-head-container">
      	<div class="navbar" role="navigation">
  				<div class="navbar_header col-md-6">
  		    			<a class="navbar_brand" href="<%=request.getContextPath()%>/home">
  		    				<img src="<%=request.getContextPath() %>/resources/images/logo.png" alt="imageNotAvailable" class="img-responsive">
  		    			</a>
  				</div>  
    
       			<div class="headingLinks navbar-collapse collapse nopadding">
       			     <ul class="nav navbar-nav">
       			        <li class="active">
   						     <a href="<%=request.getContextPath() %>/home">Home</a>
   						</li>
   						<li class="dropdown">
   							 <a href="premiumProperties.jsp" class="dropdown-toggle" style="padding-top:5px;">
   							 		<span style="font-size:15px;color:#3FA3CB;font-weight:bold;text-transform:capitalize;display:block">Premium</span>
   							 		Properties
   							 </a>
   						</li>
   						<li class="dropdown">
   							<a href="aboutus.jsp">About Us</a>
   						</li>
   						<li>
   							<a href="submitRequest.jsp">Submit Request</a>
   						</li>
   					</ul>
   				</div>
   	 	</div>	
   </div>
   <div class="tabelcontainer">
   		<div style="margin:20px 20px 0 20px;" id="propertyies-container"> 
   		  <div class="listContainer">
   		  		<div class="new-prop-indicator col-md-4">
   		  				<span class="indicator-box">&nbsp;&nbsp;&nbsp;&nbsp;</span>
   		  				Newly added
   		  		</div>
   		  		<div class="col-md-4">
   		  				<img src="<%=request.getContextPath() %>/resources/images/phoneno.png" alt="NotFoundImagePath">
   		  		</div>
   		  		<div class="pull-right col-md-4" style="line-height: 28px;">
   		  				Grid Search 
   		  				<i class="fa fa-search"></i>
   		  				<input class="search form-control" placeholder="Search">
   		  		</div>
   		  </div>
         <table>
        		<tr class="heading3_list_heading">     		
        		    <td>ENo</td>
           		 	<td>EName</td> 
           		 	<td>Email</td>
           		 	<td>EMobileNumber</td>
           		 	<td>ESalary</td>	
         		</tr>
         		  
           	<c:forEach items="${listofRecordsAttribute}" var="listofRecords">
           		<tr class="heading3_list_values">
           				<td>${listofRecords.eNo}</td>
           				<td>${listofRecords.eName}</td>
           				<td>${listofRecords.email}</td>
           				<td>${listofRecords.eMobileNo}</td>
           				<td>${listofRecords.eSal}</td>
           		 </tr>		
          	</c:forEach>
          		 					
          </table>
        </div>  
   </div>     
  <div class="footer1">
      <div class="footer1_inner">
      				<h1>Corporate Office</h1>
      
      				<p>Varnasco Group.<br>
      				#396, 1st Cross, 1st Stage,<br>
      				5th Block, Ganesh Temple Road,<br>
      				HBR Layout, Bangalore,<br>
      				Karnataka-560043<br>
      				Email: helpdesk@layoutlands.com</p>
      </div>
  </div> 
  <div class="footer2">
  		<div class="footer2_left">
  		
  		</div>
  		<div class="footer2_right">
  		
  		</div>
  </div>
</body>
</html>