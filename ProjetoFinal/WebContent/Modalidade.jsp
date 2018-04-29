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
        <title>Modalidade</title>
    </head>
    <body>
 	
 	<c:import url="menu.jsp"></c:import>
    <br>
    <div class="container">
        <h2 class= "page-header">Modalidade Cadastrada com Sucesso!</h2>
        <c:forEach var="moda" items="modalidade">
	        <div class="row">
	     		<div class="form-group col-md-6">
	           		<label ><strong>Id</strong></label>
	                <p>${moda.id}</p>
	
	            </div>
	            <div class="form-group col-md-6">
	            	<label ><strong>Modalidade</strong></label>
	                <p> ${moda.nome}</p>
	            </div>
	        </div>
        </c:forEach>
        <hr>
    </div>
    </body>
</html>