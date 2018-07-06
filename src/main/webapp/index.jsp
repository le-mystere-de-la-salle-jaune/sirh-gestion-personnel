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
    
    <h1>Bienvenue</h1>
        
<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand" href='<c:url value="/collaborateurs/lister"/>'>Collaborateurs</a>
</nav>

<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand" href='<c:url value="/statistiques"/>'>Statistiques</a>
</nav>
        

        

    </div>
</body>

</html>

</html>