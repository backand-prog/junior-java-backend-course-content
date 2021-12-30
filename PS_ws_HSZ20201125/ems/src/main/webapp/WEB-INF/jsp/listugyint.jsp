<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %>

	<div class="row">
		<div class="col-sm-12">
			<div class="jumbotron bg-dark text-white">
				<h1 class="display-4 text-center"> Ügyintézők</h1>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-12">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Vezetéknév</th>
						<th>Keresznév</th>
						<th>Beosztás</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${emp}">
						<tr>
							<td>${emp.id}</td> 
							<td>${emp.lastName}</td> 
							<td>${emp.firstName}</td> 
							<td>${emp.employeeCategory.name}</td> 
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="d-flex flex-row-reverse justify-content-center bg-dark text-white p-2">
		<a class="btn btn-warning" href="javascript:history.go(-1)">
			<i class="fas fa-arrow-left"></i> Vissza
		</a>
	</div>
<%@include file="common_footer.jsp" %>	