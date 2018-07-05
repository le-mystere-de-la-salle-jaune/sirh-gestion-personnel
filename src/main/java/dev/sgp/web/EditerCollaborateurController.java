package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> parameters = new HashMap<String, String>();
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		parameters.put("matricule", matricule);
		parameters.put("titre",titre);
		parameters.put("nom",nom);
		parameters.put("prenom",prenom);
		boolean parameterIsMissing = false;
		StringBuilder sbErrorResponse = new StringBuilder("Les paramètres suivants sont incorrects:");
		for (Entry<String, String> param : parameters.entrySet()) {
			if (param.getValue() == null) {
				parameterIsMissing = true;
				sbErrorResponse.append(" " + param.getKey() + " ");
			}
		}
		if (parameterIsMissing) {
			resp.sendError(400, sbErrorResponse.toString());
		} else {
			resp.setContentType("text/html");
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter()
					.write("<h1>Edition de collaborateur</h1>" + "<p>Matricule: " + matricule + ", titre: " + titre + ", nom: " + nom + ", prenom: " + prenom + "</p>");
		}

	}

}
