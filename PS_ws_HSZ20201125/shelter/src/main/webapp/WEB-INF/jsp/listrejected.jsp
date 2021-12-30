<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %>

	<div class="row">
		<div class="col-sm 12">
			<div class="jumbotron bg-dark text-white">
			<h1 class="display-4 text-center">Visszevettek</h1>
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
					</tr>
				</thead>			
				<tbody>
					<c:forEach var="dog" items="${dogs}">
						<tr>
							<td>${dog.id}</td>
							<td>${dog.name}</td>
							<td>${dog.age}</td>
							<td>${dog.status}</td>
						</tr>	
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="d-flex bg-dark text-white p-2">
		<div class="row">
			<div class="col-sm">
				<div class="d-flex justify-content-between bg-dark text-white p-2">
					<a class="btn btn-warning" href="javascript:history.go(-1)">
						<i class="fas fa-arrow-left"></i> Vissza
					</a>
				</div>
			</div>
		</div>
	</div>
<%@include file="common_footer.jsp" %>