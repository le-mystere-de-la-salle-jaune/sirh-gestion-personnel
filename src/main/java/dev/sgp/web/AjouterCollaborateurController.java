package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/ajouter")
public class AjouterCollaborateurController extends HttpServlet {

	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		// afficher le formulaire
		req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateur.jsp")
		.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// récupère la valeur des paramètres
		String nom = req.getParameter("inputName");
		String prenom = req.getParameter("inputFirstname");
		String dateNaissance = req.getParameter("inputBd");
		String adresse = req.getParameter("inputAdresse");
		String numSecuSoc = req.getParameter("inputNumber");
		
		String email = prenom + nom + "@societe.com";
		Collaborateur collab = new Collaborateur(UUID.randomUUID(), nom, prenom, LocalDate.parse(dateNaissance), adresse, numSecuSoc, email, "photo", ZonedDateTime.now(ZoneId.of("Europe/Paris")), true);
		
		// sauvegarder un nouveau collaborateur
        Constantes.COLLAB_SERVICE.sauvegarderCollaborateur(collab);
        
        resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");

	}




}
