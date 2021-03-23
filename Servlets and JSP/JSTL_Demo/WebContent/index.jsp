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
<!-- if action is not given to form then form 
is submitted to same page itself -->
	<form>
		<input type="text" name="userVal"/>
		<input type="submit" value="Enter"/>
	</form>
	<!--
	JSTL which allows us to use java logic in the form of tags
	JSTL looks like HTML but follows XML syntax 
	which has following rules
	1.every opening tag must have closing tag
	2.if tag is without body then tag must be closed with '/' at the end
	3.tags should be closed in the order opposite to which they were opened
	4.attributes must be closed using " "(double quotation marks)
	5.It is case-sensitive -->
	<!-- the syntax starting with $ in following line is
	called as expression language(EL)
	EL helps to access values from HTML and Servlets in JSP using JSTL -->
	
	<c:set var="num" value="${param.userVal}"/>
	<c:if test="${num%2==0}">
		<!-- <h1>Value is even</h1> -->
		<c:out value="number is even"></c:out>
	</c:if>
	
<%-- 	<c:otherwise>
		<h1>Value is odd</h1>
	</c:otherwise> --%>
	
</body>
</html>