package dev.sgp.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numSecuSociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;
	
	
	public Collaborateur(String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numSecuSociale) {
		this.matricule = "M"+Math.floor(Math.random()*10000);
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecuSociale = numSecuSociale;
		this.emailPro = prenom+"."+nom+"@societe.com";
		this.photo = "https://cours-informatique-gratuit.fr/wp-content/uploads/2014/05/fichier.png";
		this.dateHeureCreation = ZonedDateTime.now();
		this.actif = true;
	}


	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}


	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}


	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the numSecuSociale
	 */
	public String getNumSecuSociale() {
		return numSecuSociale;
	}


	/**
	 * @param numSecuSociale the numSecuSociale to set
	 */
	public void setNumSecuSociale(String numSecuSociale) {
		this.numSecuSociale = numSecuSociale;
	}


	/**
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}


	/**
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}


	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}


	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}


	/**
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}


	/**
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}


	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}


	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	
	
	
	

}
