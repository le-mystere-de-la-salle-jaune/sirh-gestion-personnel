package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Config;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/ajouter")
public class AjouterCollaborateursController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateur.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		LocalDate dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"));
		String adresse = req.getParameter("adresse");
		String numSecu = req.getParameter("numSecu");

		String mailPro = prenom + "." + nom + "@" + Config.mail;
		String photo = "/images/photo";
		boolean actif = true;

		String error = "";

		if (numSecu == null) {
			error += "Le numéro de sécu doit être renseigné <br>";
		} else if (numSecu.length() != 15) {
			error += "Le num de secu doit faire 15 caractère <br>";
		} else if (nom == null) {
			error += "Le nom doit être renseigné <br>";
		} else if (prenom == null) {
			error += "Le prénom doit être renseigné <br>";
		} else if (dateNaissance != null) {
			error += "La date de naissance doit être renseignée";
		} else if (adresse == null) {
			error += "L'adresse doit être renseigné";
		} else if (dateNaissance == null) {
			error += "La date de naissance doit être renseigné";
		}
		
		if(error.equals("")){
			resp.sendError(400);
		} else {
			Collaborateur collab = new Collaborateur(nom, prenom, dateNaissance, adresse, numSecu, mailPro, photo, ZonedDateTime.now(), actif);
			collabService.sauvegarderCollaborateur(collab);
		}

		resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
	}

}
