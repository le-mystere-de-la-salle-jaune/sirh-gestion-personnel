package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/editer")
public class EditerCollaborateurController extends HttpServlet {
	
	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		
		//Map contenant les attributs du collaborateurs ainsi que leurs valeurs
		Map<String, String> parameters = new HashMap<String, String>();
		
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateNaissance = req.getParameter("dateNaissance");
		String adresse = req.getParameter("adresse");
		String numeroSecuriteSociale = req.getParameter("numeroSecuriteSociale");
		
		parameters.put("nom",nom);
		parameters.put("prenom",prenom);
		parameters.put("dateNaissance", dateNaissance);
		parameters.put("adresse",adresse);
		parameters.put("numeroSecuriteSociale",numeroSecuriteSociale);
		
		boolean parameterIsMissing = false;
		StringBuilder sbErrorResponse = new StringBuilder("Les paramètres suivants sont incorrects:");
		
		for (Entry<String, String> param : parameters.entrySet()) {
			if (param.getValue() == null || param.getValue().isEmpty()) {
				parameterIsMissing = true;
				sbErrorResponse.append(" " + param.getKey() + " ");
			}
		}
		if (parameterIsMissing) {
			resp.sendError(400, sbErrorResponse.toString());
		} else {
			// utilisation du service
			this.collabService.sauvegarderCollaborateur(new Collaborateur(nom, prenom, LocalDate.parse(dateNaissance, DateTimeFormatter.ofPattern("yyyy-MM-dd")), adresse,
					numeroSecuriteSociale));
			
			resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister"); 
			//resp.setContentType("text/html");
			// code HTML ecrit dans le corps de la reponse
			//resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "<p>Matricule: " + matricule + ", Date de Naissance : " + dateNaissance + ", Nom: " + nom + ", Prenom: " + prenom + "</p>");
		}

	}

}
