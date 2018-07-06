package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Statistique;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.StatistiqueService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/ajouter")
public class AjouterCollaborateursController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	private StatistiqueService statistiqueService = Constantes.STATS_SERVICE;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateurs.jsp").forward(req, resp);
		
	}



	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateDeNaissance = req.getParameter("dateDeNaissance");
		String adresse =  req.getParameter("adresse");
		String numeroSecuSociale = req.getParameter("numeroSecuriteSociale");
		
		//DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //LocalDate dateDeNaissanceLocalDate = LocalDate.parse(dateDeNaissance, formater);
		
		Collaborateur collab = collabService.creerCollaborateur(nom,prenom,LocalDate.parse(dateDeNaissance),adresse,numeroSecuSociale);
		collabService.sauvegarderCollaborateur(collab);
		
		resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");
	}

}
