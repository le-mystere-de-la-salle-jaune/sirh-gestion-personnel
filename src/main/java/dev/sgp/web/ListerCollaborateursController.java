package dev.sgp.web;

import java.util.List;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entities.Collaborateur;
import dev.sgp.entities.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	private DepartementService depService = Constantes.DEP_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		List<Departement> departements = depService.listDepartements();
		
		// A ajouter
		req.setAttribute("collabList", collaborateurs);
		req.setAttribute("depList", departements);
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);
	}
}
