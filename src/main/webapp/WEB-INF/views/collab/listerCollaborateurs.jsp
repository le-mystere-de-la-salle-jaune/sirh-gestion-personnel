<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Bootstrap CSS -->
<link rel="stylesheet"href="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/css/bootstrap.css">
<title>SGP - App</title>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href='<c:url value="/"/>'>
            <img src="https://static.getjar.com/icon-50x50/76/945275_thm.jpg" width="30" height="30" alt="">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
            aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href='<c:url value="/collaborateurs/lister"/>'>Collaborateurs
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href='<c:url value="/statistiques"/>'>Statistiques</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Activités</a>
                </li>
            </ul>
        </div>
    </nav>


    <div class="container-fluid">
        <div class="row justify-content-end mr-3">

            <button type="submit" class="btn btn-primary" onclick="window.location.href='<%=request.getContextPath()%>/collaborateurs/ajouter'">Ajouter un nouveau collaborateur</button>

        </div>
        <h1>Les collaborateurs</h1>
        <form>
            <div class="form-group row justify-content-md">
                <label for="searchByName" class="col-md-4 col-form-label">Rechercher un nom ou un prénom qui commence par :</label>
                <div class="col-md-3">
                    <input type="text" class="form-control" id="searchByName" aria-describedby="search">
                </div>
                <div class="col-md-auto">
                    <button type="submit" class="btn-add btn-primary">Rechercher</button>
                </div>
                <div class="col-md-auto">
                    <div class="form-group form-check">
                        <input type="checkbox" class="form-check-input" id="seeAllCheck">
                        <label class="form-check-label" for="seeAllCheck">Voir les collaborateurs désactivés</label>
                    </div>
                </div>
            </div>
            <div class="form-group row justify-content-md">
                <label for="FilterByAreaSelect" class="col-md-4 col-form-label">Filter par département :</label>
                <div class="col-md-3">
                    <select class="form-control" id="FilterByAreaSelect">
                        <option>Tous</option>
                        <option>Comptabilité</option>
                        <option>Ressources Humaines</option>
                        <option>Informatique</option>
                    </select>
                </div>
            </div>
        </form>

        <div class="row no-gutters justify-content-around">
        

        <!-- JSTL itération sur la liste des collaborateurs -->
		<c:forEach items="${listCollab}" var="collab"> 


            <div class="card bg-light col-md-4 mb-3">
                <div class="card-header"> ${collab.nom} ${collab.prenom}</div>
                <div class="card-body row">
                    <div class="col-sm-auto">
                        <img src="https://www.noob-online.com/images/avatar/1340.png" class="rounded float-left" alt="photo d'identité">
                    </div>
                    <div class="col-auto">
                        <p class="card-text">Fonction</p>
                        <p class="card-text">Département</p>
                        <p class="card-text">Email</p>
                        <p class="card-text">Téléphone</p>
                    </div>
                    <div class="col-auto">
                        <p>&nbsp;</p>
                        <p>&nbsp;</p>
                        <p>${collab.email}</p>
                        <p>${collab.numSecuSoc}</p>
                        <button type="submit" class="btn edit btn-primary">Editer</button>
                    </div>
                </div>
            </div>
		</c:forEach>
        </div>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>
    </div>
</body>

</html>

</html>