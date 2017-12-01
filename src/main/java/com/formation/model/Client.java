package com.formation.model;

public class Client {
	
	private int idClient;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private boolean carteFidelite;
	private String numeroTelephone;
	private String remarques;
	private String date;
	
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Client(int idClient, String nom, String prenom, String email, String adresse, boolean carteFidelite, String numeroTelephone,
			String remarques, String date) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
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



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}
	
	

}
