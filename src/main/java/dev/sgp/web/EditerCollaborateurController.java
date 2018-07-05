package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String matricule = req.getParameter("matricule");

		String reponseHtml = "<h1>Edition de collaborateur</h1>";

		resp.setContentType("text/html");

		if (matricule == null) {
			resp.setStatus(400);

			reponseHtml += "<p>GET /collaborateurs/editer</p><ul><li>Réponse : code=400</li>"
					+ "<li>Message d'erreur avec le texte = Un matricule est attendu</li>";

		} else {
			reponseHtml += "<p>Matricule : " + matricule;
		}

		resp.getWriter().write(reponseHtml);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");

		String reponseHtml = "<p>";

		if (matricule == null || titre == null || nom == null || prenom == null) {
			reponseHtml += "Les paramètres suivants sont incorrects : ";

			if (matricule == null) {
				reponseHtml += "matricule ";
			}
			if (titre == null) {
				reponseHtml += "titre ";
			}
			if (nom == null) {
				reponseHtml += "nom ";
			}
			if (prenom == null) {
				reponseHtml += "prenom ";
			}
		}
		else {
			reponseHtml += "matricule="+matricule+", titre="+titre +", nom="+nom+", prenom="+prenom+".";
		}
		reponseHtml += "</p>";
		
		resp.getWriter().write(reponseHtml);
	}

}
