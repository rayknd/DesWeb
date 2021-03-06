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
			<h1 class="page-header">Cadastro de Pais</h1>
			<form action="ManterOlimpiada.do" method="post">
				<div class="row">
					<div class="form-group col-md-12">
							<label><strong>Pais</strong></label>
							<input type="text" class="form-control" name="pais" placeholder="Digite o nome do Pais">
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-6">
							<label><strong>Populacao</strong></label>
							<input type="text" class="form-control" name="populacao" placeholder="Digite a População">
					</div>
					<div class="form-group col-md-6">
							<label><strong>Area</strong></label>
							<input type="text" class="form-control" name="area" placeholder="Digite a Area do País">
					</div>
				</div>
				<hr />
				<div class="row text-right">
	                	<div class="col-md-12">
	                    	<button type="submit" class="btn btn-primary" name="acao" value="criarPais">Criar</button>	
	                    		<a href="index.jsp" class="btn btn-default">Cancelar</a>
	               		</div>
	           	</div>
	           	</form>
		</div>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>