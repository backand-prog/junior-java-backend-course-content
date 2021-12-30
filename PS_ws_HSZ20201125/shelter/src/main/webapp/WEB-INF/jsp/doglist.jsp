<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %>

<div class="row">
	<div class="col-sm 12">
		<div class="jumbotron bg-dark text-white">
		<h1 class="display-4 text-center">Összes kutya</h1>
		<a class="btn btn-primary btn-sm float-left" href="new">Új kutya
		<i class="far fa-plus-square"></i>
		</a>
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
					<th>Kor</th>
					<th>Státusz</th>
					<th>Módosít</th>
					<th>Töröl</th>
				</tr>
			</thead>			
			<tbody>
				<c:forEach var="dog" items="${dogs}">
					<tr>
						<td>${dog.id}</td>
						<td>${dog.name}</td>
						<td>${dog.age}</td>
						<td>${dog.status}</td>
						<td>
							<a class="btn btn-warning" href="update/${dog.id}">Módosít<i class="far fa-edit"></i></a>
						</td>
						<td>
							<a class="btn btn-danger" href="delete/${dog.id}">Töröl<i class="far fa-edit"></i></a>
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
				<a class="btn btn-warning btn-sm" href="inprog">Bírálandó</a>
			</div>
			<div class="col-sm">
				<a class="btn btn-success btn-sm" href="accepted">Elfogadott</a>
			</div>
			<div class="col-sm">
				<a class="btn btn-danger btn-sm" href="rejected">Elutasított</a>
			</div>
		</div>
	</div>


<%@include file="common_footer.jsp" %>