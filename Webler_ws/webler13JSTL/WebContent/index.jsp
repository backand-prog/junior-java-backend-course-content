<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>JSTL gyakorlás</title>
	</head>
	<body>
		<h1>Core tag</h1>
		<h2>Értékadás és változó felvétel</h2>
		<c:set var="bevetel" scope="session" value="${4000*4}"></c:set>
		<h2>Egyirányú elágazás</h2>
		<c:if test="${bevetel>8000}">
			<p>
				Bevételed meghaladja a 8000-et: <c:out value="${bevetel}" />
			</p>
		</c:if>
		<h2>Kétirányú elágazás</h2>
		<c:choose>
			<c:when test="${bevetel>18000}">
				<p>A bevételed 18000 felett van...</p>
			</c:when>
			<c:otherwise>
				<p>A bevételed 18000 alatt van...</p>
			</c:otherwise>
		</c:choose>
		<h2>Többirányú elágazás</h2>
		<c:set var="pontSzam" scope="session" value="${90}" />
		<c:choose>
			<c:when test="${pontSzam >=80}">
				<c:out value="${'Jó teljesítmény'}" />
			</c:when>
			<c:when test="${pontSzam<80 && pontSzam >= 50 }">
				<c:out value="${'Átlagos teljesítmény'}" />
			</c:when>	
			<c:otherwise>
				<c:out value="${'Bukás'}" />
			</c:otherwise>
		</c:choose>
		<h2>Ciklus</h2>
		<c:forEach var="i" begin="1" end="3">
			<p>Elem: <c:out value="${i}" /></p>
		
		</c:forEach>
		
		<h2>Kivételkezelés</h2>
		<c:catch var="catchTheException">
			<% int x = 2 / 0; %>
		</c:catch>
		<c:if test="${catchTheException != null }">
			 <p> A kivétel típusa: <c:out value="${catchTheException}" /></p>
			 <p> A hiba megnevezése: <c:out value="${catchTheException}" /></p>
		</c:if>
		
		<h1>Formázások - fmt</h1>
		
		<h4>Egész számok</h4>
		<h5>fmt:parseNumber tag példa</h5>
		<c:set var="osszeg" value="786.976" />
		<fmt:parseNumber var="osszegEgesz" integerOnly="true" type="number" value="${osszeg}"/>
		<p><c:out value="${osszegEgesz}"/></p>
		<h4>Törtszámok</h4>
		<c:set var="tortSzam" value="786.976"/>
		<p>Törtszám (2 tizedejegyig) : <fmt:formatNumber type="number" maxFractionDigits="2" value="${tortSzam}"/></p>
		
		<h1>Függvények - fn</h1>
		<h2>Contains</h2>
		<c:set var="forrasSzoveg" value="Ez egy teszt szöveg"/>
		<c:if test="${fn:contains(forrasSzoveg, 'teszt')}">
			<p>Megvan a 'teszt' szöveg</p>
		</c:if>
		<h2>IndexOf</h2>
		<c:set var="javaLanguage" value="java is great, java is awesome"/>
		<p> Melyik indexen található a java szó: <c:out value="${fn:indexOf(javaLanguage, 'java')}" /> </p>
		<p> Melyik indexen található a java szó: <c:out value="${fn:indexOf(javaLanguage, 'Java')}" /> </p>
		<h2>Split</h2>
		<c:set var="szoveg1" value="Ez egy teszt szöveg"/>
		<c:set var="szoveg2" value="${fn:split(szoveg1, ' ')}"/>
		<c:set var="szoveg3" value="${fn:join(szoveg2, '-')}"/>
		<p><c:out value="${szoveg3}" /></p>
		
		
</body>
</html>