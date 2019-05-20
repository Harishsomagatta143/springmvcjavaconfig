<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href=style.css" type="text/css">
<title>Insert title here</title>
</head>
<div align="center">
<div id="container">
<body>
<h2><b>Login Page</b></h2>

<form action="checkLogin" method="post">
<table border="1" >
<tr>
<td>User Name </td>
<td><input type="text" name="uname"/></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="upass"/></td>

</tr>
<tr>
<td><div style="text-align:right"> <input type="submit" name="LOGIN"/></div></td>
</tr>

</table>
</form>
</body>
</div>
</div>
</html>