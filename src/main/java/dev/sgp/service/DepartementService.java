package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entities.Departement;

public class DepartementService {
	List<Departement> listeDepartement = new ArrayList<>();

	public DepartementService(){
		listeDepartement.add(new Departement(0, "Comptabilite"));
		listeDepartement.add(new Departement(1, "Ressources Humaines"));
		listeDepartement.add(new Departement(2, "Informatique"));
		listeDepartement.add(new Departement(3, "Administratif"));
	}
	
	public List<Departement> listDepartements() {
		return listeDepartement;
	}
	public void saveDepartements(Departement dep) {
		listeDepartement.add(dep);
	}
}
