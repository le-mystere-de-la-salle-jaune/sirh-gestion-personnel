package dev.sgp.web;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;


@WebListener
public class InitializerListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		CollaborateurService collabService =  Constantes.COLLAB_SERVICE;
		collabService.sauvegarderCollaborateur(new Collaborateur("Torres", "Corentin", LocalDate.of(2017, 1, 14), "29 rue du lila", "25155354646989724627"));
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}