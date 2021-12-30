<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common_header.jsp" %>

<div class="row">
	<div class="col-sm-12">
		<div class="jumbotron bg-dark text-white">
			<h1 class="display-4 text-center"> Új hitelkérelem </h1>
		</div>
	</div>
</div>
<div class="row">
	<div class="col-sm-12">
		<form action="" method="POST">
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<input type="hidden" name="id" value="${stock.id}">
						<label for="name">Vezetéknév</label>
						<input type="text" class="form-control" name="name" value="${stock.name}" required> 
					</div>
					
					
					<div class="form-group">
						<label for="price">Ár</label>
						<input type="text" class="form-control" name="price" value="${stock.price}" required> 
					</div>
					
					<div class="form-group">
						<label for="itemNumber">Sorszám</label>
						<input type="text" class="form-control" name="itemNumber" value="${stock.itemNumber}" required> 
					</div>
					
					<div class="form-group">
						<label for="sale">Akciós</label>
						<input type="text" class="form-control" name="sale" value="${stock.sale}" required> 
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