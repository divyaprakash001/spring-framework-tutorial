<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about</title>
</head>
<body>
	<h1>this is help page</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer rollnumber = (Integer) request.getAttribute("rollnumber");
	LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%>
	
	<h1>The name is :: <%= name %> </h1>
	<h1>The roll number is :: <%= rollnumber %> </h1>
	<h1>Time is :: <%= time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()%> </h1>

</body>
</html>