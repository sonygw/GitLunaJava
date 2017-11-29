package com.formation.model;

public class Article {

	
	private int idArticle;
	private String Nom;
	private String Description;
	private double PrixHT;
	private int Quantite;
	private String Categorie;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}

	public Article(int idArticle, String nom, String description, double prixHT, int quantite, String categorie) {
		super();
		this.idArticle = idArticle;
		Nom = nom;
		Description = description;
		PrixHT = prixHT;
		Quantite = quantite;
		Categorie = categorie;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrixHT() {
		return PrixHT;
	}

	public void setPrixHT(double prixHT) {
		PrixHT = prixHT;
	}

	public int getQuantite() {
		return Quantite;
	}

	public void setQuantite(int quantite) {
		Quantite = quantite;
	}

	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	
	
}
