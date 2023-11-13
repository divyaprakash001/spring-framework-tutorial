<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
	<h1>
		<c:out value="${user.name }" />
		<br />
		<c:out value="${user.email }" />
		<br />
		<c:out value="${user.street }" />
		<br />
		<c:out value="${user.city }" />
		<br />
		<c:out value="${user.state }" />
		<br />
		<c:out value="${user.zip }" />
		<br />
	</h1>
	
	
	<a href="/firstwebsite/showusers" >show all users</a>
	
</body>
</html>