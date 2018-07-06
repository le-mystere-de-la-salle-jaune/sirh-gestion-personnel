package dev.sgp.ecouteur;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebListener
public class InitDataSessionListener implements HttpSessionListener {
	private static final CollaborateurService collaborateurService = Constantes.COLLAB_SERVICE;

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		collaborateurService.sauvegarderCollaborateur(new Collaborateur("M01", "Abitbol", "Georges", LocalDate.now(),
				"2 rue Test", "123456789AZERTY", "mondedemerde@classe.com", "photo", ZonedDateTime.now(), true));
		collaborateurService.sauvegarderCollaborateur(new Collaborateur("M02", "Cena", "John", LocalDate.now(),
				"West Newburry, MA", "161616161616160", "john.cena@wwe.com", "photo", ZonedDateTime.now(), true));
		collaborateurService.sauvegarderCollaborateur(new Collaborateur("M03", "Pouilly-Choisol de Rochambeau-Polony",
				"Jacques-Henri", LocalDate.now(), "Domaine Saint-Antoine de Cumont 24620", "999999995999999",
				"darksasuke666@caramail.be", "photo", ZonedDateTime.now(), true));
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
	}

}
