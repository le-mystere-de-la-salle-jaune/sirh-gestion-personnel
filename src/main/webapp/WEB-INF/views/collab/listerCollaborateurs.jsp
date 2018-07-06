<%@page import="java.util.List"%>
<%@page import="dev.sgp.service.Collaborateur"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/css/bootstrap.css">
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


	<h1>Les collaborateurs</h1>
	<ul>
		
		<c:forEach  var="collab" items="${listeNoms}" >
			 <li><c:out value= "${collab.getNom()}"/></li>
		</c:forEach>

	</ul>


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
</html>