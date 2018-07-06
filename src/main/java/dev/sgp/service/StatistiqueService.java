package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class StatistiqueService {
	List<VisiteWeb> listeVisites = new ArrayList<>();
	public List<VisiteWeb> listerVisites() {
		return listeVisites;
	}
	public void sauvegarderVisiteWeb(VisiteWeb visite) {
		listeVisites.add(visite);
	}

}