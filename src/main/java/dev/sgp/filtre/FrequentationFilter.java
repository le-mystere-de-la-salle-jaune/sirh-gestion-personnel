package dev.sgp.filtre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.StatistiqueService;
import dev.sgp.util.Constantes;

@WebFilter(urlPatterns = { "/*" },
description = "Filtre la frequentation")
public class FrequentationFilter implements Filter {
	// recuperation du service
		private StatistiqueService statService = Constantes.STAT_SERVICE;
		
	@Override
	public void init(FilterConfig config) throws ServletException {
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// réception requête HTTP
		long before = System.currentTimeMillis();
		
		// délègue le traitement de la requête à un autre filtre ou un contrôleur
		chain.doFilter(req, resp);
		
		// à ce stade
		// le contrôleur a fait son travail
		// la page JSP aussi
		
		// alors je note le temps courant
		long after = System.currentTimeMillis();
		
		
		String chemin = ((HttpServletRequest) req).getRequestURI();
		long tempsExecution = after - before;
		VisiteWeb visiteWeb = new VisiteWeb(chemin, tempsExecution);
		statService.sauvegarderVisiteWeb(visiteWeb);

		
		
		
		// récupère les valeurs du filter
		//VisiteWeb visite = new VisiteWeb(chemin, tempsExecution);
		
		
		

	}
	@Override
	public void destroy() {
	}
}