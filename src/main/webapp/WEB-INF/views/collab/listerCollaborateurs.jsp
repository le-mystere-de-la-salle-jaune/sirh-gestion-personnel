<%@ page import="java.util.List"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css">
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
				<li class="nav-item"><a class="nav-link disabled" href="#">Statistiques</a>
				</li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Activités</a>
				</li>
			</ul>
		</div>
	</nav>

	<section>
		<div>
			<div class="row justify-content-end">
				<div class="col-sm-3-offset-9">
					<input type="button" value="Ajouter un nouveau collaborateur"
						style="margin-top: 10px; margin-right: 5px;">
				</div>
			</div>
			<br />

			<h1>Les collaborateurs</h1>

			<div class=" container-fluid">
				<div class="row justify-content-start">
					<div class="col-sm-3">
						<label for="name" id=labelName>Rechercher un nom ou un
							prénom qui commence par :</label>

					</div>
					<div class="col-sm-4">
						<input type="text" id="name"> <input type="button"
							id="rechercher" value="Rechercher">
					</div>
					<div class="col-sm-5">
						<input type="checkbox" id="checkAddCollab"> <label
							for="checkAddCollab" style="word-break: normal;">Voir les
							collaborateurs désactivés</label>
					</div>
				</div>


				<div class="row">
					<div class="col-6 col-sm-3">
						<label for="departement" style="text-align: left;">Filtrer
							par département : </label>
					</div>
					<div class="col-sm-3">
						<select class="form-control" id="departement">
							<option>Tous</option>
							<option>Comptabilité</option>
							<option>Ressources Humaines</option>
							<option>Informatique</option>
						</select>
					</div>
				</div>
			</div>
			<br />

			<div class="row">
				<%
					List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
					for (Collaborateur collaborateur : collaborateurs) {
				%>
				<div class="col-12 col-md-4">
					<div class="card mb-3 box-shadow">
						<div class="card-header">
							<h4 class="my-0 font-weight-normal"><%= collaborateur.getNom() + " " + collaborateur.getPrenom() %></h4>
						</div>
						<div class="card-body">
							<div class="row">
								<div class="col-12 col-sm-4">
									<img src="" alt="Photo">
								</div>
								<div class="col-12 col-sm-8">
									<ul class="list-unstyled mt-3 mb-4">
										<li>Fonct. : développeur</li>
										<li>Départ. : informaticien</li>
										<li>Email : <%= collaborateur.getMailPro() %></li>
										<li>Tél. : 06.06.06.06.06</li>
									</ul>
								</div>
								<div class="col-2 offset-4 col-sm-4 offset-sm-8">
									<button type="button" class="btn btn-outline-secondary">Editer</button>
								</div>
							</div>
						</div>
					</div>
				</div>
				<%
					}
				%>
			</div>
		</div>
	</section>
</body>
</html>