package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est matricule
		String matriculeParam = req.getParameter("matricule");


		if (matriculeParam==null) {
			// renvoyer le code de la réponse
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");
		} else {
			resp.setContentType("text/html");
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"
					+ "matricule="+ matriculeParam);
		}
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est matricule
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");

		List<String> paramList = new ArrayList<>();
		paramList.add(matriculeParam);
		paramList.add(titreParam);
		paramList.add(nomParam);
		paramList.add(prenomParam);
	

		
		boolean isNull = false;
		for (String s : paramList) {

			if (s==null) {
				// renvoyer le code de la réponse

				isNull = true;

			}
		}

		if (isNull==true) {
			resp.setStatus(400);
			resp.getWriter().write("Un paramètre est attendu");
			resp.setContentType("text/html");
		} else {
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition de collaborateur</h1>"
					+ "<ul>"
					+ "<li>matricule="+ matriculeParam + "</li>"
					+ "<li>titre="+ titreParam + "</li>"
					+ "<li>titre="+ nomParam + "</li>"
					+ "<li>titre="+ prenomParam + "</li>"
					+ "</ul>");
		}
	}



}





