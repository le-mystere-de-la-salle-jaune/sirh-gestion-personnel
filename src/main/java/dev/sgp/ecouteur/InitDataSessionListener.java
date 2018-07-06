package dev.sgp.ecouteur;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebListener
public class InitDataSessionListener implements ServletContextListener {
	private static final CollaborateurService collaborateurService = Constantes.COLLAB_SERVICE;

	@Override
	public void contextInitialized(ServletContextEvent event) {
		collaborateurService.sauvegarderCollaborateur(new Collaborateur("M01", "Abitbol", "Georges", LocalDate.now(),
				"2 rue Test", "123456789AZERTY", "mondedemerde@classe.com", "photo", ZonedDateTime.now(), true));
		collaborateurService.sauvegarderCollaborateur(new Collaborateur("M02", "Cena", "John", LocalDate.now(),
				"West Newburry, MA", "161616161616160", "john.cena@wwe.com", "photo", ZonedDateTime.now(), true));
		collaborateurService.sauvegarderCollaborateur(new Collaborateur("M03", "Pouilly-Choisol de Rochambeau-Polony",
				"Jacques-Henri", LocalDate.now(), "Domaine Saint-Antoine de Cumont 24620", "999999995999999",
				"darksasuke666@caramail.be", "photo", ZonedDateTime.now(), true));

	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}
}
