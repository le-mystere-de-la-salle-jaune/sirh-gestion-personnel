<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href=<c:url value='/bootstrap-4.1.1-dist/css/bootstrap.css'/>>
</head>
<body>

	<!-- La navigation en haut de l'écran -->
	<nav class="navbar navbar-light bg-light">
		<div class="container">
			<div class="row">
				<div class="col-sm">LOG</div>
				<div class="col-sm">Collaborateurs</div>
				<div class="col-sm">Statistiques</div>
				<div class="col-sm">Activités</div>
			</div>
		</div>
	</nav>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Chemin</th>
				<th scope="col">Nombre de visites</th>
				<th scope="col">Min (ms)</th>
				<th scope="col">Max (ms)</th>
				<th scope="col">Moyenne (ms)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="url" items="${allUrl}">
				<tr>
					<th scope="row"><c:out value= "${url}"/></th>
					<td><c:out value= "${listeStats.calculNbVisitUrl(url)}"/></td>
					<td><c:out value= "${listeStats.calculMinStatUrl(url)}"/></td>
					<td><c:out value= "${listeStats.calculMaxStatUrl(url)}"/></td>
					<td><c:out value= "${listeStats.calculMoyStatUrl(url)}"/></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

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