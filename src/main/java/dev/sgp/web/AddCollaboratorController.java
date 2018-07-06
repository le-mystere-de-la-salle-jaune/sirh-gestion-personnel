package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entities.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/ajouter")
public class AddCollaboratorController extends HttpServlet{

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateurs.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		
		collaborateurs.add(new Collaborateur(req.getParameter("lastName"), 
				req.getParameter("firstName"), LocalDate.parse(req.getParameter("birthDate")), 
				req.getParameter("address"), req.getParameter("socialSecurityNumber"), "ma_photo", true));
		
		resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
	}



}
