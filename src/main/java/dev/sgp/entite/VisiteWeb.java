package dev.sgp.entite;

import java.util.concurrent.atomic.AtomicInteger;

public class VisiteWeb {
	private static final AtomicInteger count = new AtomicInteger(0);
	
	private Integer id;
	private String chemin;
	private Integer tempsExecution;
	
	public VisiteWeb(String chemin, Integer tempsExecution) {
		super();
		this.id = count.incrementAndGet();
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
	 * @param id
	 *            the id to set
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
	 * @param chemin
	 *            the chemin to set
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
	 * @param tempsExecution
	 *            the tempsExecution to set
	 */
	public void setTempsExecution(Integer tempsExecution) {
		this.tempsExecution = tempsExecution;
	}

}
