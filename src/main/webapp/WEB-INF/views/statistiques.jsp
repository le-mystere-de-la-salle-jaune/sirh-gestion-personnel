<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="dev.sgp.entite.VisiteWeb"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="<c:url value='/bootstrap/css/bootstrap.css' />">
<title>SGP - App</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-light bg-light">
		<img src="<c:url value='/images/bootstrap-solid.svg'/>" width="30"
			height="30" class="d-inline-block align-top" alt="">
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
				<li class="nav-item"><a class="nav-link disabled"
					href="/statistiques">Statistiques</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Activités</a>
				</li>
			</ul>
		</div>
	</nav>
	<section>
		<table class="table">
			<tr scope="row">
				<th>Chemin</th>
				<th>Nombre de visites</th>
				<th>Min (ms)</th>
				<th>Max (ms)</th>
				<th>Moyenne (ms)</th>
			</tr>
			<c:forEach items="${listeStats}" var="stat">
				</tr scope="row">
					<td>${stat.key}</td>
					<td>${stat.value.count}</td>
					<td>${stat.value.min}</td>
					<td>${stat.value.max}</td>
					<td>${stat.value.average}</td>
				</tr>
			</c:forEach>
		</table>
	</section>
</body>
</html>
