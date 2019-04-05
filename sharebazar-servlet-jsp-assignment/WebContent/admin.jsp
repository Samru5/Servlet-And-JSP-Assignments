<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sharebazar</title>
</head>
<body>
<form method="post" action="admin">

<label>Email-ID:</label>
<input type="email" name="email">
<br><br>
<label>Password</label>
<input type="password" name="password">
<br><br>
<input type="reset" value="Reset">

<input type="submit" value="Submit">
</form>

</body>
</html>