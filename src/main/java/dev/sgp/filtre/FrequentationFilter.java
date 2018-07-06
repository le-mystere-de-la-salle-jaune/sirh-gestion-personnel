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
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.StatistiquesService;
import dev.sgp.util.Constantes;

@WebFilter(urlPatterns = { "/*" }, description = "Request timer filter")
public class FrequentationFilter implements Filter {

	private FilterConfig config = null;
	private StatistiquesService statService = Constantes.STATS_SERVICE;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		config.getServletContext().log("FrequentationFilter initialized");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		long before = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long after = System.currentTimeMillis();
		if( (((HttpServletResponse) resp).getStatus()) < 400) {
			statService.addVisite( new VisiteWeb( ((HttpServletRequest) req).getRequestURI() , (after - before)));
		}
		
	}

	@Override
	public void destroy() {
	}

}
