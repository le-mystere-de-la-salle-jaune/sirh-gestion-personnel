<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
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
				<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/collaborateurs/lister">Colaborateurs</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Statistiques</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Activitées</a>
				</li>
			</ul>
		</div>
	</nav>

	<h1>Les collaborateurs</h1>

	<div class="container">
		<form id="tovalidate" action="<%=request.getContextPath()%>/collaborateurs/ajouter" method = "POST">
			<div class="form-group row">
				<label for="inputName" class="col-md-2 col-form-label">Nom</label>
				<div class="col-md-10">
					<input type="text" class="form-control" id="inputName" name="lastName" placeholder="Nom" required>
					<div class="invalid-feedback">Nom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPrenom" class="col-md-2 col-form-label">Prénom</label>
				<div class="col-md-10">
					<input type="text" class="form-control" id="inputPrenom" name="firstName" placeholder="Prénom" required>
					<div class="invalid-feedback">Prénom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputDateNaissance" class="col-md-2 col-form-label">Date de naissance</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="inputDateNaissance" name="birthDate" placeholder="Date" required>
					<div class="invalid-feedback">Date est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputAdresse" class="col-md-2 col-form-label">Adresse</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="inputAdresse" rows="3" name="address" required></textarea>
					<div class="invalid-feedback">Adresse est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputNumSecu" class="col-md-2 col-form-label">Numéro
					de sécurité sociale</label>
				<div class="col-md-10">
					<input type="text" class="form-control" id="inputNumSecu" name="socialSecurityNumber" placeholder="Numéro de sécurité" required>
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

                if(formElt.checkValidity() === false) {
                    formElt.classList.add("was-validated");
                }
            }
        </script>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>