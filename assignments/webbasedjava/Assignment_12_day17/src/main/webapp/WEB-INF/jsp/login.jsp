<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<div align="center">

<h3>Enter your details</h3>

<sf:form method="post" action="/validate" >

<table>

<tr>
<td>Email : </td>
<td><sf:input path="email"/></td>
</tr>

<tr>
<td>Password : </td>
<td><sf:password path="password"/></td>
</tr>

</table>

<br/>

<input type="submit" value="Sign in" />

</sf:form>
</div>
</body>
</html>