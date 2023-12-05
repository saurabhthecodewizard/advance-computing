<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<form action="process.jsp" method="post">
	
		Name : <input type="text" name="name"/> <br/><br/>
		Email : <input type="text" name="email"/> <br/><br/>
		Password : <input type="password" name="password"/> <br/><br/>
		Registration Amount : <input type="text" name="reg_amount"/> <br/><br/>
		Registration Date : <input type="text" name="reg_date"/> <br/><br/>
		
		<input type="submit" value="Register"/>	
	
	</form>

</body>
</html>