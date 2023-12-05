<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tutorials</title>
</head>
<body>

<div align="center">

Hello, ${user.name}<hr/>

<sf:forEach var="tut" items="${tutorialList}">

<a href="/details?id=${tut.id}">${tut.name} (${tut.visits})</a><br/><br/>

</sf:forEach>

</div>


</body>
</html>