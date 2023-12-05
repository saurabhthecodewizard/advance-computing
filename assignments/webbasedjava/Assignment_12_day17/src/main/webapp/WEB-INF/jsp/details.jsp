<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>

<div align="center">

Hello, ${user.name}<hr/>

<br/>

<table border="1">

<tr>

<td bgcolor="cyan">Id : </td>
<td>${tutorial.id}</td>
</tr>
<tr>
<td bgcolor="cyan">Name : </td>
<td>${tutorial.name}</td>
</tr>
<tr>
<td bgcolor="cyan">Author : </td>
<td>${tutorial.author}</td>
</tr>
<tr>
<td bgcolor="cyan">Published date : </td>
<td>${tutorial.publishDate}</td>
</tr>
<tr>
<td bgcolor="cyan">Visits : </td>
<td>${tutorial.visits}</td>
</tr>
<tr>
<td bgcolor="cyan">Contents : </td>
<td>${tutorial.contents}</td>
</tr>

</table>

<br/>

<c:choose>

<c:when test="${user.role == 'admin'}">
<a href="/manage">Manage</a>
</c:when>

<c:otherwise>
<a href="/topicsurl">Back to Topics</a>
</c:otherwise>

</c:choose>

<br/>
<br/>

<a href="/logout">Logout</a>

</div>

</body>
</html>