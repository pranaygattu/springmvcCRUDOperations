<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url var="addAction" value="/employee/add" ></c:url>
 

	<form:form action="${addAction}" modelAttribute="customer">
	
	<label>Name</label>
	<input type="text" name="name">
	<br>
	<label>City</label>
	<input type="text" name="city">
	<br>
	<label>Country</label>
	<br>
	<input type="text" name="country">
	<br>
	<input type="submit" value="submit"> 
	
	
	</form:form>

</body>
</html>