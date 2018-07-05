<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
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
		<%
			List<Collaborateur> listeCollabs = (List<Collaborateur>) request.getAttribute("listCollabs");
			for (Collaborateur collab : listeCollabs) {
		%>
		<li><%=collab.getMatricule()%></li>
		<li><%=collab.getNom()%></li>
		<li><%=collab.getPrenom()%></li>
		<li><%=collab.getDateDeNaissance()%></li>
		<li><%=collab.getAdresse()%></li>
		<li><%=collab.getNumeroDeSecuriteSociale()%></li>
		<%
			}
		%>
	</ul>
</body>
</html>