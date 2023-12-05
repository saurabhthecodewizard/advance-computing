<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="sf" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
	Hello, ${user.name} <hr/>

	<h2>Tutorial</h2>
	<h4>${tutorial.name}</h4>
	<h5>${tutorial.author}</h5>
	<div>
		Published: ${tutorial.publishDate}
	</div>
	<div>
		Visits: ${tutorial.visits}
	</div>
	<hr/>
	<div>
		${tutorial.contents}
	</div>
	<sf:choose>
		<sf:when test="${user.role == 'admin' }"><a href="/manage">Manage</a></sf:when>
		<sf:otherwise><a href="/topicsurl">Topics</a></sf:otherwise>
	</sf:choose>
	
	
	<a href="/logout">Sign Out</a>
</body>
</html>
