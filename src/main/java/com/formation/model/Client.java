package com.formation.model;

import java.sql.Date;

public class Client {
	
	private int idClient;
	private String nom;
	private String email;
	private String adresse;
	private boolean carteFidelite;
	private String numeroTelephone;
	private String remarques;
	private java.sql.Date date;
	
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}



	public Client(int idClient, String nom, String email, String adresse, boolean carteFidelite, String numeroTelephone,
			String remarques, Date date) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.carteFidelite = carteFidelite;
		this.numeroTelephone = numeroTelephone;
		this.remarques = remarques;
		this.date = date;
	}



	public int getIdClient() {
		return idClient;
	}



	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public boolean isCarteFidelite() {
		return carteFidelite;
	}



	public void setCarteFidelite(boolean carteFidelite) {
		this.carteFidelite = carteFidelite;
	}



	public String getNumeroTelephone() {
		return numeroTelephone;
	}



	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}



	public String getRemarques() {
		return remarques;
	}



	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}



	public java.sql.Date getDate() {
		return date;
	}



	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	
	

}