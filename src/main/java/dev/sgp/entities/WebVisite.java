package dev.sgp.entities;

public class WebVisite {
	private int id;
	private String path;
	private int executionTime;
	
	private static int counter = 0;
	
	
	public WebVisite(String path, int executionTime) {
		super();
		this.id = counter;
		this.path = path;
		this.executionTime = executionTime;
		
		++counter;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}
	
	
}
