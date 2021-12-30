<%@ page import="eu.pontsystems.javatanfolyam.konyvtar.model.Msg" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Üdvözöllek</title>
</head>
<body>
	<h1>Üdvözöllek</h1>
	<br/>
	<br/>
 	<span>${ msg.uzenet }: ${ msg.nev }</span>
	<a href="book/list">Belépés a könyvtár alkalmazásba</a>
</body>
</html>