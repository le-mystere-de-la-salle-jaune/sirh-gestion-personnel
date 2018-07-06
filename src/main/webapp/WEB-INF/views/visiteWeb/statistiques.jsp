<%@ page import="javax.swing.ListCellRenderer"%>
<%@ page import="dev.sgp.entite.VisiteWeb"%>
<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - Statistiques</title>
<link rel="stylesheet"
	href="<c:url value="/bootstrap-4.1.1-dist/css/bootstrap.css" />">
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
					href='<c:url value="/collaborateurs/lister"/>'>Collaborateurs</a></li>
				<li class="nav-item"><a class="nav-link"
					href='<c:url value="/statistiques"/>'>Statistiques</a></li>
			</ul>
		</div>
	</nav>

	<h1>Statistiques</h1>

	<table class="table table-sm table-striped table-dark">
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

			<c:forEach items="${stats}" var="stat">
				<tr>
					<th scope="row">${stat.key}</th>
					<td>${stat.value.count}</td>
					<td>${stat.value.min}</td>
					<td>${stat.value.max}</td>
					<td>
						<fmt:formatNumber type="number" maxFractionDigits="3" value="${stat.value.average}" />
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

	<!-- jQuery first, then poper, then Bootstrap JS. -->
	<script src="js/jquery-slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>