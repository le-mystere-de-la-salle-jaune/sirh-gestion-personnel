package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

import dev.sgp.entite.VisiteWeb;

public class StatistiqueService {
	List<VisiteWeb> listeVisites = new ArrayList<>();
	public List<VisiteWeb> listerVisites() {
		return listeVisites;
	}
	public void sauvegarderVisiteWeb(VisiteWeb visite) {
		listeVisites.add(visite);
	}
	
	// calcule les statistiques avec summaryStatistics donne count, min, max, average(moyenne)
	public Map<String, LongSummaryStatistics> calculerStats() {        
        
        Map<String, LongSummaryStatistics> result = listeVisites.stream().collect(
                        Collectors.groupingBy(
                        s -> s.getChemin(), Collectors.collectingAndThen(
                        Collectors.summarizingLong(VisiteWeb::getTempsExecution),i -> i)
                        )
                        );
        return result;
    }
	

}