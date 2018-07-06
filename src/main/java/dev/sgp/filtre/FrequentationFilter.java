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

@WebFilter(urlPatterns = { "/*" },
description ="Requete filtre frequentation")
public class FrequentationFilter implements Filter {
	private FilterConfig config = null;
	private VisiteWebService visite = Constantes.VISITE_SERVICE;
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		long before = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long after = System.currentTimeMillis();
		String path = ((HttpServletRequest) req).getRequestURI();
		config.getServletContext().log(path + " : " + (after - before));
		visite.addVisiteWeb(new VisiteWeb(path, (int)(after - before)));
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
