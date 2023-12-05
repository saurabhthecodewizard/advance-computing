<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>

<div align="center">
Hello admin, ${user.name}<hr/>

<sf:form method="post" modelAttribute="tutorial" action="/update" >

<table border="1">

<tr>

<td>ID : </td>
<td><sf:input path="id" readonly="true" /></td>

</tr>

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
<td><sf:input path="visits" readonly="true" /></td>

</tr>

<tr>
<td>Topic : </td>
<td>
<sf:input path="topic" readonly="true" />
</td>

</tr>

<tr>

<td>Contents : </td>
<td><sf:textarea rows="5" path="contents"/></td>

</tr>

</table>
<br/>

<input type="submit" value="Update Tutorial" />

</sf:form>

<br/>

<a href="/manage"><button>Back to manage</button></a>

</div>

</body>
</html>