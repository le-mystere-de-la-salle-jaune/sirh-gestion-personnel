package dev.sgp.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entities.WebVisite;
import dev.sgp.service.StatisticService;
import dev.sgp.util.Constantes;

public class FrequentationFilter implements Filter {

	private FilterConfig config = null;
	private StatisticService visiteService = Constantes.STATISTIC_SERVICE;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		config = filterConfig;
		config.getServletContext().log("Frequentation flister initialized.");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		long before = System.currentTimeMillis();
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		String path = ((HttpServletRequest) request).getRequestURI();
		
		WebVisite session = new WebVisite(path, (int)(after - before));
		visiteService.addVisite(session);
		
		config.getServletContext().log(path + " : " + (after - before));
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
