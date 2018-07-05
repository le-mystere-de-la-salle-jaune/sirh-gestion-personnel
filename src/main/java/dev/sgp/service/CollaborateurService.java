package dev.sgp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {
	
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		
		listeCollaborateurs.add(collab);
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
	
	public boolean matriculeExiste(String matricule)
	{
		for(Collaborateur c : listeCollaborateurs)
		{
			if(matricule.equals(c.getMatricule()));
			{
				return true;
			}
		}
		return false;
	}
	
	public String genererMatricule()
	{
		String random = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // Tu supprimes les lettres dont tu ne veux pas
		String matricule;
		do
		{
			matricule = "";
			
			for(int x=0;x<3;x++)
			{
				int i = (int)Math.floor(Math.random() * 62); // Si tu supprimes des lettres tu diminues ce nb
				matricule += random.charAt(i);
			}
		}while(matriculeExiste(matricule));
		return matricule;
	}
	
	public String genererEmailPro(String nom, String prenom)
	{
		String email = nom+"."+prenom+"@societe.com";
		return email;
	}
}