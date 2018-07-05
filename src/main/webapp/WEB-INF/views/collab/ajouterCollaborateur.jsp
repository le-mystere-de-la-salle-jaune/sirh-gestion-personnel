<%@ page import="java.util.List"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css">
<title>SGP - App</title>

</head>
<body>
    <div class="container">
        <form id="tovalidate" method="POST">
            <div class="form-group row">
                <label for="inputName" class="col-md-2 col-form-label">Nom</label>
                <div class="col-md-10">
                    <input type="text" class="form-control" name="nom" id="inputName" placeholder="Nom" required>
                    <div class="invalid-feedback">Nom est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPrenom" class="col-md-2 col-form-label">Prénom</label>
                <div class="col-md-10">
                    <input type="text" class="form-control" name="prenom" id="inputPrenom" placeholder="Prénom" required>
                    <div class="invalid-feedback">Prénom est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputDateNaissance" class="col-md-2 col-form-label">Date de naissance</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" name="dateNaissance" id="inputDateNaissance" placeholder="Date" required>
                    <div class="invalid-feedback">Date est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputAdresse" class="col-md-2 col-form-label">Adresse</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="adresse" id="inputAdresse" rows="3" required ></textarea>
                    <div class="invalid-feedback">Adresse est obligatoire</div>    
                </div>
            </div>
            <div class="form-group row">
                    <label for="inputNumSecu" class="col-md-2 col-form-label">Numéro de sécurité sociale</label>
                    <div class="col-md-10">
                        <input type="text" name="numSeco" class="form-control" id="inputNumSecu" placeholder="Numéro de sécurité" maxlength="15" required>
                        <div class="invalid-feedback">Numéro de sécu est obligatoire</div>   
                    </div>
                </div>
            <div class="form-group row">
                <div class="offset-md-10 col-md-2">
                    <button type="submit" class="btn btn-primary">Créer</button>
                </div>
            </div>
        </form>

        <script>
            if (window.location.href.includes("?error")) {
                console.log("version avec les erreurs")
                var formElt = document.getElementById("tovalidate");

                if(formElt.checkValidity() === false) {
                    formElt.classList.add("was-validated");
                }
            }
        </script>
    </div>

</body>
</html>