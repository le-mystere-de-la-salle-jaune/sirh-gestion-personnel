<%@page import="java.util.List"%>
<%@page import="dev.sgp.entities.Collaborateur"%>
<%@page import="dev.sgp.entities.Departement"%>
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
<title>Collaborators list</title>
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
					href="<%=request.getContextPath()%>/collaborateurs/lister">Collaborators</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getContextPath()%>/collaborateurs/ajouter">Add
						colaborators</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Edit
						collaborator</a></li>
			</ul>
		</div>
	</nav>

	<div>
		<div class="row justify-content-end">
			<div class="col-sm-3-offset-9">
				<input type="button" value="Ajouter un nouveau collaborateur"
					style="margin-top: 10px; margin-right: 5px;"
					onclick="window.location.href='<%=request.getContextPath()%>/collaborateurs/ajouter'">
			</div>
		</div>
		<br />

		<h1>Les collaborateurs</h1>

		<form class=" container-fluid" action="<%=request.getContextPath()%>/collaborateurs/lister" method="GET" >
			<div class="row justify-content-start">
				<div class="col-sm-3">
					<label for="name" id=labelName>Rechercher un nom ou un prénom qui commence par :</label>
				</div>
				<div class="col-sm-4">
					<input type="text" id="name"> 
					<button type="submit" id="rechercher">Rechercher</button>
				</div>
				<div class="col-sm-5">
					<input type="checkbox" id="checkAddCollab"> <label
						for="checkAddCollab" style="word-break: normal;">
						Voir les collaborateurs désactivés</label>
				</div>
			</div>

				<%-- request.getParameter("departement") --%>

			<div class="row">
				<div class="col-6 col-sm-3">
					<label for="departement" style="text-align: left;">Filtrer
						par département : </label>
				</div>
				<div class="col-sm-3">
					<select class="form-control" id="departement" name="departement">

						<%
							List<Departement> depList = (List<Departement>) request.getAttribute("depList");
							for (Departement dep : depList) {
						%>
						<option value = "<%=dep.getId()%>"><%=dep.getDesignation()%></option>
						<%
							}
						%>
					</select>
				</div>
			</div>
		</form>
		
		<br />

		<div class="row">

			<%
				List<Collaborateur> collabList = (List<Collaborateur>) request.getAttribute("collabList");
				for (Collaborateur collab : collabList) {
			%>
			<div class="col-12 col-md-4">
				<div class="card mb-3 box-shadow">
					<div class="card-header">
						<h4 class="my-0 font-weight-normal"><%=collab.getFirstName()%> <%=collab.getLastName()%> : <%=collab.getMatricule()%></h4>
					</div>
					<div class="card-body">
						<div class="row">
							<div class="col-12 col-sm-4">
								<img src="" alt="Photo">
							</div>
							<div class="col-12 col-sm-8">
								<ul class="list-unstyled mt-3 mb-4">
									<li>Fonct. : <%=collab.getJobDesignation()%></li>
									<li>Départ. : <%=collab.getDepartement().getDesignation()%></li>
									<li>Mail : <%=collab.getProfessionalEmail()%></li>
									<li>Security N° : <%=collab.getSocialSecurityNumber()%></li>
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