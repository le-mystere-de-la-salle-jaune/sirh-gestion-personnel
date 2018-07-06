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
	
	<!-- Le titre de la page -->
    <h1>Nouveau Collaborateur</h1>

    <form action=<c:url value='/collaborateurs/creer'/> method="post">
        <div class="form row mb-3">
            <div class="col">
                <label class="col-form-label"> Nom :</label>
            </div>
            <div class="col">
                <input type="text" class="form-control" name="nom" required>
            </div>
        </div>
        <div class="form row mb-3">
            <div class="col">
                <label class="col-form-label"> Prénom :</label>
            </div>
            <div class="col">
                <input type="text" class="form-control" name="prenom" required>
                <div class="invalid-feedback">
                    Please provide a valid zip.
                </div>
            </div>
        </div>
        <div class="form row mb-3">
            <div class="col">
                <label class="col-form-label"> Date de naissance (Format "AAAA-MM-JJ" ) :</label>
            </div>
            <div class="col">
                <input type="text" class="form-control" name="dateNaissance" required>
            </div>
        </div>
        <div class="form row mb-3">
            <div class="col">
                <label class="col-form-label"> Adresse :</label>
            </div>
            <div class="col">
                <input type="text" class="form-control" name="adresse" required>
            </div>
        </div>
        <div class="form row mb-3">
            <div class="col">
                <label class="col-form-label"> Numéro de sécurité sociale :</label>
            </div>
            <div class="col">
                <input type="text" class="form-control" name="numSecuSociale" required>
            </div>
        </div>
        <div class="rounded float-right">
            <button type="submit" class="btn btn-primary">Ajouter un nouveau collaborateur</button>
        </div>
    </form>





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