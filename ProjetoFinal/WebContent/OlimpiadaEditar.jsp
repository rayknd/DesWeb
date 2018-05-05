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
		<title>Cadastro de Olimpiadas</title>
	</head>
	<body>
		<c:import url="menu.jsp"></c:import>
		<br><br>
		<div class="container">
			<h1 class="page-header">Edição de Olimpiadas</h1>
			<form action="ManterOlimpiada.do" method="post">
				<div class="row">
					<div class="form-group col-md-6">
							<label><strong>Pais</strong></label>
							<input type="hidden" class="form-control" name="pais" value="${pais.id}">
							<input type="text" class="form-control" name="nome" value="${pais.nome}">
					</div>
				
					<div class="form-group col-md-6">
							<label><strong>Modalidade</strong></label>
							<input type="hidden" class="form-control" name="modalidade" value="${modalidade.id}">
							<input type="text" class="form-control" name="nomeModal" value="${modalidade.nome}">
					</div>
					<div class="form-group col-md-6">
							<label><strong>Ano</strong></label>
							<input type="hidden" class="form-control" name="ano" value="${olimpiada.ano}">
							<input type="text" class="form-control" name="ano1" value="${olimpiada.ano}">
					</div>
					<div class="form-group col-md-6">
						<label><strong>Ouro</strong></label>
						<input type="text" class="form-control" name="ouro" value="${modalidade.ouro}">
					</div>
					<div class="form-group col-md-6">
						<label><strong>Prata</strong></label>
						<input type="text" class="form-control" name="prata" value="${modalidade.prata}">
					</div>
					<div class="form-group col-md-6">
						<label><strong>Bronze</strong></label>
						<input type="text" class="form-control" name="bronze" value="${modalidade.bronze}">
					</div>
				</div>
				<hr />
				<div class="row text-right">
	                	<div class="col-md-12">
	                    	<button type="submit" class="btn btn-primary" name="acao" value="editarOlimpiada">Salvar</button>	
	                    		<a href="index.jsp" class="btn btn-default">Cancelar</a>
	               		</div>
	           	</div>
	          </form>
		</div>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>