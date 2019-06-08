<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit colaborators</title>
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"> </a>
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
					href="<c:url value='/collaborateurs/lister'/>">Collaborators</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value='/collaborateurs/ajouter'/>">Add
						collaborators</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value='/collaborateurs/edit'/>">Edit collaborator</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value='/collaborateurs/stats'/>">Statistics</a></li>
			</ul>
		</div>
	</nav>
</header>
<body class="container-fluid">

	<div class="row">
		<div class="col-12 col-sm-4">
			<img src="" alt="Photo">
		</div>
		<div class="col-12 col-sm-8">
			<div class="accordion" id="accordionExample">
				<div class="card">
					<div class="card-header" id="headingOne">
						<h5 class="mb-0">
							<button class="btn btn-link" type="button" data-toggle="collapse"
								data-target="#collapseOne" aria-expanded="true"
								aria-controls="collapseOne">Identité</button>
						</h5>
					</div>

					<div id="collapseOne" class="collapse show"
						aria-labelledby="headingOne" data-parent="#accordionExample">
						<div class="card-body">
							<form id="tovalidate" method="POST">

								<div class="form-group row">
									<label for="inputCivilite" class="col-md-2 col-form-label">Civilité</label>
									<div class="col-md-10">
										<select class="form-control" name="civilite"
											id="inputCivilite">
											<option>Madame</option>
											<option>Mademoiselle</option>
											<option>Monsieur</option>
										</select>
									</div>
								</div>


								<div class="form-group row">
									<label for="inputName" class="col-md-2 col-form-label">Nom</label>
									<div class="col-md-10">
										<input type="text" name="nom" class="form-control"
											id="inputName" placeholder="Nom" required>
										<div class="invalid-feedback">Nom est obligatoire</div>
									</div>
								</div>
								<div class="form-group row">
									<label for="inputPrenom" class="col-md-2 col-form-label">Prénom</label>
									<div class="col-md-10">
										<input type="text" name="prenom" class="form-control"
											id="inputPrenom" placeholder="Prénom" required>
										<div class="invalid-feedback">Prénom est obligatoire</div>
									</div>
								</div>
								<div class="form-group row">
									<label for="inputDateNaissance" class="col-md-2 col-form-label">Date
										de naissance</label>
									<div class="col-sm-10">
										<input type="date" name="dateDeNaissance" class="form-control"
											id="inputDateNaissance" placeholder="Date" required>
										<div class="invalid-feedback">Date est obligatoire</div>
									</div>
								</div>
								<div class="form-group row">
									<label for="inputAdresse" class="col-md-2 col-form-label">Adresse</label>
									<div class="col-sm-10">
										<textarea class="form-control" name="adresse"
											id="inputAdresse" rows="3" required></textarea>
										<div class="invalid-feedback">Adresse est obligatoire</div>
									</div>
								</div>
								<div class="form-group row">
									<label for="inputNumSecu" class="col-md-2 col-form-label">Numéro
										de sécurité sociale</label>
									<div class="col-md-10">
										<input type="text" name="numeroSecuriteSociale"
											class="form-control" id="inputNumSecu"
											placeholder="Numéro de sécurité" required>
										<div class="invalid-feedback">Numéro de sécu est
											obligatoire</div>
									</div>
								</div>
								<div class="form-group row">
									<label for="inputNumSecu" class="col-md-2 col-form-label">Numéro
										de téléphone</label>
									<div class="col-md-10">
										<input type="text" name="numeroTelephone" class="form-control"
											id="inputTelephone" placeholder="Numéro de téléphone"
											required>
									</div>
								</div>

							</form>

						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header" id="headingTwo">
						<h5 class="mb-0">
							<button class="btn btn-link collapsed" type="button"
								data-toggle="collapse" data-target="#collapseTwo"
								aria-expanded="false" aria-controls="collapseTwo">
								Poste</button>
						</h5>
					</div>
					<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
						data-parent="#accordionExample">
						<div class="card-body">
							<div class="form-group row">
								<label for="exampleFormControlSelect1"
									class="col-md-2 col-form-label">Département</label>
								<div class="col-md-10">
									<select class="form-control" name="civilite" id="inputCivilite">
										<option>Informatique</option>
										<option>Ressources Humaines</option>
										<option>Comptabilité</option>
									</select>
								</div>
							</div>


							<div class="form-group row">
								<label for="inputDep" class="col-md-2 col-form-label">Nom</label>
								<div class="col-md-10">
									<input type="text" name="dep" class="form-control"
										id="inputNameDep" placeholder="Nom" required>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header" id="headingThree">
						<h5 class="mb-0">
							<button class="btn btn-link collapsed" type="button"
								data-toggle="collapse" data-target="#collapseThree"
								aria-expanded="false" aria-controls="collapseThree">
								Coordonnées bancaires</button>
						</h5>
					</div>
					<div id="collapseThree" class="collapse"
						aria-labelledby="headingThree" data-parent="#accordionExample">
						<div class="card-body">
							<div class="form-group row">
								<label for="inputIban" class="col-md-2 col-form-label">IBAN</label>
								<div class="col-md-10">
									<input type="text" name="dep" class="form-control"
										id="inputNameIban" required>
								</div>
							</div>

							<div class="form-group row">
								<label for="inputBic" class="col-md-2 col-form-label">BIC</label>
								<div class="col-md-10">
									<input type="text" name="bic" class="form-control"
										id="inputBic" required>
								</div>
							</div>

						</div>
					</div>

				</div>
				<br />
				<div>
					<div class="offset-sm-9 col-12 col-sm-2">
						<button type="submit" class="btn btn-primary">Sauvegarder</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
		crossorigin="anonymous"></script>
</body>

</body>

</html>