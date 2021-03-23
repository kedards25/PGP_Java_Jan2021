<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello HTML</h1>
	<!-- following tag is used to write java in HTML and is called as 
	scriptlet tag;scriptlet tag allows us to write java code in HTML  -->
	<h1>
		<%
			out.println("Hello JSP");
		%>
	</h1>
	<%-- This is a comment --%>
	<%! int val=5; %>
	<%
		out.println("value "+val);
	%>
	<br/>
	<%= val*5 %>
</body>
</html>