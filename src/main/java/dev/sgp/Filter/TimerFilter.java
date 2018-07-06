package dev.sgp.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.Statistique;
import dev.sgp.service.StatistiqueService;
import dev.sgp.util.Constantes;

@WebFilter(urlPatterns = {"/*"}, description = "Request timer filter")
public class TimerFilter implements Filter {
	private FilterConfig config = null;
	private StatistiqueService statistiqueService = Constantes.STATS_SERVICE;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		config.getServletContext().log("TimerFilter initialized");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		long before = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long after = System.currentTimeMillis();
		String path = ((HttpServletRequest) req).getRequestURI();
		config.getServletContext().log(path + " : " + (after - before));
		Statistique stat = new Statistique(path,after+before);
		statistiqueService.ajouterStat(stat);
	}

	@Override
	public void destroy() {
	}

}