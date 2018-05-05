<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<title>Cadastro de Pais</title>
	</head>
	<body>
		
		<c:import url="menu.jsp"></c:import>
		<br><br>
		<div class="container">
			<h1 class="page-header">Pais Cadastrado com Sucesso</h1>
			
				<div class="row">
					<div class="form-group col-md-6">
							<label><strong>Id</strong></label>
							<p>${pais.id}</p>
					</div>
					<div class="form-group col-md-6">
							<label for=><strong>Pais</strong></label>
							<p>${pais.nome}</p>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-6">
							<label><strong>Populacao</strong></label>
							<p>${pais.populacao}</p>
					</div>
					<div class="form-group col-md-6">
							<label><strong>Area</strong></label>
							<p>${pais.area}</p>
					</div>
				</div>
				<hr />
				
		</div>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>