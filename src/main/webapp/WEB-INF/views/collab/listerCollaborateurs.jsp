<%@ page import="javax.swing.ListCellRenderer"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<c:url value="/bootstrap-4.1.1-dist/css/bootstrap.css" />">
</head>
<body class="container-fluid">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img src="navbar_panda.png"
			width="30" height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/collaborateurs/lister"/>'>Collaborateurs</a></li>
			</ul>
		</div>
	</nav>
	<div class="row justify-content-end">
		<a class="btn btn-primary btn-lg mt-3 mr-3"
			href="<c:url value="/collaborateurs/nouveau"/>">Ajouter un
			nouveau collaborateur</a>
	</div>
	<h1>Les collaborateurs</h1>
	<form class="container-fluid"
		action="<c:url value="/collaborateurs/lister" />" method="GET">
		<div class="row justify-content-start">
			<div class="col-sm-3">
				<label for="name" id=labelName>Rechercher un nom ou un
					prénom qui commence par :</label>
			</div>
			<div class="col-sm-4">
				<input type="text" id="name">
				<button type="submit" id="rechercher">Rechercher</button>
			</div>
			<div class="col-sm-5">
				<input type="checkbox" id="checkAddCollab"> <label
					for="checkAddCollab" style="word-break: normal;"> Voir les
					collaborateurs désactivés</label>
			</div>
		</div>

		<div class="row">
			<div class="col-6 col-sm-3">
				<label for="departement" style="text-align: left;">Filtrer
					par département : </label>
			</div>
			<div class="col-sm-3">
				<select class="form-control" id="departement" name="departement">
					<option>Tous</option>
					<option>Comptabilité</option>
					<option>Ressources Humaines</option>
					<option>Informatique</option>
				</select>
			</div>
		</div>
	</form>

	<br />

	<div class="row">

		<c:forEach items="${listeCollaborateurs}" var="collab">

			<div class="col-12 col-md-4">
				<div class="card mb-3 box-shadow">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal">${collab.prenom}
							${collab.nom} [${collab.matricule}]</h4>
					</div>
					<div class="card-body">
						<div class="row">
							<div class="col-12 col-sm-4">
								<img src="truc.png" alt="Photo">
							</div>
							<div class="col-12 col-sm-8">
								<ul class="list-unstyled mt-3 mb-4">
									<li>Mail : ${collab.emailPro}</li>
									<li>NSS : ${collab.numeroSecuriteSociale}</li>
								</ul>
							</div>
							<div class="col-2 offset-4 col-sm-4 offset-sm-8">
								<button type="button" class="btn btn-outline-secondary">Editer</button>
							</div>
						</div>
					</div>
				</div>
			</div>

		</c:forEach>
	</div>

	<!-- jQuery first, then poper, then Bootstrap JS. -->
	<script src="js/jquery-slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>