<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>


	<div style="text-align: center; border:1px solid green;">
	<h1>${Header }</h1>
	<p>${desc }</p>
	
	<hr>
	<h1 style="color: green;"> ${msg}</h1>
		<h1 style="color: green;">Welcome, ${user.username}</h1>
		<h1>Your email address is :: ${user.email}</h1>
		<h1>Password :: ${user.password}try to secure it</h1>
	</div>
</body>
</html>