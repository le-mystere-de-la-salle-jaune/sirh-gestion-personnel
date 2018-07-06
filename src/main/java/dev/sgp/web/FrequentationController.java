package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

@WebServlet("/statistiques")
public class FrequentationController extends HttpServlet{
	
	VisiteWebService service = Constantes.VISITE_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listeStats", service.calculerStats());
		req.getRequestDispatcher("/WEB-INF/views/statistiques.jsp").forward(req, resp);
	}

	

	
}
