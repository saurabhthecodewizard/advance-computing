<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>

<div align="center">

Hello, ${user.name}<hr/>

<sf:form method="post" modelAttribute="tutorial" action="/add">
<table border="1">

<tr>

<td>Name : </td>
<td><sf:input path="name"/></td>

</tr>

<tr>

<td>Author : </td>
<td><sf:input path="author"/></td>

</tr>

<tr>

<td>Publish Date : </td>
<td><sf:input type="date" path="publishDate"/></td>

</tr>

<tr>

<td>Visits : </td>
<td><sf:input path="visits"/></td>

</tr>

<tr>
<td>Topic : </td>
<td>
<sf:select modelAttribute="command" path="topic">
<sf:options items="${topicList}" itemValue="id" itemLabel="name" />
</sf:select>
</td>

</tr>

<tr>

<td>Contents : </td>
<td><sf:textarea rows="5" path="contents"/></td>

</tr>

</table>

<br/>

<input type="submit" Value="Add tutorial" />

</sf:form>

<br/>

<a href="/manage"><button>Back to manage</button></a>

</div>
</body>
</html>