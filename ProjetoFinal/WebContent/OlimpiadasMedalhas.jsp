<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %><!DOCTYPE html>
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
		<br><br><br><br>
		<form action="ManterOlimpiada.do" method="POST">
		<div class="container">
			
			<h2 class="page-header">${pais.nome}, ${modalidade.nome}, ${olimpiada.ano}</h2>
			
			<div class="row">
				<div class="col-md-4">
					<input type="hidden" name="modalidade" value="${modalidade.id}">
					<input type="hidden" name="pais" value="${pais.id}">
					<input type="hidden" name="ano" value="${olimpiada.ano}">
					
				
					<h3>Ouro</h3>
					<p>${modalidade.ouro}</p>
					<input type="hidden" name="ouro" value="${modalidade.ouro}">
				</div>
				<div class="col-md-4">
					<h3>Prata</h3>
					<p>${modalidade.prata}</p>
					<input type="hidden" name="prata" value="${modalidade.prata}">
				</div>
				<div class="col-md-4">
					<h3>Bronze</h3>
					<p>${modalidade.bronze}</p>
					<input type="hidden" name="bronze" value="${modalidade.bronze}">
				</div>
			<hr>
			<button type="submit" class="btn btn-primary" name="acao" value="editarMedalhas">Editar</button>
			<button type="submit" class="btn btn-primary" name="acao" value="excluirOlimpiada">Excluir</button>
	
		</div>
		</form>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>