package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/collaborateurs/editer")
public class EditerCollaborateursController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est matricule
		String matriculeParam = req.getParameter("matricule");
		if (matriculeParam != null) {
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "Matricule : " + matriculeParam);
		} else {
			resp.setContentType("text/html");
			resp.getWriter().write("Un matricule est attendu");
			resp.setStatus(400);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// liste des paramètres de la requête POST
		HashMap<String, String> listeParams = new HashMap<>();
		listeParams.put("matricule", req.getParameter("matricule"));
		listeParams.put("titre", req.getParameter("titre"));
		listeParams.put("nom", req.getParameter("nom"));
		listeParams.put("prenom", req.getParameter("prenom"));

		// liste des paramètres manquants
		List<String> missingParams = new ArrayList<>();

		// succès de la requête
		boolean requestSuccess = true;

		// vérification des paramètres de la requête
		for (Map.Entry<String, String> p : listeParams.entrySet()) {
			if (p.getValue() == null) {
				requestSuccess = false;
				missingParams.add(p.getKey());
			}
		}

		if (requestSuccess) {
			resp.setContentType("text/html");
			resp.getWriter().write("Création d'un collaborateur avec les informations suivantes :<br /><ul>");
			for (Map.Entry<String, String> p : listeParams.entrySet())
				resp.getWriter().write("<li>" + p.getKey() + " : " + p.getValue() + "</li>");
			resp.getWriter().write("</ul>");
		} else {
			resp.setContentType("text/html");
			resp.getWriter().write("Les paramètres suivants sont incorrects : <br /><ul>");
			for (String p : missingParams)
				resp.getWriter().write("<li>" + p + "</li>");
			resp.getWriter().write("</ul>");
		}
	}
}
