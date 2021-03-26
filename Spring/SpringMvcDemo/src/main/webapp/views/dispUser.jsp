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
	<c:if test="${userObj!=null }">
		<c:out value="${userObj.getUserId() }"/>
		<c:out value="${userObj.getUserName() }"/>
		<c:out value="${userObj.getUserAddr() }"/>
		<c:out value="${userObj.getUserNumber() }"/>
	</c:if>
</body>
</html>