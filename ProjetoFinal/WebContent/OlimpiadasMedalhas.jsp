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
		<title>Medalhas</title>
	</head>
	<body>
		<c:import url="menu.jsp"></c:import>
		<!-- Modal -->
            <div class="modal fade" id="delete-modal" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" id="modalLabel">Excluir Olimpiada</h4>
                        </div>
                        <div class="modal-body">
                            Deseja realmente excluir?
                        </div>
                        <div class="modal-footer">
                            <form action="controller.do" method="post">
                                <input type="hidden" name="id" id="id_excluir" />
                                <button type="submit" class="btn btn-primary" name="command" value="ExcluirOlimpiada">Sim</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.modal -->
		<br><br><br><br>
		<form action="controller.do" method="POST">
		<div class="container">


			<c:if test="${modalidade.ouro >=0 || modalidade.prata >= 0 || modalidade.bronze >= 0}">
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
			<button type="submit" class="btn btn-primary" name="command" value="EditarMedalhas">Editar</button>
			<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#delete-modal" >Excluir</button>
	
		</div>
		</c:if>
		
		<c:if test="${modalidade.ouro < 0 || modalidade.prata < 0 || modalidade.bronze < 0}">
				<h2> Nenhuma medalha cadastrada.</h2>
				<p> Deseja cadastrar?</p>
				
				<input type="hidden" name="modalidade" value="${modalidade.id}">
				<input type="hidden" name="pais" value="${pais.id}">
				<input type="hidden" name="ano" value="${olimpiada.ano}">
				
				<button type="submit" class="btn btn-primary" name="command" value="CriarMedalhas">Sim</button>	
				<a href="OlimpiadaPesquisar.jsp" class="btn btn-default">Não</a>
		</c:if>	
		
		
		</form>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>