<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage</title>
</head>
<body>
	<h2>Tutorial Management</h2>
	
	<table style="background-color: lightgrey; margin: auto">
	
	<tr>
	
		<th>Id</th>
		<th>Name</th>
		<th>Author</th>
		<th>Publish Date</th>
		<th>Visits</th>
		<th>Delete</th>
		<th>Edit</th>
	
	</tr>
	
	<c:forEach var="t" items="${tutorialList}">
		<tr>
		
			<td><a>${t.id }</a></td>
			<td><a href="details?id=${t.id}">${t.name}</a></td>
			<td><a>${t.author }</a></td>
			<td><a>${t.publishDate }</a></td>
			<td><a>${t.visits }</a></td>
			<td><a href="delete?id=${t.id}">Delete</a></td>
			<td><a href="edit?id=${t.id}">Edit</a></td>
		
		</tr>
		
		
	</c:forEach>
	</table>
	<a href="/add">Add New Tutorial</a>
	<br/>
	${message}
	<br/>
	<a href="/logout">Sign Out</a>
</body>
</html>
