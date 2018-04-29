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
		<div class="container">
			
			<h2 class="page-header">${pais.nome}, ${modalidade.nome}, ${olimpiada.ano}</h2>
			
			<div class="row">
				<div class="col-md-4">
					<h3>Ouro</h3>
					<p>${modalidade.ouro}</p>
				</div>
				<div class="col-md-4">
					<h3>Prata</h3>
					<p>${modalidade.prata}</p>
				</div>
				<div class="col-md-4">
					<h3>Bronze</h3>
					<p>${modalidade.bronze}</p>
				</div>
			<hr>
			
	
		</div>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>