<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <form id="tovalidate" method="POST">
            <div class="form-group row">
                <label for="inputName" class="col-md-2 col-form-label">Nom</label>
                <div class="col-md-10">
                    <input type="text" name="nom" class="form-control" id="inputName" placeholder="Nom" required>
                    <div class="invalid-feedback">Nom est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPrenom" class="col-md-2 col-form-label">Prénom</label>
                <div class="col-md-10">
                    <input type="text" name ="prenom" class="form-control" id="inputPrenom" placeholder="Prénom" required>
                    <div class="invalid-feedback">Prénom est obligatoire</div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputDateNaissance" class="col-md-2 col-form-label">Date de naissance</label>
                <div class="col-sm-10">
                    <input type="date" name="dateDeNaissance" class="form-control" id="inputDateNaissance" placeholder="Date" required>
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
                        <input type="text" name="numeroSecuriteSociale" class="form-control" id="inputNumSecu" placeholder="Numéro de sécurité" required>
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


    <!-- jQuery first, then poper, then Bootstrap JS. -->
    <script src="js/jquery-slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>