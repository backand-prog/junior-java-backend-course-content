<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %>

	<div class="row">
		<div class="col-sm-12">
			<div class="jumbotron bg-dark text-white">
				<h1 class="display-4 text-center"> Összes autó</h1>
				<a class="btn btn-primary btn-sm float-right" href="new">Új autó 
				<i class="far fa-plus-square"></i></a>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-12">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Rendszám</th>
						<th>Márka</th>
						<th>Típus</th>
						<th>Motortérfogat</th>
						<th>Gyártási év</th>
						<th>Módosít</th>
						<th>Töröl</th>
						
						
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="car" items="${car}">
						<tr>
							<td>${car.id}</td> 
							<td>${car.rendszam}</td> 
							<td>${car.marka}</td> 
							<td>${car.tipus}</td> 
							<td>${car.motorTerfogat}</td> 
							<td>${car.gyartasiEv}</td> 
							<td>
								<a class="btn btn-warning" href="edit/${car.id}">
									Módosít <i class="far fa-edit"></i> 
								</a>
							</td> 
							<td>
								<a class="btn btn-danger" href="delete/${car.id}">
									Töröl <i class="fas fa-trash"></i> 
								</a>
							</td> 		
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="d-flex bg-dark text-white p-2">
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-warning btn-sm" href="vet">Veterán</a>
			</div>
		</div>
	</div>
<%@include file="common_footer.jsp" %>	