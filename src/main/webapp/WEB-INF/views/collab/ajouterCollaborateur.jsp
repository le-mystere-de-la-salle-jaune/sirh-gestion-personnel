<%@ page import="java.util.List"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value='/bootstrap/css/bootstrap.css'/>">
<title>SGP - App</title>

</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-light bg-light">
		<img src="images/bootstrap-solid.svg" width="30" height="30"
			class="d-inline-block align-top" alt="">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link disabled"
					href="#">Collaborateurs <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value='/statistiques'/>">Statistiques</a>
				</li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Activités</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<form id="tovalidate" method="POST">
			<div class="form-group row">
				<label for="inputName" class="col-md-2 col-form-label">Nom</label>
				<div class="col-md-10">
					<input type="text" class="form-control" name="nom" id="inputName"
						placeholder="Nom" required>
					<div class="invalid-feedback">Nom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPrenom" class="col-md-2 col-form-label">Prénom</label>
				<div class="col-md-10">
					<input type="text" class="form-control" name="prenom"
						id="inputPrenom" placeholder="Prénom" required>
					<div class="invalid-feedback">Prénom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputDateNaissance" class="col-md-2 col-form-label">Date
					de naissance</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" name="dateNaissance"
						id="inputDateNaissance" placeholder="Date" required>
					<div class="invalid-feedback">Date est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputAdresse" class="col-md-2 col-form-label">Adresse</label>
				<div class="col-sm-10">
					<textarea class="form-control" name="adresse" id="inputAdresse"
						rows="3" required></textarea>
					<div class="invalid-feedback">Adresse est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputNumSecu" class="col-md-2 col-form-label">Numéro
					de sécurité sociale</label>
				<div class="col-md-10">
					<input type="text" name="numSeco" class="form-control"
						id="inputNumSecu" placeholder="Numéro de sécurité" maxlength="15"
						required>
					<div class="invalid-feedback">Numéro de sécu est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<div class="offset-md-10 col-md-2">
					<button type="submit" class="btn btn-primary">Créer</button>
				</div>
			</div>
		</form>

		<script>
			if (window.location.href.includes("?error")) {
				console.log("version avec les erreurs")
				var formElt = document.getElementById("tovalidate");

				if (formElt.checkValidity() === false) {
					formElt.classList.add("was-validated");
				}
			}
		</script>
	</div>

</body>
</html>