<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
	Even Odd Demo
</h2>
<%
	int val=Integer.parseInt(request.getParameter("userVal"));
	if(val%2==0)
	{
		%>
			<h1>Value is even</h1>
		<%
	}
	else
	{
		%>
			<h1>Value is odd</h1>
		<%
	}
%>
</body>
</html>