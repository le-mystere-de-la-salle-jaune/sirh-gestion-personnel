package dev.sgp.util;

import dev.sgp.service.CollaborateurService;
import dev.sgp.service.VisiteWebService;

public interface Constantes {
	CollaborateurService COLLAB_SERVICE = new CollaborateurService();
	VisiteWebService VISITE_SERVICE = new VisiteWebService();
	Config CONF = new Config();
}
