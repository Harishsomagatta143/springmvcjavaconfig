<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Details of all Products</h2>
<table border="2px">
<tr>
<td>Product Id</td>
<td>Product Name</td>
<td>Product description</td>
<td>Product Category</td>
<td>Product Price</td>
</tr>


<a:forEach var="pro" items="${showproduct}">
<tr>
<td>${pro.id}</td>
<td>${pro.name}</td>
<td>${pro.description}</td>
<td>${pro.category}</td>
<td>${pro.price}</td>
</tr>
</a:forEach>
</table>
</body>
</html>