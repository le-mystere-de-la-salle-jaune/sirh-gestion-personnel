package dev.sgp.listener;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebListener
public class CompteurSessionListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// recuperation du service
				CollaborateurService collabService = Constantes.COLLAB_SERVICE;
				
				// sauvegarder un nouveau collaborateur
				collabService.sauvegarderCollaborateur(new Collaborateur(UUID.randomUUID(), "Dupont", "Pierre", LocalDate.parse("1955-12-25"), "12 rue de Paris", "1234567891254", "dupont.pierre@societe.com", "photo", ZonedDateTime.now(ZoneId.of("Europe/Paris")), true));
				collabService.sauvegarderCollaborateur(new Collaborateur(UUID.randomUUID(), "Poitou", "Marine", LocalDate.parse("1995-04-05"), "15 rue de la Mairie", "5894567891635", "poitou.marine@societe.com", "photo", ZonedDateTime.now(ZoneId.of("Europe/Paris")), true));        
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}




}
