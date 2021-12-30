<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>

	<div class="row">
		<div class="col-sm-12">
			<div class="jumbotron bg-dark text-white">
				<h1 class="display-4 text-center">Könyvek</h1>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-sm-12">
			<table class="table table-hover">
				<thead class="thead-dark">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Cím</th>
						<th scope="col">Szerző</th>
						<th scope="col">Műveletek</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${books}">
					<tr>
						<th scope="row">${book.id }</th>
						<td>${book.title }</td>
						<td>${book.author }</td>
						<td>
							<div class="d-flex justify-content-between">
								<a class="btn btn-warning" href="edit?id=${book.id}">Módosítás <i class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
								<a class="btn btn-danger" href="del?id=${book.id }">Törlés <i class="fa fa-trash-o" aria-hidden="true"></i></a>
							</div>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<div class="d-flex flex-row-reverse bg-dark text-white p-2 justify-content-center" >
		<a class="btn btn-primary btn-lg" href="new">
			Új könyv <i class="fa fa-plus-square-o" aria-hidden="true"></i>
		</a>
	</div>
	
<%@include file="includes/footer.jsp" %>