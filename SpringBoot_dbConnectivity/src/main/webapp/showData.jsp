<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Roll No </th>
			<th>Student Name </th>
			<th>Birth Date </th>
			<th>Address </th>
		</tr>
		<c:forEach var="stud" items="${list}">
		<tr>
			<td>${stud.rollNo}</td>
			<td>${stud.studName}</td>
			<td>${stud.birthDate}</td>
			<td>${stud.resAdd}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>