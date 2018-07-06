<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img alt="Logo" src="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link"
					href="collaborateurs/lister">Collaborateurs <span
						class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="statistiques/afficher">Statistiques <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Activitées
						<span class="sr-only">(current)</span>
				</a></li>
			</ul>
		</div>
	</nav>
	
	<h1>Les collaborateurs</h1>


	<c:forEach items="${listCollabs}" var="collab">
		<ul>
			<li>${collab.matricule}</li>
			<li>${collab.nom}</li>
			<li>${collab.prenom}</li>
			<li>${collab.dateDeNaissance}</li>
			<li>${collab.adresse}</li>
			<li>${collab.numeroDeSecuriteSociale}</li>
		</ul>
	</c:forEach>

</body>
</html>