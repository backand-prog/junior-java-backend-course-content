<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Útiköltség kalkuláció</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
	<jsp:useBean id="autoPeldany" class="utikoltsegKalkulator.Auto"></jsp:useBean>
	<jsp:setProperty property="*" name="autoPeldany"/>
	
	<jsp:useBean id="utPeldany" class="utikoltsegKalkulator.Utvonal"></jsp:useBean>
	<jsp:setProperty property="*" name="utPeldany"/>
	
	<jsp:useBean id="uzemAnyagPeldany" class="utikoltsegKalkulator.UzemAyag"></jsp:useBean>
	<jsp:setProperty property="*" name="uzemAnyagPeldany"/>
	
	<div class="container my-4">
		<h1>A gépjármű adatai</h1>
		<%
			out.print("Rendszám: " + autoPeldany.getRendSzam() + "<br>");
			out.print("Fogyasztás: " + autoPeldany.getFogyasztas()+ "<br>");
			out.print("Üzemayag típus: " + autoPeldany.getUzemAnyagTipus() + "<br>");
			out.print("Szállítható személyek száma: " + autoPeldany.getSzallithatoSzemelyekSzama() + "<br>");
			out.print("Motortérfogat: " + autoPeldany.getMotorTerfogat() + "<br>");
			out.print("Gyártási év: " + autoPeldany.getGyartasiEv() + "<br>");
			out.print("Évjárat kategória: " +autoPeldany.evjaratKategoriaMeghataroz() + "<br>");
		%>
		<br>
		<%
			if (autoPeldany.kevesetFogyaszetEldont()){
				out.print("<div class='alert alert-success' role='alert'>Keveset fogyaszt...</div>");
				} else {
					out.print("<div class='alert alert-danger' role='alert'>Sokat fogyaszt...</div>");
				}
		%>
		
		<%  
		
		/*
			if (autoPeldany.evjaratEldont() == -1) {
				out.print("<div class='alert alert-danger' role='alert'>Invalid érték, negatív a kor</div>");
			} else if (autoPeldany.evjaratEldont() == 0) {
				out.print("<div class='alert alert-success' role='alert'>Az autó újszerű</div>");
			} else if (autoPeldany.evjaratEldont() == 1) {
				out.print("<div class='alert alert-success' role='alert'>Az autó használt</div>");
			} else if (autoPeldany.evjaratEldont() == 2) {
				out.print("<div class='alert alert-success' role='alert'>Az autó öreg</div>");
			} else if (autoPeldany.evjaratEldont() == 3) {
				out.print("<div class='alert alert-success' role='alert'>Az autó veterán</div>");
			}
			*/
		%>
		
		<h1>Az út adatai: </h1>
		<%
			out.print("Az út hossza: (km)" + utPeldany.getHosszKm() + "<br>");
			out.print("Üzemanyagár (Ft):" + uzemAnyagPeldany.getUzemAnyagAr() + "<br>");
			out.print("Költég: " + (autoPeldany.getFogyasztas()/100)*utPeldany.getHosszKm()*uzemAnyagPeldany.getUzemAnyagAr());
		%>
		
		</div>
						
	<!--  Jqueary.slim.js 3.51 -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<!-- popper.js 1.16.1 istall  -->
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<!--  BS 4.6.0 js install -->	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
</body>
</html>