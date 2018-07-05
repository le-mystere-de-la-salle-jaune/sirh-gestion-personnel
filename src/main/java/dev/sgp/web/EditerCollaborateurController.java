package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {

		resp.setContentType("text/html");
		// code HTML ecrit dans le corps de la reponse
		resp.getWriter().write("<h1>Un matricule est attendu</h1>");
		resp.setStatus(400);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matricule = req.getParameter("matricule");
		String title = req.getParameter("titre");
		String lastName = req.getParameter("nom");
		String firstName = req.getParameter("prenom");
		
		resp.setContentType("text/html");
		
		if(matricule == null || title == null ||lastName == null ||firstName == null){
			resp.setStatus(400);
			String response = "Les paramètres suivants sont incorrects : ";
			response += (matricule==null)?"Matricule ":"";
			response += (title==null)?"Titre ":"";
			response += (lastName==null)?"Nom ":"";
			response += (firstName==null)?"Prenom ":"";
			
			resp.getWriter().write(response);
			
		}else{
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"+"<br> <h3>Création d'un collaborateur avec les information suivantes : <h3>"+
					"Matricule : "+ matricule
					+ " Titre : "+ title
					+ " Nom : "+ lastName
					+ " Prenom : "+ firstName);
		}

	}
	
	
	
}
