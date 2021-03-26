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
	<c:if test="${modelObj!=null }">
		<c:out value="${modelObj.getUserId() }"/>
		<c:out value="${modelObj.getUserName() }"/>
		<c:out value="${modelObj.getUserAddr() }"/>
		<c:out value="${modelObj.getUserNumber() }"/>
	</c:if>
</body>
</html>