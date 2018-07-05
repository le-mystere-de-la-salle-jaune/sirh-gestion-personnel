package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String matricule = req.getParameter("matricule");
		
		if(matricule == null)
		{
			resp.setStatus(400);
			resp.getWriter().write("un matricule est attendu");
			
		}
		else
		{
			resp.setContentType("text/html");
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition de collaborateur</h1> </br> <h4>Matricule : "+matricule+"</h4>");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		List<String> listNomParam = new ArrayList<String>();
		listNomParam.add("Matricule");
		listNomParam.add("Titre");
		listNomParam.add("Nom");
		listNomParam.add("Prenom");
		
		List<String> listParam = new ArrayList<String>();
		listParam.add(matricule);
		listParam.add(titre);
		listParam.add(nom);
		listParam.add(prenom);
		
		List<Integer> listCount = new ArrayList<Integer>();
		
		boolean isNull = false;
		Integer count = 0;
		
		for(String s : listParam)
		{
			if(s == null)
			{
				isNull = true;
				listCount.add(count);
				count += 1;
			}
		}
		
		if(isNull == true)
		{
			resp.setStatus(400);
			resp.setContentType("text/html");
			resp.getWriter().write("Les paramètres suivants sont incorrectes :");
			for(Integer i : listCount)
			{
				resp.getWriter().write("<br/>"+listNomParam.get(i));
			}
			
		}
		else
		{
			resp.setStatus(201);
			resp.setContentType("text/html");
			resp.getWriter().write("Création d'un collaborateur avec les informations suivantes :"
									+ "<br/>Matricule : "+matricule
									+ "<br/>Titre : "+titre
									+ "<br/>Nom : "+nom
									+ "<br/>Prénom : "+prenom);
		}
		
	}
	
	

}
