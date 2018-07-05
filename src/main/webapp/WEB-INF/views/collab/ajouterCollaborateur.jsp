<!DOCTYPE html>
<html lang="fr">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/css/bootstrap.css">
</head>

<body>
	<nav class="navbar navbar-expand-sm navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img
			src="/docs/4.1/assets/brand/bootstrap-solid.svg" width="30"
			height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Collaborateurs <span
					class="sr-only">(current)</span>
				</a> <a class="nav-item nav-link" href="#">Statistiques</a> <a
					class="nav-item nav-link" href="#">Activités</a>
			</div>
		</div>
	</nav>
	<h1>Nouveau collaborateur</h1>
	<div class="container">
		<form id="tovalidate" method="POST">
			<div class="form-group row">
				<label for="inputName" class="col-md-2 col-form-label">Nom</label>
				<div class="col-md-10">
					<input type="text" class="form-control" id="inputName"
						placeholder="Nom" name="nom" required>
					<div class="invalid-feedback">Nom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPrenom" class="col-md-2 col-form-label">Prénom</label>
				<div class="col-md-10">
					<input type="text" class="form-control" id="inputPrenom"
						placeholder="Prénom" name="prenom" required>
					<div class="invalid-feedback">Prénom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputDateNaissance" class="col-md-2 col-form-label">Date
					de naissance</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="inputDateNaissance"
						placeholder="Date" name="dateDeNaissance" required>
					<div class="invalid-feedback">Date est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputAdresse" class="col-md-2 col-form-label">Adresse</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="inputAdresse" rows="3" name="adresse" required></textarea>
					<div class="invalid-feedback">Adresse est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputNumSecu" class="col-md-2 col-form-label">Numéro
					de sécurité sociale</label>
				<div class="col-md-10">
					<input type="text" class="form-control" id="inputNumSecu"
						placeholder="Numéro de sécurité" name="numeroSecuriteSociale" required>
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

	<!-- jQuery first, then poper, then Bootstrap JS. -->
	<script src="js/jquery-slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>