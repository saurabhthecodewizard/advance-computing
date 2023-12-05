<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>

	<jsp:useBean id="tdb" class="com.sunbeam.beans.TutorialDeleteBean"></jsp:useBean>
	<jsp:setProperty property="tut_id" name="tdb" param="id"/>
	
	${tdb.deleteTutorial() }
	
	<jsp:forward page="manage.jsp"></jsp:forward>

</body>
</html>