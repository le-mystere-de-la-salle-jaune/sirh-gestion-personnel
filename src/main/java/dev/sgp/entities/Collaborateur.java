package dev.sgp.entities;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String lastName;
	private String firstName;
	private LocalDate birthDate;
	private String address;
	private String socialSecurityNumber;
	private String professionalEmail;
	private String picture;
	private ZonedDateTime creationTimeDate;
	private boolean active;
	
	public Collaborateur(String lastName, String firstName, LocalDate birthDate, String address,
			String socialSecurityNumber, String professionalEmail, String picture, boolean active) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.address = address;
		this.socialSecurityNumber = socialSecurityNumber;
		this.professionalEmail = professionalEmail;
		this.picture = picture;
		this.creationTimeDate = ZonedDateTime.now();
		this.active = active;
		this.matricule = genMatricule();
	}
	
	private String genMatricule(){
		return (firstName.charAt(0)+lastName.substring(0, 2)).toUpperCase();
	}
	
	public String getFirstName(){
		return firstName;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getProfessionalEmail() {
		return professionalEmail;
	}

	public void setProfessionalEmail(String professionalEmail) {
		this.professionalEmail = professionalEmail;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public ZonedDateTime getCreationTimeDate() {
		return creationTimeDate;
	}

	public void setCreationTimeDate(ZonedDateTime creationTimeDate) {
		this.creationTimeDate = creationTimeDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
