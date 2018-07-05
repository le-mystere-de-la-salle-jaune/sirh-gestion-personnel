<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>

<body>
	<div class="container">
		<form id="tovalidate" action="http://localhost:8080/sgp/collaborateurs/editer" method="POST">
			<div class="form-group row">
				<div class="col-md-10">
					<input type="text" class="form-control" id="nom" name="nom"
						placeholder="Nom">
					<div class="invalid-feedback">Nom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-10">
					<input type="text" class="form-control" id="prenom" name="prenom"
						placeholder="Prénom" required>
					<div class="invalid-feedback">Prénom est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputDateNaissance" class="col-md-2 col-form-label">Date
					de naissance</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="dateNaissance" name="dateNaissance"
						placeholder="Date" required>
					<div class="invalid-feedback">Date est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<label for="adresse" class="col-md-2 col-form-label">Adresse</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="inputAdresse" rows="3" name="adresse" required></textarea>
					<div class="invalid-feedback">Adresse est obligatoire</div>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-10">
					<input type="text" class="form-control" id="numeroSecuriteSociale" name="numeroSecuriteSociale"
						placeholder="Numéro de sécurité sociale" required>
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


	<!-- jQuery first, then poper, then Bootstrap JS. -->
	<script src="js/jquery-slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>