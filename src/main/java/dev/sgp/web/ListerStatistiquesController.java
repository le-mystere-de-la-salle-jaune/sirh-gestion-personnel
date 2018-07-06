package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.StatistiqueService;
import dev.sgp.util.Constantes;

@WebServlet("/statistiques")
public class ListerStatistiquesController extends HttpServlet {

	// recuperation du service
	private StatistiqueService statService = Constantes.STAT_SERVICE;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		
		// utilisation du service
		List<VisiteWeb> listeVisites = statService.listerVisites();
		req.setAttribute("listeVisites", listeVisites);
		req.getRequestDispatcher("/WEB-INF/views/stats/statistiques.jsp")
		.forward(req, resp);
	}
}

