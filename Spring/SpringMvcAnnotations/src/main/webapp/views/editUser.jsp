<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align:center">Edit UserDetails</h2>
<hr/>
	<c:if test="${usr!=null }">
		<form action="register" method="post">
		
			Id:<input type="text" name="userid" 
			value="${usr.getUserId() }"><br/><br/>
			Name<input type="text" name="usernm" 
			value="${usr.getUserName() }"><br/><br/>
			Address:<input type="text" name="useradr"
			value="${usr.getUserAddr() }"><br/><br/>
			contact:<input type="text" name="usernum"
			value="${usr.getUserNumber() }"><br/><br/>
			<input type="submit" value="Enter">
		
		</form>
	</c:if>
</body>
</html>