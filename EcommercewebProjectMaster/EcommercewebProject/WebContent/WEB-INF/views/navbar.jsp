<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
  href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">"
  <!-- jQuery Library -->
  <script
  src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <!-- Latest compiled JavaScript -->
  <script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class ="navbar navbar-inverse">
<div class ="container fluid">
<div class ="navbar-header">
<button type ="button" class ="navbar-toggle" data toggle ="collapse"
data target ="#myNavbar">
<span class = "icon-bar"></span><span class ="icon bar"></span>
</button>
<a class ="navbar-brand" href="<c:url value="/index1" />">Niit Mall</a>
</div>
 <div class = "collapse navbar-collapse" id = "myNavbar"><li><a href=" <c:url value="/index1" />">Home</a></li>
				<li><a href=" <c:url value="/getAllProducts" />">Product
						List</a></li>
				<li><a href=" <c:url value="/aboutus" />">About Us</a></li></div></body>
</html>