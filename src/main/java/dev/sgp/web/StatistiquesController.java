package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

@WebServlet(asyncSupported = false, name = "StatistiquesController", urlPatterns = {"/collaborateurs/statistiques"} )
public class StatistiquesController extends HttpServlet {

	private static VisiteWebService visiteWebService = Constantes.VISITE_WEB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listeStats", visiteWebService);
		req.setAttribute("allUrl", visiteWebService.catchAllUrl());
		req.getRequestDispatcher("/WEB-INF/views/collab/statistiques.jsp").forward(req, resp);
	}
	
	public static void addStats(String path, double after, double before){
		visiteWebService.addStats(path,after,before);
	}

}
