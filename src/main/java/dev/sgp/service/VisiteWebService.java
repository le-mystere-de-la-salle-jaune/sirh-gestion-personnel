package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {
	List<VisiteWeb> listeVisitesWeb = new ArrayList<>();
	
	public List<VisiteWeb> listerVisitesWeb() {
		return listeVisitesWeb;
	}
	
	public void sauvegarderCollaborateur(VisiteWeb visiteWeb) {
		listeVisitesWeb.add(visiteWeb);
	}
}
