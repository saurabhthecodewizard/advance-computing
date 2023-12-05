<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Tutorial</title>
</head>
<body>
Hello, ${user.name} <hr/>

	<h2>Edit Tutorial</h2>
	<sf:form modelAttribute="tutorial" method="post" action="/add">
		<table>
			<tr>
				<td>Visits</td>
				<td><sf:input path="visits"/>
				<td></td>
			</tr>
			<tr>
				<td>Title</td>
				<td><sf:input path="name"/>
				<td></td>
			</tr>
			<tr>
				<td>Author</td>
				<td><sf:input path="author"/>
				<td></td>
			</tr>
			<tr>
				<td>Published On</td>
				<td><sf:input type="date" path="publishDate"/>
				<td></td>
			</tr>
			<tr>
				<td>Topic</td>
					<td><sf:select path="topicId">
						<sf:options items="${topicList}" itemValue="id" itemLabel="name" />
					</sf:select>
				<td></td>
			</tr>
			<tr>
				<td>Contents</td>
				<td><sf:textarea rows="5" cols="60" path="contents"/>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add Tutorial"/></td>
				<td></td>
			</tr>
		</table>
	</sf:form>	
	<hr/>
	<a href="/manage">Go back to Tutorials</a>
	<a href="/logout">Sign Out</a>


</body>
</html>