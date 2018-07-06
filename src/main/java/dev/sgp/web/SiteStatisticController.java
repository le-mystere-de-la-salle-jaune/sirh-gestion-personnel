package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entities.WebVisite;
import dev.sgp.service.StatisticService;
import dev.sgp.util.Constantes;

public class SiteStatisticController extends HttpServlet{
	
	private StatisticService visiteService = Constantes.STATISTIC_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		
		List<WebVisite> visits = visiteService.getAllVisites();
		
		// A ajouter
		req.setAttribute("visitList", visits);
		req.getRequestDispatcher("/WEB-INF/views/collab/siteStatistics.jsp")
		.forward(req, resp);
	}

}
