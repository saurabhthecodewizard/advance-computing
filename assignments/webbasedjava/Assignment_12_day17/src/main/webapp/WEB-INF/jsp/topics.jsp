<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Topic</title>
</head>
<body>

Hello, ${user.name}<hr/>

<h2>Topics</h2>

<sf:form method="post" action="/topictutorials">

<sf:radiobuttons path="topic" items="${topicList}" itemValue="id" itemLabel="name" delimiter="<br/>" />
<br/><br/>
<input type="submit" value="Submit" />
</sf:form>


</body>
</html>