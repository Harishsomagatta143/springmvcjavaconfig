<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Product Details</h2>
<c:form action="addproduct" method="post" modelAttribute="prod">
<table border="1" width="400">
<tr>
<td>Product id</td>
<td><c:input path="id" required="true"/></td>
<tr>

<tr>
<td>Product name</td>
<td><c:input path="name" required="true"/></td>
<tr>

<tr>
<td>Product description</td>
<td><c:input path="description" required="true"/></td>
<tr>

<tr>
<td>Product category</td>
<td><c:select path="category" items="${cato}"/></td>
<tr>

<tr>
<td>Product price</td>
<td><c:input path="price" required="true"/></td>
<tr>

<tr>
<td><input type="submit" value="Add Product"></td>
</tr>
</table>
</c:form>
</body>
</html>