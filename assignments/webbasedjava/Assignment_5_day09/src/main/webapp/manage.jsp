<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>

<jsp:useBean id="tut" class="com.sunbeam.beans.TutorialBean"></jsp:useBean>
${tut.fetchTutorialList() }


<table style="background-color: lightgrey; margin: auto">

	<tr>
	
		<th>Id</th>
		<th>Name</th>
		<th>Author</th>
		<th>Publish Date</th>
		<th>Visits</th>
		<th>Action</th>
	
	</tr>
	
	<c:forEach var="t" items="${tut.tutorialList}">
		<tr>
		
			<td><c:out value="${t.id }"></c:out></td>
			<td><a href="details.jsp?id=${t.id}">${t.name}</a></td>
			<td><c:out value="${t.author }"></c:out></td>
			<td><c:out value="${t.publishDate }"></c:out></td>
			<td><c:out value="${t.visits }"></c:out></td>
			<td><a href="delete.jsp?id=${t.id}">Delete</a></td>
		
		</tr>
	</c:forEach>

</table>

<a href="registration.jsp"><button>User Registration</button></a>

</body>
</html>