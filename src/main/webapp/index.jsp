<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">

  <title>Collaborateur</title>
</head>

<body class="container-fluid">

  <nav class="navbar navbar-expand-sm navbar-light bg-light">
    <a class="navbar-brand" href="#">
      <img alt="Logo" src="">
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
      aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
          <a class="nav-link" href="collaborateurs/lister">Collaborateurs
            <span class="sr-only">(current)</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="statistiques/afficher">Statistiques
            <span class="sr-only">(current)</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Activitées
            <span class="sr-only">(current)</span>
          </a>
        </li>
      </ul>
    </div>
  </nav>

  <div>
    <div class="row justify-content-end">
      <div class="col-sm-3-offset-9">
      	<a href="<c:url value='collaborateurs/ajouter'/>" class="btn btn-secondary" role="button">Ajouter un nouveau collaborateur</a>
        <span class="sr-only">(current)</span>
      </div>
    </div>
    <br/>

    <h1>Les collaborateurs</h1>

    <div class=" container-fluid">
      <div class="row justify-content-start">
        <div class="col-sm-3">
          <label for="name" id=labelName>Rechercher un nom ou un prénom qui commence par :</label>

        </div>
        <div class="col-sm-4">
          <input type="text" id="name">
          <input type="button" id="rechercher" value="Rechercher">
        </div>
        <div class="col-sm-5">
          <input type="checkbox" id="checkAddCollab">
          <label for="checkAddCollab" style="word-break: normal;">Voir les collaborateurs désactivés</label>
        </div>
      </div>


      <div class="row">
        <div class="col-6 col-sm-3">
          <label for="departement" style="text-align: left;">Filtrer par département : </label>
        </div>
        <div class="col-sm-3">
          <select class="form-control" id="departement">
            <option>Tous</option>
            <option>Comptabilité</option>
            <option>Ressources Humaines</option>
            <option>Informatique</option>
          </select>
        </div>
      </div>
    </div>
    <br/>

    <div class="row">

      <div class="col-12 col-md-4">



        <div class="card mb-3 box-shadow">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Nom Prenom</h4>
          </div>
          <div class="card-body">
            <div class="row">
              <div class="col-12 col-sm-4">
                <img src="" alt="Photo">
              </div>
              <div class="col-12 col-sm-8">
                <ul class="list-unstyled mt-3 mb-4">
                  <li>Fonct. : développeur </li>
                  <li>Départ. : informaticien</li>
                  <li>Email : maxime.tremion@hotmail.fr</li>
                  <li>Tél. : 0635210949</li>
                </ul>
              </div>
              <div class="col-2 offset-4 col-sm-4 offset-sm-8">
                <button type="button" class="btn btn-outline-secondary">Editer</button>
              </div>
            </div>
          </div>
        </div>

      </div>

      <div class="col-12 col-md-4">

        <div class="card mb-3 box-shadow">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Nom Prenom</h4>
          </div>
          <div class="card-body">
            <div class="row">
              <div class="col-12 col-sm-4">
                <img src="" alt="Photo">
              </div>
              <div class="col-12 col-sm-8">
                <ul class="list-unstyled mt-3 mb-4">
                  <li>Fonct. : développeur </li>
                  <li>Départ. : informaticien</li>
                  <li>Email : maxime.tremion@hotmail.fr</li>
                  <li>Tél. : 0635210949</li>
                </ul>
              </div>
              <div class="col-2 offset-4 col-sm-4 offset-sm-8">
                <button type="button" class="btn btn-outline-secondary">Editer</button>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="col-12 col-md-4">
        <div class="card mb-3 box-shadow">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Nom Prenom</h4>
          </div>
          <div class="card-body">
            <div class="row">
              <div class="col-12 col-sm-4">
                <img src="" alt="Photo">
              </div>
              <div class="col-12 col-sm-8">
                <ul class="list-unstyled mt-3 mb-4">
                  <li>Fonct. : développeur </li>
                  <li>Départ. : informaticien</li>
                  <li>Email : maxime.tremion@hotmail.fr</li>
                  <li>Tél. : 0635210949</li>
                </ul>
              </div>
              <div class="col-2 offset-4 col-sm-4 offset-sm-8">
                <button type="button" class="btn btn-outline-secondary">Editer</button>
              </div>
            </div>
          </div>
        </div>


      </div>

      <div class="col-12 col-md-4">
        <div class="card mb-3 box-shadow">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Nom Prenom</h4>
          </div>
          <div class="card-body">
            <div class="row">
              <div class="col-12 col-sm-4">
                <img src="" alt="Photo">
              </div>
              <div class="col-12 col-sm-8">
                <ul class="list-unstyled mt-3 mb-4">
                  <li>Fonct. : développeur </li>
                  <li>Départ. : informaticien</li>
                  <li>Email : maxime.tremion@hotmail.fr</li>
                  <li>Tél. : 0635210949</li>
                </ul>
              </div>
              <div class="col-2 offset-4 col-sm-4 offset-sm-8">
                <button type="button" class="btn btn-outline-secondary">Editer</button>
              </div>
            </div>
          </div>
        </div>
      </div>


      <div class="col-12 col-md-4">
        <div class="card mb-3 box-shadow">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Nom Prenom</h4>
          </div>
          <div class="card-body">
            <div class="row">
              <div class="col-12 col-sm-4">
                <img src="" alt="Photo">
              </div>
              <div class="col-12 col-sm-8">
                <ul class="list-unstyled mt-3 mb-4">
                  <li>Fonct. : développeur </li>
                  <li>Départ. : informaticien</li>
                  <li>Email : maxime.tremion@hotmail.fr</li>
                  <li>Tél. : 0635210949</li>
                </ul>
              </div>
              <div class="col-2 offset-4 col-sm-4 offset-sm-8">
                <button type="button" class="btn btn-outline-secondary">Editer</button>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="col-12 col-md-4">


        <div class="card mb-3 box-shadow">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Nom Prenom</h4>
          </div>
          <div class="card-body">
            <div class="row">
              <div class="col-12 col-sm-4">
                <img src="" alt="Photo">
              </div>
              <div class="col-12 col-sm-8">
                <ul class="list-unstyled mt-3 mb-4">
                  <li>Fonct. : développeur </li>
                  <li>Départ. : informaticien</li>
                  <li>Email : maxime.tremion@hotmail.fr</li>
                  <li>Tél. : 0635210949</li>
                </ul>
              </div>
              <div class="col-2 offset-4 col-sm-4 offset-sm-8">
                <button type="button" class="btn btn-outline-secondary">Editer</button>
              </div>
            </div>
          </div>
        </div>
      </div>
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
</body>

</html>