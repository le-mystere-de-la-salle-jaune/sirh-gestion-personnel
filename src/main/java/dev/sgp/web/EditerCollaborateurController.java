package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		if(matriculeParam == null || titreParam == null || nomParam == null || prenomParam == null){
			resp.setStatus(400);
		}
		else{
			resp.setContentType("text/html");
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition de collaborateur</h1>Matricule : "+matriculeParam+"<br>Titre : "+titreParam+"<br>Nom : "+nomParam+"<br>Prenom : "+prenomParam);
			resp.setStatus(201);
		}
		
	}

}
