package dev.sgp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VisiteWebService {
	List<VisiteWeb> listeVisiteWeb = new ArrayList<>();

	public void sauvegarderStatistique(VisiteWeb stat) {
		listeVisiteWeb.add(stat);
	}

	public void sortByUrl() {
		Collections.sort(listeVisiteWeb, (l1, l2) -> l1.getChemin().compareTo(l2.getChemin()));
	}

	public void addStats(String path, double after, double before) {
		// TODO Auto-generated method stub
		VisiteWeb pageVisite = new VisiteWeb(listeVisiteWeb.size(), path, (int) (after - before));
		listeVisiteWeb.add(pageVisite);
		sortByUrl();
	}
	
	public int calculMaxStatUrl(String url){
		int max = -1;
		for (VisiteWeb v : listeVisiteWeb) {
			if (v.getChemin().equals(url)) {
				if (max == -1) {
					max = v.getTempsExecution();
				} else {
					max = Math.max(max, v.getTempsExecution());
				}
			}
		}
		return max;
	}
	
	public int calculMinStatUrl(String url){
		int min = -1;
		for (VisiteWeb v : listeVisiteWeb) {
			if (v.getChemin().equals(url)) {
				if (min == -1) {
					min = v.getTempsExecution();
				} else {
					min = Math.min(min, v.getTempsExecution());
				}
			}
		}
		return min;
	}
	
	public int calculNbVisitUrl(String url){
		int nbVisite = -1;
		for (VisiteWeb v : listeVisiteWeb) {
			if (v.getChemin().equals(url)) {
				if (nbVisite == -1) {
					nbVisite = 1;
				}
				else{
					nbVisite++;
				}
				
			}
		}
		return nbVisite;
	}
	
	public int calculMoyStatUrl(String url){
		int somme = -1;
		for (VisiteWeb v : listeVisiteWeb) {
			if (v.getChemin().equals(url)) {
				if (somme == -1) {
					somme = v.getTempsExecution();
				} else {
					somme += v.getTempsExecution();
				}
			}
		}
		return somme/calculNbVisitUrl(url);
	}
	
	public List<String> catchAllUrl(){
		List<String> res = new ArrayList<>();
		
		for(VisiteWeb v : listeVisiteWeb){
			if( !res.contains(v.getChemin()) ){
				res.add(v.getChemin());
			}
		}
		return res;
	}


}
