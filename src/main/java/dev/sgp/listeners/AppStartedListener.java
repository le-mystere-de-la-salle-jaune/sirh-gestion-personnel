package dev.sgp.listeners;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dev.sgp.entities.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebListener
public class AppStartedListener implements HttpSessionListener{

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();

		collaborateurs.add(new Collaborateur("Dupont", "Jean",
				LocalDate.of(1895, 8, 25), 
				"15 bd de la valsseuse", "2514587965487512",
				"/resources/images/avatar/jean.png", true));
		
		collaborateurs.add(new Collaborateur("Robert", "Kevin",
				LocalDate.of(2001, 1, 17), 
				"60 rue de la paix", "5478458965125",
				"/resources/images/avatar/kevin.png", true));

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub

	}

}
