package dev.sgp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {
	
	Map<String, Collaborateur> listeCollaborateurs = new HashMap<>();

	public List<Collaborateur> listerCollaborateurs() {
		return new ArrayList<>(listeCollaborateurs.values());
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		
		listeCollaborateurs.put(collab.getMatricule(), collab);
	}
	
	public Collaborateur creerCollaborateur(String nom, String prenom, LocalDate dateDeNaissance, String adresse, String numSecuSocial)
	{
		
		Collaborateur collab = new Collaborateur(nom,prenom,dateDeNaissance,adresse, numSecuSocial);
		String matricule = genererMatricule();
		collab.setMatricule(matricule);
		String emailPro = genererEmailPro(nom, prenom);
		collab.setEmailPro(emailPro);
		
		return collab;
	}
	
	
	
	public String genererMatricule()
	{
	boolean isOldMatricule  = false;
	String matricule = null;
	
		do
		{
			matricule = "M-";	
			matricule += RandomStringUtils.random(4,"ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
			
			isOldMatricule = listeCollaborateurs.get(matricule) != null;
			
			}while(isOldMatricule);
			
			return matricule;
	}
	
	public String genererEmailPro(String nom, String prenom)
	{
		String email = nom+"."+prenom+"@societe.com";
		return email;
	}
}