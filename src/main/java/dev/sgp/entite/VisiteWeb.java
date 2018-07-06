package dev.sgp.entite;

public class VisiteWeb {
	
	private Integer id;
	public static int currentId =+ 1;
	private String chemin;
	private Integer tempsExecution;
	
	
	
	public VisiteWeb() {
		super();
	}

	

	public VisiteWeb(String chemin, Integer tempsExecution) {
		VisiteWeb.currentId =+ 1;
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}


	public VisiteWeb(Integer id, String chemin, Integer tempsExecution) {
		this.id = id;
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}



	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	public Integer getTempsExecution() {
		return tempsExecution;
	}


	/**
	 * @param tempsExecution the tempsExecution to set
	 */
	public void setTempsExecution(Integer tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
	
	
	

}
