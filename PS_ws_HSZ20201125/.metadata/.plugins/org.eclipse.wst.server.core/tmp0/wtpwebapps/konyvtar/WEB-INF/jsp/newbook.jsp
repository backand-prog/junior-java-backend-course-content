<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp" %>

	<div class="row">
		<div class="col-sm-12">
			<div class="jumbotron bg-dark text-white text-center">
				<h1 class="display-4">Új könyv hozzáadása</h1>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-sm-12">
			<form action="" method="post">
				<div class="row">
					<div class="col-sm-6">
				<div class="form-group">
				   <label for="title">Könyv címe</label>
				   <input type="text" class="form-control" id="title" name="title" required>
				</div>
					</div>
					<div class="col-sm-6">
				<div class="form-group">
				  <label for="author">Könyv írója</label>
				  <input type="text" class="form-control" id="author" name="author" required>
				</div>
					</div>
				</div>
				<div class="d-flex justify-content-between bg-dark text-white p-2" >
					<a class="btn btn-warning" href="list"><i class="fa fa-arrow-circle-o-left" aria-hidden="true"></i> Vissza</a>
					<button type="submit" class="btn btn-success">Mentés <i class="fas fa-save"></i></button>
				</div>
			</form>
		</div>
	</div>
<%@include file="includes/footer.jsp" %>