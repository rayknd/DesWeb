<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<title>INDEX</title>
	</head>
	<body>
		
	
		<c:import url="menu.jsp"></c:import>
		<br><br><br><br>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
				</div>
				<div class="col-md-4 text-center">
					<form action="controller.do" method="post">
						<h2>Pesquisar Olimpiada</h2>
						<br>
						<button type="submit" class="btn btn-primary" name="command" value="PesquisarOlimpiada">Pesquisar</button>
					</form>
				</div>
			</div>
		</div>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>