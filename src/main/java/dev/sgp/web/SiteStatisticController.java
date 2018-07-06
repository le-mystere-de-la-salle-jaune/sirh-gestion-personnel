package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entities.WebVisite;
import dev.sgp.service.StatisticService;
import dev.sgp.util.Constantes;

public class SiteStatisticController extends HttpServlet{
	
	private StatisticService visiteService = Constantes.STATISTIC_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		
		HashMap<String, List<WebVisite>> visitsMap = visiteService.getAllVisites();
		
		HashMap<String, IntSummaryStatistics> statsList = new HashMap<>();
		
		IntSummaryStatistics result = new IntSummaryStatistics();
		
		
		for(Entry<String, List<WebVisite>> entry : visitsMap.entrySet()){
			result = entry.getValue().stream().collect(Collectors.summarizingInt(WebVisite::getExecutionTime));
			
			statsList.put(entry.getKey(), result);
		}
		
		//result.getSum();

		// A ajouter
		req.setAttribute("visitList", statsList);
		req.getRequestDispatcher("/WEB-INF/views/collab/siteStatistics.jsp")
		.forward(req, resp);
	}

}
