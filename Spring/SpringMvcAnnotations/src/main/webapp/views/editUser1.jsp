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
		<c:if test="${modelObj!=null }">
		<form action="../edit-user/${modelObj.getUserId() }" method="post">
		
			Id:<input type="text" name="userid" 
			value="${modelObj.getUserId() }"><br/><br/>
			Name:<input type="text" name="usernm" 
			value="${modelObj.getUserName() }"><br/><br/>
			Address:<input type="text" name="useradr"
			value="${modelObj.getUserAddr() }"><br/><br/>
			contact:<input type="text" name="usernum"
			value="${modelObj.getUserNumber() }"><br/><br/>
			<input type="submit" value="Enter">
		
		</form>
	</c:if>
</body>
</html>