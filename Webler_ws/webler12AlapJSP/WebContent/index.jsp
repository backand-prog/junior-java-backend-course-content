<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP alapok</title>
</head>
<body>
	<%
		//megjegyzés.....
		//üres sorokat nem szereti a JSP
		int szam1 = 10;
	%>
	<h1>Forward action</h1>
	<jsp:forward page="szamol.jsp">
		<jsp:param value="<%= szam1 %>" name="szam1" />
		<jsp:param value="20" name="szam2" />
	</jsp:forward>
	
</body>
</html>