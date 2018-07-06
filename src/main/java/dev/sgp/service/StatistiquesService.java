package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

import dev.sgp.entite.VisiteWeb;

public class StatistiquesService {
	
	private List<VisiteWeb> visites;
	
	public StatistiquesService() {
		this.visites = new ArrayList<>();
	}
	
	public List<VisiteWeb> getVisites() {
		return this.visites;
	}
	
	public void addVisite(VisiteWeb visite) {
		this.visites.add(visite);
	}
		
	public Integer getNombreVisite() {
		return visites.size();
	}
	
	public Map<String, LongSummaryStatistics> calculerStats() {        
        return visites.stream()
        			  .collect(Collectors.groupingBy(v -> v.getChemin(), 
        					   Collectors.collectingAndThen(Collectors.summarizingLong(VisiteWeb::getTempsExecution),i -> i)));
    }

}
