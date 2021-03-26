<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="create-user" method="post">
		<form:input path="userName"/>
		<form:input path="userAddr"/>
		<form:input path="userNumber"/>
		<input type="submit" value="save">
	</form:form>
</body>
</html>