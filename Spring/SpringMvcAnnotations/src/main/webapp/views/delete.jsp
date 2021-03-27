<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form style="margin-left: 30%" method="post">
		<p>Do you want to delete data of Id:${modelId }</p>
		<input type="submit" value="yes"/>
		<input type="reset" value="no"/>
	</form>
</body>
</html>