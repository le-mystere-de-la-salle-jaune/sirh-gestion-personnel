package dev.sgp.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

@WebFilter("/*")
public class FrequentationFiltre implements Filter {

	private FilterConfig config = null;
	private VisiteWebService visiteWebService = Constantes.VISITE_SERVICE;

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
		long before = System.currentTimeMillis();
		filterChain.doFilter(req, resp);
		long after = System.currentTimeMillis();
		visiteWebService.sauvegarderVisiteWeb(
				new VisiteWeb(((HttpServletRequest) req).getRequestURI(), (int) (after - before)));
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		config.getServletContext().log("FrequentationFiltre intialisé");
	}

}
