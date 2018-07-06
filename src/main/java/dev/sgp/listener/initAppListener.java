package dev.sgp.listener;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebListener
public class initAppListener implements ServletContextListener{

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		collabService.sauvegarderCollaborateur(new Collaborateur("KACZMAREK", "Noel", LocalDate.of(2018, 7,5), "5 rue pasteur",
				"1 25 15 ...", "mail@mail.com", "img/photo.png", ZonedDateTime.now(), true));
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
	
}
