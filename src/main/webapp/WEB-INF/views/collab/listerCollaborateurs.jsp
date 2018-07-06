<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	
	<ul>
	<c:forEach items="${listCollabs}" var="collab">
		<li>${collab.matricule}</li>
		<li>${collab.nom}</li>
		<li>${collab.prenom}</li>
		<li>${collab.dateDeNaissance}</li>
		<li>${collab.adresse}</li>
		<li>${collab.numeroDeSecuriteSociale}</li>
	</c:forEach>	
	</ul>
</body>
</html>