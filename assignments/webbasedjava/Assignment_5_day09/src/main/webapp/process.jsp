<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process</title>
</head>
<body>

	<jsp:useBean id="ur" class="com.sunbeam.beans.UserRegistration"/>	
	
	<%--
		<jsp:setProperty name="ur" property="name" param="name"/>
		<jsp:setProperty name="ur" property="email" param="email"/>
		<jsp:setProperty name="ur" property="password" param="password"/>
		<jsp:setProperty name="ur" property="registrationAmount" param="reg_amount"/>
		<jsp:setProperty name="ur" property="date" param="reg_date"/>
	 --%>
	
	
	<jsp:setProperty name="ur" property="*"/>
	
	${ur.addUser() }
	
	<h3>User successfully registered...</h3>
	

</body>
</html>