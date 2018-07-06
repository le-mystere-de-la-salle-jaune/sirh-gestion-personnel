package dev.sgp.service;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {
	List<VisiteWeb> listeVisitesWeb = new ArrayList<>();

	public List<VisiteWeb> listerVisitesWeb() {
		return listeVisitesWeb;
	}

	public void sauvegarderVisiteWeb(VisiteWeb visiteWeb) {
		listeVisitesWeb.add(visiteWeb);
	}

	public Map<String, IntSummaryStatistics> genererStatistiques() {
		Map<String, IntSummaryStatistics> stats = listeVisitesWeb.stream()
				.collect(Collectors.groupingBy(v -> v.getChemin(),
						Collectors.collectingAndThen(Collectors.summarizingInt(VisiteWeb::getTempsExecution), i -> i)));
		return stats;
	}
}
