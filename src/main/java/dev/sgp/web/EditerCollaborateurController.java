package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
	
		if(req.getParameter("matricule")!=null){
		// recupere la valeur d'un parametre dont le nom est matricule
				String matriculeParam = req.getParameter("matricule");
				resp.setContentType("text/html");
				// code HTML ecrit dans le corps de la reponse
				resp.getWriter().write("<h1>Matricule :"+matriculeParam+"</h1>");
		}else{
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");
		}
	
	}
	
}





