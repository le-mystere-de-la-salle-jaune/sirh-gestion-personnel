package dev.sgp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

import dev.sgp.entite.Statistique;

public class StatistiqueService 
{	
	List<Statistique> listeStats = new ArrayList();
	
	public void ajouterStat(Statistique stat)
	{
		listeStats.add(stat);
	}
	
	public List<Statistique> afficherStats()
	{
		return listeStats;
	}
	
	public Map<String, LongSummaryStatistics> calculerStats()
	{		 
		
		Map<String, LongSummaryStatistics> result = listeStats.stream().collect(
						Collectors.groupingBy(
						s -> s.getChemin(), Collectors.collectingAndThen(
						Collectors.summarizingLong(Statistique::getTemps),i -> i)
						)
						);
		return result;
	}
}
