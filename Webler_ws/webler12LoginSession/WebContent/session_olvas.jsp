<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session - olvas</title>
</head>
<body>
	<%
	String userName = request.getParameter("felhasznaloNev");
	out.println("Hello, " + userName + "! (request.getParameter) <br>");
	
	String userName2 = (String)(session.getAttribute("felhasznaloNev"));
	
	out.println("Hello, " + userName2 + "! (session-ből...)");
	
	%>
	
	
	
</body>
</html>