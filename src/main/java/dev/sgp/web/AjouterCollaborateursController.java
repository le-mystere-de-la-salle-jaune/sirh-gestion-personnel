package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;

public class AjouterCollaborateursController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateur.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateNaissance = req.getParameter("dateNaissance");
		String adresse = req.getParameter("adresse");
		String numSecu = req.getParameter("numSecu");
		
		String mailPro = prenom+"."+nom+"FICHIER RESSOURCE A FAIRE";
		String photo = "/images/photo";
		boolean actif = true;
		
		resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
	}

	
}
