<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tutorial details</title>
</head>
<body>
	<jsp:useBean id="db" class="com.sunbeam.beans.DetailsBean"></jsp:useBean>
	<jsp:setProperty name="db" property="tutorialId" param="id"/>
	${db.fetchTutorialDetails() }
	<h3><jsp:getProperty property="tut" name="db"/></h3>
	
	
	<c:choose>
		<c:when test="${ub.user.role == 'admin'}">
			<a href="manage.jsp"><button>Manage</button></a>
		</c:when>
		<c:otherwise>
			<a href="topics.jsp"><button>Topics</button></a>
		</c:otherwise>	
	</c:choose>

	<br/>
	<br/>
	<a href="logout.jsp"><button>Logout</button></a>
	
</body>
</html>