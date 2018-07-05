package dev.sgp.service;

import java.util.List;

import dev.sgp.entite.Departement;

public class DepartementService {
	private List<Departement> departements;
	
	public DepartementService(){
		departements.add(new Departement(1, "Comptabilite"));
		departements.add(new Departement(2, "Ressources Humaines"));
		departements.add(new Departement(3, "Informatique"));
		departements.add(new Departement(4, "Administratif"));
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}
	
	public void addDepartement(Departement d){
		departements.add(d);
	}
}
