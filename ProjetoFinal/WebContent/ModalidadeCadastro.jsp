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
		<title>Cadastro de Modalidade</title>
	</head>
	<body>
		<c:import url="menu.jsp"></c:import>
		<br><br>
		<div class="container">
			<h1 class="page-header">Cadastro de Modalidade</h1>
			<form action="ManterOlimpiada.do" method="post">
				<div class="row">
					<div class="form-group col-md-12">
							<label for="modalidade"><strong>Nome da Modalidade</strong></label>
							<input type="text" class="form-control" name="modalidade" placeholder="Digite o nome da Modalidade">
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-12">
							<label for="modalidade"><strong>Tipo</strong></label>
							<input type="text" class="form-control" name="tipo" placeholder="Digite se é Verão(V) ou Inverno (I)">
					</div>
				</div>
				<hr />
				<div class="row text-right">
	                	<div class="col-md-12">
	                    	<button type="submit" class="btn btn-primary" name="acao" value="criarModalidade">Criar</button>	
	                    		<a href="index.html" class="btn btn-default">Cancelar</a>
	               		</div>
	           	</div>
		</div>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>