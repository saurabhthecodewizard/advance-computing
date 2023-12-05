<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout</title>
</head>
<body>

<%
session.invalidate();
%>
<h3>Thank You</h3>

<a href="login.jsp">Login Again</a>

</body>
</html>