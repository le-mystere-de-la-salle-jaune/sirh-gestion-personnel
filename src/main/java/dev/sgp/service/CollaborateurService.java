package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {
	private List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	public List<Collaborateur> getListCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public List<String> listerCollaborateurs() {
		List<String> noms = new ArrayList<>();
		
		for(Collaborateur collab : listeCollaborateurs) {
			noms.add(collab.getNom());
		}
		return noms;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}