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
			<form action="controller.do" method="post">
			<h2 class="page-header">Pesquisar Medalhas</h2>
			
			<div class="row">
				<div class="col-md-4">
					<select type="text" name="pais" class="form-control">
				    	
				    	<option>- Selecione uma opção -</option>
				       	<c:forEach var="p" items="${pais}">
				       		<option value="${p.id}">${p.nome}</option>
				       	</c:forEach>    	
    				</select>
				</div>
				<div class="col-md-4">
					<select type="text" name="modalidade" class="form-control">
				    	<option>- Selecione uma opção -</option>
						<c:forEach var="m" items="${modalidade}">				     
				       		<option value="${m.id}">${m.nome}</option>
				       	</c:forEach>
    				</select>
				</div>
				<div class="col-md-4">
					<select type="text" name="ano" class="form-control">
				    	<option>- Selecione uma opção -</option>
				       	<c:forEach var="o" items="${olimpiada}">
				       		<option value="${o.ano}">${o.ano}</option>
				       	</c:forEach>
    				</select>
				</div>
				
			</div>
			<hr>
			<div class="row">
				<div class="col-md-9"></div>
				<div class="col-md-3 text-right">
					<button type="submit" class="btn btn-primary" name="command" value="CriarMedalhas">Novo</button>
					<button type="submit" class="btn btn-primary" name="command" value="CarregarMedalhas">Pesquisar</button>
				</div>
			</div>
			</form>
		</div>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>