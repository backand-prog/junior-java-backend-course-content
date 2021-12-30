<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bejelentkezés Session</title>
</head>
<body>
	<h1>Belépés</h1>
	<form action="session_ment.jsp" method="POST">
		<label for="felhasznaloNev">Felhaszálónév</label><br>
		<input type="text" name="felhasznaloNev"><br>
		<label for="pwd">Jelszó</label><br>
		<input type="password" name="pwd"><br><br>
		<input type="submit" name="Login" value="BELÉP">
	</form>

</body>
</html>