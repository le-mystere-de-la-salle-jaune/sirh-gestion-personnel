package dev.sgp.entite;

import java.util.HashMap;
import java.util.Map;

public class Statistique 
{
	private String chemin;
	private long temps;
	
	public Statistique() {
		// TODO Auto-generated constructor stub
	}
	
	public Statistique(String chemin, long temps)
	{
		this.chemin = chemin;
		this.temps = temps;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public long getTemps() {
		return temps;
	}

	public void setTemps(Integer temps) {
		this.temps = temps;
	}
	
	
}
