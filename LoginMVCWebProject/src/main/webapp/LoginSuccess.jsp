<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.time.LocalDateTime,com.demo.model.UserPojo" contentType="text/html; charset=UTF-8" %>   


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>
<body>

	<%
	
	UserPojo userPojo = (UserPojo)request.getAttribute("user-details");
	
	%>

	<h2>Welcome <%= userPojo.getUserName() %></h2>
	<h3>Login Success!!!</h3>
	
	<%
	
	LocalDateTime serverDateTime =  LocalDateTime.now();
	out.println("<h3>You have Logged in to the server at " + serverDateTime + " time.");
	
	%>
	
	<p><a href="Login.html">Logout</a></p>
</body>
</html>