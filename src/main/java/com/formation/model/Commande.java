package com.formation.model;

public class Commande {

	private int idCommande;
	private double PrixHT;
	private String Adresse;
	private int idClient;
	private java.sql.Date Date;
	
	public Commande() {
		// TODO Auto-generated constructor stub
	}

	public Commande(int idCommande, double prixHT, String adresse, int idClient, java.sql.Date date) {
		super();
		this.idCommande = idCommande;
		PrixHT = prixHT;
		Adresse = adresse;
		this.idClient = idClient;
		Date = date;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public double getPrixHT() {
		return PrixHT;
	}

	public void setPrixHT(double prixHT) {
		PrixHT = prixHT;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public java.sql.Date getDate() {
		return Date;
	}

	public void setDate(java.sql.Date date) {
		Date = date;
	}
	
	
}
