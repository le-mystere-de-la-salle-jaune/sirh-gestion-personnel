<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"href="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/css/bootstrap.css">
<title>SGP - App</title>
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
			
		List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("listCollab");
			for (Collaborateur c : collaborateurs) {
		%>
		<li><%=c.getNom()%></li>
		<%
			}
		%>
	</ul>
</body>
</html>