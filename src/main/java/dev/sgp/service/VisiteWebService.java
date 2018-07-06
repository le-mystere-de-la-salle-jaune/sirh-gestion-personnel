package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {
	List<VisiteWeb> visiteWeb = new ArrayList<>();
	
	public VisiteWebService(){
	}

	public List<VisiteWeb> getVisiteWeb() {
		return visiteWeb;
	}

	public void setVisiteWeb(List<VisiteWeb> visiteWeb) {
		this.visiteWeb = visiteWeb;
	}

	public void addVisiteWeb(VisiteWeb visite){
		visiteWeb.add(visite);
	}
	
	public Map<String, LongSummaryStatistics> calculerStats()
    {        
        
        Map<String, LongSummaryStatistics> result = visiteWeb.stream().collect(
                        Collectors.groupingBy(
                        s -> s.getChemin(), Collectors.collectingAndThen(
                        Collectors.summarizingLong(VisiteWeb::getTempsExecution),i -> i)
                        )
                        );
        return result;
    }
}
