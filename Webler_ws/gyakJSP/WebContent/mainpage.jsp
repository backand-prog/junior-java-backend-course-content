<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
</head>
<body>
	<h1>Data</h1>
	<% 
	String name = request.getParameter("username"); 
	out.println(name);
	%>

</body>
</html>