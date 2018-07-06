<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
                    <a class="nav-link" href="#">Activités</a></li>
            </ul>
        </div>
    </nav>

    <div class="container-fluid">
        <h1>Nouveau Collaborateur</h1>
        <form id="toValidate" method="post">
            <div class="form-group row justify-center">
                <label for="inputName" class="col-md-3 col-form-label">Nom</label>
                <div class="col-sm-8">
                <input type="text" class="form-control" id="inputName" name="inputName">
                <div class="invalid-feedback">Le nom est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputFirstname" class="col-md-3 col-form-label">Prénom</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="inputFirstname" name="inputFirstname">
                    <div class="invalid-feedback">Le prénom est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputBd" class="col-md-3 col-form-label">Date de naissance</label>
                <div class="col-sm-8">
                    <input type="date" class="form-control" id="inputBd" name="inputBd">
                    <div class="invalid-feedback">La date est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputAdress" class="col-md-3 col-form-label">Adresse</label>
                <div class="col-sm-8">
                    <textarea name="inputAdresse" class="form-control" id="adresse"></textarea>
                    <div class="invalid-feedback">L'adresse est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputNumber" class="col-md-3 col-form-label">Numéro de sécurité sociale</label>
                <div class="col-sm-8">
                    <input type="number" class="form-control" id="inputNumber" name="inputNumber">
                    <div class="invalid-feedback">Le numéro de sécu est obligatoire</div>
                </div>
            </div>
            <div class="row justify-content-end">
                <div class="col-2">
                    <button type="submit" class="btn-create btn-primary">Créer</button>
                </div>
            </div>
        </form>
        <script>
            
            if (window.location.href.includes("?errors")) {
                console.log("version avec les erreurs")
                var formElt = document.getElementById("toValidate");
                if(formElt.checkValidity() === false) {
                    formElt.classList.add("was-validated");
                }
            }
        </script>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>
</body>
</html>