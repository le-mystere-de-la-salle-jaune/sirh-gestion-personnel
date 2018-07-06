package dev.sgp.service;
public class VisiteWeb {
	private int id;
	private String chemin;
	private int tempsExecution;
	
	public VisiteWeb(int monId,String url,int tempsVisite){
		this.id = monId;
		this.chemin = url;
		this.tempsExecution = tempsVisite;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the chemin
	 */
	public String getChemin() {
		return chemin;
	}

	/**
	 * @param chemin the chemin to set
	 */
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	/**
	 * @return the tempsExecution
	 */
	public int getTempsExecution() {
		return tempsExecution;
	}

	/**
	 * @param tempsExecution the tempsExecution to set
	 */
	public void setTempsExecution(int tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
	
	
	
}
