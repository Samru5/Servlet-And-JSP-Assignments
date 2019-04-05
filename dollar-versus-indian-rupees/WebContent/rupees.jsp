<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Table for dollars versus Indian rupees is-<br>
<table border="1">
<tr>
<th>Currency in USD</th>
<th>Conversion in rupees</th>
</tr>
<tbody>
<c:forEach var = "i" begin = "1" end = "50" step="1">
<tr>
<td><c:out value = "${i}"/></td>
<td><c:out value = "${i*45}"/></td>
</tr>


</c:forEach>
</tbody>
</table>
</body>
</html>