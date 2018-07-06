<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/css/bootstrap.css">
<title>SGP - App</title>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href='<c:url value="/collaborateurs/lister"/>'> <img
			src="https://static.getjar.com/icon-50x50/76/945275_thm.jpg"
			width="30" height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/collaborateurs/lister"/>'>Collaborateurs</a></li>
				<li class="nav-item active"><a class="nav-link"
					href='<c:url value="/statistiques"/>'>Statistiques</a> <span
					class="sr-only">(current)</span></li>
				<li class="nav-item"><a class="nav-link" href="#">Activités</a>
				</li>
			</ul>
		</div>
	</nav>


	<div class="container-fluid">

		<h1>Statistiques</h1>

		<table class="table table-striped">

			<!-- JSTL itération sur la liste des statisitques -->
			

				<thead>
					<tr>
						<th scope="col">Chemin</th>
						<th scope="col">Nombre de visites</th>
						<th scope="col">Min (ms)</th>
						<th scope="col">Max (ms)</th>
						<th scope="col">Moyenne (ms)</th>
					</tr>
				</thead>
				<c:forEach items="${listeVisites}" var="visite">
				<tbody>
					<tr>
						<th>${visite.chemin}</th>
						<td>${visite.tempsExecution}</td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
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
	</div>
</body>

</html>

</html>