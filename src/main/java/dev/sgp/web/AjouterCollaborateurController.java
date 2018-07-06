package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@SuppressWarnings("serial")
public class AjouterCollaborateurController extends HttpServlet {

	private CollaborateurService collaborateurService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateur.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		boolean success = true;

		// lecture fichier de configuration
		ResourceBundle applicaionProperties = ResourceBundle.getBundle("application");
		String suffixeMail = applicaionProperties.getString("suffixeMail");

		// paramètres récupérés du formulaire
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		LocalDate dateDeNaissanceParam = LocalDate.parse(req.getParameter("dateDeNaissance"));
		String adresseParam = req.getParameter("adresse");
		String numeroSecuriteSocialeParam = req.getParameter("numeroSecuriteSociale");

		// paramètres générés
		String matricule = generateMatricule(8);
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		String emailPro = prenomParam.toLowerCase().replaceAll("\\s+", "") + "."
				+ nomParam.toLowerCase().replaceAll("\\s+", "") + "@" + suffixeMail;
		boolean actif = true;

		if (numeroSecuriteSocialeParam.length() != 15) {
			resp.setStatus(400);
			success = false;
		}

		Collaborateur nouveauCollaborateur = new Collaborateur(matricule, nomParam, prenomParam, dateDeNaissanceParam,
				adresseParam, numeroSecuriteSocialeParam, emailPro, "truc.png", dateHeureCreation, actif);

		if (success) {
			collaborateurService.sauvegarderCollaborateur(nouveauCollaborateur);
			resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
		} else {
			req.setAttribute("error", "ddddd");
			req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateur.jsp").forward(req, resp);
		}

	}

	public String generateMatricule(int length) {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String pass = "";
		for (int x = 0; x < length; x++) {
			int i = (int) Math.floor(Math.random() * 62);
			pass += chars.charAt(i);
		}
		System.out.println(pass);
		return pass;
	}

}
