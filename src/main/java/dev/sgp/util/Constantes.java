package dev.sgp.util;

import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.service.StatisticService;
import dev.sgp.utils.ConfigReader;

public interface Constantes {
	CollaborateurService COLLAB_SERVICE = new CollaborateurService();
	DepartementService DEP_SERVICE = new DepartementService();
	StatisticService STATISTIC_SERVICE = new StatisticService();
}
