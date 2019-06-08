package dev.sgp.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entities.Collaborateur;
import dev.sgp.utils.ConfigReader;

public class CollaborateurService {
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	public CollaborateurService(){
		try {
			ConfigReader.loadConfig();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}
