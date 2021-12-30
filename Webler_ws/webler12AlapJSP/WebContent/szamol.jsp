<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP alapok - számol</title>
</head>
<body>
	<%
		out.println("Hello, JSP!!!");
		int szam1 = Integer.parseInt(request.getParameter("szam1"));
		int szam2 = Integer.parseInt(request.getParameter("szam2"));
		int osszeg = szam1+szam2;
		System.out.println(osszeg);
	%>
	<h2>Eredmény</h2>
	<h3>Összeg</h3>
	<%= szam1 %> + <%= szam2 %> = <%= szam1 + szam2 %>
	<br>
	<% 
		out.println(szam1 + " + " + szam2 + " = " + osszeg); 
	%>
	<h3> Első 10 szám négyzete </h3>
	<%!
		int negyzetreEmel(int n) {
		return n*n;
	}
	%>
	<%
		for (int i = 1; i <= 10; i++) {
			out.println(negyzetreEmel(i) + "<br>");
		}
	%>
	
	<%-- JSP megjegyzés --%>
	<!-- html megyjegzés  -->
	
</body>
</html>