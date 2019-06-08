package dev.sgp.entities;

public class Departement {
	private int id;
	private String designation;
	
	public Departement(int id, String designation){
		this.id = id;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
