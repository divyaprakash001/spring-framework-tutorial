<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about</title>
</head>
<body>
	<h1>this is help page</h1>
	<h1>The name is :: ${name}</h1>
	<h1>The roll number is :: ${rollnumber}</h1>
	<h1>Time is :: ${time}</h1>
	<hr>
	
	<c:forEach var="item" items="${marks}" >
		<h1> <c:out value="${item }" /></h1>
	</c:forEach>

</body>
</html>