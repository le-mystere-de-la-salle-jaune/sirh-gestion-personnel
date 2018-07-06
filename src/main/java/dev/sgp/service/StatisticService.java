package dev.sgp.service;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import dev.sgp.entities.WebVisite;

public class StatisticService {

	private List<WebVisite> visitesList = new ArrayList<>();

	public HashMap<String, List<WebVisite>> getAllVisites(){

		HashMap<String, List<WebVisite>> returnMap = new HashMap<>();

		for(WebVisite wv : visitesList){
			if(!returnMap.containsKey(wv.getPath())){
				returnMap.put(wv.getPath(), new ArrayList<WebVisite>());
			}
			
			returnMap.get(wv.getPath()).add(wv);

		}

		return returnMap;
		//return visitesList;
	}

	public void addVisite(WebVisite visite){
		visitesList.add(visite);
	}


}
