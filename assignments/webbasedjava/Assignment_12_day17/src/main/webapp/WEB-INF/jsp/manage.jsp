<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage</title>
</head>
<body>

<div align="center">

Hello admin, ${user.name}<hr/>

<table border="1">

<tr>

<th>ID</th>
<th>Name</th>
<th>Author</th>
<th>Published Date</th>
<th>Update</th>
<th>Demo</th>

</tr>

<sf:forEach var="tut" items="${tutorialList}">

<tr>

<td>${tut.id}</td>
<td><a href="/details?id=${tut.id}">${tut.name}</a></td>
<td>${tut.author}</td>
<td>${tut.publishDate}</td>
<td><a href="/update?id=${tut.id}">Update</a></td>
<td><a href="/delete?id=${tut.id}">Delete</a></td>

</tr>

</sf:forEach>

</table>

<br/>
<a href="/add">Add a tutorial</a>
<br/>
<br/>
<a href="/logout">Logout</a>

</div>

</body>
</html>