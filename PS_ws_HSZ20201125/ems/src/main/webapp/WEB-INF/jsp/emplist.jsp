<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %>
	<div class="row">
		<div class="col-sm-12">
			<div class="jumbotron bg-dark text-white">
				<h1 class="display-4 text-center"> Dolgozók</h1>
				<a class="btn btn-primary btn-sm float-right" href="new">Új dolgozó 
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
						<th>Név</th>
						<th>Beosztás</th>
						<th>Módosítás</th>
						<th>Törlés</th>

					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="emp" items="${employees}">
						<tr>
							<td>${emp.id}</td> 
							<td>${emp.lastName} ${emp.firstName}</td> 
							<td>${emp.employeeCategory.name}</td>
							<td>
							<a class="btn btn-warning" href="edit/${emp.id}">
							Módosít<i class="far fa-edit"></i></a>
							</td>
							<td>
							<a class="btn btn-danger" href="delete/${emp.id}">
							Töröl<i class="fas fa-trash"></i></a>
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
				<a class="btn btn-warning btn-sm" href="graf">Grafikusok</a>
			</div>
			<div class="col-sm">
				<a class="btn btn-success btn-sm" href="ugyint">Ügyintézők</a>
			</div>
		</div>
	</div>
<%@include file="common_footer.jsp" %>	