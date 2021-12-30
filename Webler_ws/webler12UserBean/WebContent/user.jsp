<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Felhasználói adatok</title>
</head>
<body>
	<jsp:useBean id="userPeldany" class="users.User"></jsp:useBean>
	<jsp:setProperty property="*" name="userPeldany"/>
	<!--  ha a request parameter és a beanben lévő nevek azonosak, akkor haszálható a fenti
	
	ha nem így van, akkor a jsp:setProperty-vel be lehet állítani egyesével
	 -->

	<h1>A felhasználó adatai: </h1>

	<%
		out.print(userPeldany.getFelhasznaloNev() + "<br>");
		out.print(userPeldany.getKor() + "<br>");
		out.print(userPeldany.getNeme() + "<br>");
		out.print(userPeldany.getHobbi() + "<br>");
	%>
	
	<% users.User tesztFelhaszalo = new users.User();
	tesztFelhaszalo.setFelhasznaloNev("gipszjakab");
	tesztFelhaszalo.setKor(55);
	tesztFelhaszalo.setNeme("1");
	tesztFelhaszalo.setHobbi("gitározás");
	%>
	
	<%= userPeldany.getFelhasznaloNev() %>
	<%= userPeldany.getKor() %>
	<%= userPeldany.getNeme() %>
	<%= userPeldany.getHobbi() %>
	<br>	
	<%= tesztFelhaszalo.getFelhasznaloNev() %>
	<%= tesztFelhaszalo.getKor() %>
	<%= tesztFelhaszalo.getNeme() %>
	<%= tesztFelhaszalo.getHobbi() %>
	
	
</body>
</html>