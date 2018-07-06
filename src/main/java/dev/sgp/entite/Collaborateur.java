package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adresse;
	private String numSecu;
	private String mailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	
	public Collaborateur(){
		
	}
	
	public Collaborateur( String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numSecu, String mailPro, String photo, ZonedDateTime dateHeureCreation, boolean actif) {
		this.matricule = genereMatricule();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.mailPro = mailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	
	public String genereMatricule(){
		String str = "abcdefghijklmnopqrstuvwxyz0123456789";
		String matricule = "";
		
		while(matricule.length() < 5)
		{
			matricule += str.charAt((int) (Math.random() * ( str.length() - 1 )));
		}
		return matricule;
		
	}
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}
	public String getMailPro() {
		return mailPro;
	}
	public void setMailPro(String mailPro) {
		this.mailPro = mailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
	
}
