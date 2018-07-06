package dev.sgp.service;

import java.util.List;
import java.util.ArrayList;

import dev.sgp.entities.WebVisite;

public class StatisticService {

	private List<WebVisite> visitesList = new ArrayList<>();
	
	public List<WebVisite> getAllVisites(){
		return visitesList;
	}
	
	public void addVisite(WebVisite visite){
		visitesList.add(visite);
	}
	
	
}
