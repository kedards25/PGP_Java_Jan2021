<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
​<style>
body
{
	font-family: arial, sans-serif;
}
table {
  
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<h2 style="text-align: center">User Details</h2>
<hr/>
<a href="create-user">Add User</a>
<br/><br/>
	<c:if test="${mdList!=null }">
		
		<table border="1">
  <tr>
    <th>User Id</th>
    <th>User Name</th>
    <th>Address</th>
    <th>Contact Number</th>
    <th colspan="2">Actions</th>
  </tr>
  <c:forEach var="md" items="${mdList}">
  <tr>
    <td><c:out value="${md.getUserId() }" /></td>
    <td><c:out value="${md.getUserName() }" /></td>
    <td><c:out value="${md.getUserAddr() }" /></td>
    <td><c:out value="${md.getUserNumber() }" /></td>
    <td><a href="edit-user">Edit Details</a>
    <a href="delete-user">Delete</a></td>
  </tr>
  </c:forEach>
</table>
			
			
			
			

		
	</c:if>
</body>
</html>