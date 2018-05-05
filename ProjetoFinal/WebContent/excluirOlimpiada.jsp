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
			
			<div class="row">
				
				<div class="col-md-4">
					<h3>Olimpiada excluida com sucesso</h3>
					<p>Olimpiada foi excluida clique em voltar para pesquisar outra olimpiada</p>
				</div>
				
			<hr>
			<button type="submit" class="btn btn-primary" name="acao" value="pesquisarOlimpiada">Voltar</button>
	
		</div>
		</form>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>