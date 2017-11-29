package com.formation.model;

public class Client {
	
	private int idClient;
	private String Nom;
	private String Email;
	private String Adresse;
	private boolean CarteFidelite;
	private String NumeroTelephone;
	private String Remarques;
	private java.sql.Date Date;
	
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(int idClient, String nom, String email, String adresse, boolean carteFidelite, String numeroTelephone,
			String remarques, java.sql.Date date) {
		super();
		this.idClient = idClient;
		Nom = nom;
		Email = email;
		Adresse = adresse;
		CarteFidelite = carteFidelite;
		NumeroTelephone = numeroTelephone;
		Remarques = remarques;
		Date = date;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public boolean isCarteFidelite() {
		return CarteFidelite;
	}
	public void setCarteFidelite(boolean carteFidelite) {
		CarteFidelite = carteFidelite;
	}
	public String getNumeroTelephone() {
		return NumeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		NumeroTelephone = numeroTelephone;
	}
	public String getRemarques() {
		return Remarques;
	}
	public void setRemarques(String remarques) {
		Remarques = remarques;
	}
	public java.sql.Date getDate() {
		return Date;
	}
	public void setDate(java.sql.Date date) {
		Date = date;
	}
	
	
	

}
