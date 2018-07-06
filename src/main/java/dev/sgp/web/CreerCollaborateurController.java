package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebServlet(asyncSupported = false, name = "CreerCollaborateurController", urlPatterns = {"/collaborateurs/creer"} )
public class CreerCollaborateurController extends HttpServlet  {
		// recuperation du service
		private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			LocalDate dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"));
			String adresse = req.getParameter("adresse");
			String numSecuSociale = req.getParameter("numSecuSociale");
			
			collabService.sauvegarderCollaborateur(new Collaborateur(nom,prenom,dateNaissance,adresse,numSecuSociale ));
			
			resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
			
			
			
		}
		


}
