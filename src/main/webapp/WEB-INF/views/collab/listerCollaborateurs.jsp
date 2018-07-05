<%@page import="javax.swing.ListCellRenderer"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page import="java.util.List"%>
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
	<h1>Les collaborateurs</h1>
	<ul>
		<%
			List<Collaborateur> listeCollaborateurs = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
			for (Collaborateur collab : listeCollaborateurs) {
		%>
		<li><%=collab.getMatricule()%></li>
		<%
			}
		%>
	</ul>
	
	<!-- jQuery first, then poper, then Bootstrap JS. -->
	<script src="js/jquery-slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>