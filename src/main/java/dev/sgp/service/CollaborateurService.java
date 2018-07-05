package dev.sgp.service;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	
	
	public CollaborateurService() {
		listeCollaborateurs.add(new Collaborateur("KACZMAREK", "Noel", LocalDate.of(2018, 7,5), "5 rue pasteur",
			"1 25 15 ...", "mail@mail.com", "img/photo.png", ZonedDateTime.now(), true));
	}

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}