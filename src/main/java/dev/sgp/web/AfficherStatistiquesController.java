package dev.sgp.web;

import java.io.IOException;
import java.util.LongSummaryStatistics;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Statistique;
import dev.sgp.service.StatistiqueService;
import dev.sgp.util.Constantes;

@WebServlet("/statistiques/afficher")
public class AfficherStatistiquesController extends HttpServlet {

		
		private StatistiqueService statistiqueService = Constantes.STATS_SERVICE;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			req.setAttribute("mapStats", statistiqueService.calculerStats());
			req.getRequestDispatcher("/WEB-INF/views/stats/afficherStatistiques.jsp").forward(req, resp);
		}
}


