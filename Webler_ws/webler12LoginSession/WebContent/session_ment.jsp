<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session - ment</title>
</head>
<body>
	<% 
		String userName = request.getParameter("felhasznaloNev");
		out.println("Hello, " + userName + "! (request.getParameter)"); 
		
		session.setAttribute("felhasznaloNev", userName);
		session.removeAttribute("felhasznaloNev");
		
		String userNameAfterRemove = (String)(session.getAttribute("felhasznaloNev"));
	
		out.println("remove után: " + userNameAfterRemove + "!");
		
	%>
	
	<br><br>
	
	<a href="session_olvas.jsp">Továbblépünk egy új oldalra</a>


</body>
</html>