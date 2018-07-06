package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.StatistiquesService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/statistiques")
public class AfficherStatistiquesController extends HttpServlet {
	private StatistiquesService statService = Constantes.STATS_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("mapStats", statService.calculerStats());
		req.getRequestDispatcher("/WEB-INF/views/stats/statistiques.jsp").forward(req, resp);
	}
}
