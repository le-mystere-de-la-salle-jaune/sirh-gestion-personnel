package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

@SuppressWarnings("serial")
@WebServlet("/statistiques")
public class ListerVisitesWebController extends HttpServlet {
	private VisiteWebService visiteWebService = Constantes.VISITE_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<VisiteWeb> visitesWeb = visiteWebService.listerVisitesWeb();
		req.setAttribute("listeVisitesWeb", visitesWeb);
		req.getRequestDispatcher("/WEB-INF/views/visiteWeb/statistiques.jsp").forward(req, resp);
	}

}
