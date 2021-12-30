<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %>

<div class="row">
	<div class="col-sm-12">
		<div class="jumbotron bg-dark text-white">
			<h1 class="display-4 text-center"> Dolgozó módosítás </h1>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-sm-12">
		<form action="" method="POST">
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<input type="hidden" name="id" value="${emp.id}">
						<label for="lastName">Vezetéknév</label>
						<input type="text" class="form-control" name="lastName" value="${emp.lastName}" required> 
					</div>
					<div class="form-group">
						<label for="firstName">Keresztnév</label>
						<input type="text" class="form-control" name="firstName" value="${emp.firstName}" required> 
					</div>
					<div class="form-group">
						<label for="categoryId"></label>
						<select name="categoryId" class="form-control" autofocus="${emp.categoryId}">
							<option value="-2">Grafikus</option>
							<option value="-1">Ügyintéző</option>
						</select>
					</div>
					<div class="d-flex justify-content-between bg-dark text-white p-2">
						<a class="btn btn-warning" href="javascript:history.go(-1)">
							<i class="fas fa-arrow-left"></i> Vissza
						</a>
						<button class="btn btn-success" type="submit"> Módosít 
							<i class="fas fa-save"></i>
						</button>
					</div>
				</div>
			</div>
		</form>	
	</div>
</div>

<%@include file="common_footer.jsp" %>