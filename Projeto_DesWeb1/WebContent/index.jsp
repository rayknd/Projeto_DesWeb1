<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="Model.Pais"  %>
<%@ page import="Model.AnoOlimpiada"  %>
<%@ page import="Model.Modalidade"  %>
<%@ page import="Model.Olimpiada"  %>
<%@ page import="Service.PaisService"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<title>Cadastro de medalhas</title>
		
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/customIcons.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">


	</head>
<body>
	
	<nav class="navbar navbar-light bg-light">
	  <span class="navbar-brand mb-0 h1">Cadastro de Medalhas</span>
	</nav>
	
	
	<div class="container">
		<div class="row">
			<div class="form-group" >
				<form action="ManterOlimpiada.do" method="POST">
				
					<select class="form-control" id="sPais" style="width: 25%; float: left;">
						<option value="pais" target="active">Selecione o Pais</option>
						<option value="Brasil">Brasil</option>
						<option value="Espanha">Espanha</option>
						<option value="Russia">Russia</option>
					
					</select>

					<select class="form-control" id="sAno" style="width: 25%; float: left;">
						<option value="ano" target="active">Selecione o Ano</option>
						<option value="2016">2016</option>
						<option value="2014">2014</option>
						<option value="2012">2012</option>
					</select>
					
					<select class="form-control " id="sModalidade" style="width: 25%; float: left;">
						<option value="ano" target="active">Selecione a modalidade</option>
						<option value="skate">Skate</option>
						<option value="boxe">Boxe</option>
						<option value="futebol">futebol</option>
					</select>					
					
					<br /><br /><br />
					<div style="float:left;"> 	
						<strong><span>Ouro</span></strong>
						<input type="text" placeholder="Ouro" size="10" class="form-control" id="ouro" style="width: 60%;" /><br />
					</div>
					<div style="float:left;">	
						<strong><span>Prata</span></strong>
						<input type="text" placeholder="Prata" size="10" class="form-control" id="prata" style="width: 60%;"/><br />
					</div>
					<div style="float:left;">	
						<strong><span>Bronze</span></strong>
						<input type="text" placeholder="Bronze" size="10" class="form-control" id="bronze" style="width: 60%;"/><br />
					</div>
					<br /><br /><br /><br /><br /><br /><br /><br /><br />
					
					
				</form>
			
				<div class="row" id="rSub">
					<input type="submit" class="btn btn-primary" value="Atualizar quadro de medalhas">
				</div>
			</div>
			
			
		</div>
	</div>

	
</body>
<script src="js/jquery-2.2.3.min.js"></script>
</html>