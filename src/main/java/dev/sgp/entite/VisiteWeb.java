package dev.sgp.entite;

public class VisiteWeb {
	
	private Integer id;
	private String chemin;
	private Long tempsExecution;
	
	
	
	public VisiteWeb() {
		super();
	}

	

	public VisiteWeb(String chemin, Long tempsExecution) {
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}


	public VisiteWeb(Integer id, String chemin, Long tempsExecution) {
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
	public Long getTempsExecution() {
		return tempsExecution;
	}


	/**
	 * @param tempsExecution the tempsExecution to set
	 */
	public void setTempsExecution(Long tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
	
	
	

}
