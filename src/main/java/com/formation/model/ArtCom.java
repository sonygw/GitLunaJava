package com.formation.model;

public class ArtCom {
	
	private int idArtCom;
	private int idCommande;
	private int idArticle;
	private int Quantite;
	
	public ArtCom() {
		// TODO Auto-generated constructor stub
	}

	public ArtCom(int idArtCom, int idCommande, int idArticle, int quantite) {
		super();
		this.idArtCom = idArtCom;
		this.idCommande = idCommande;
		this.idArticle = idArticle;
		Quantite = quantite;
	}

	public int getIdArtCom() {
		return idArtCom;
	}

	public void setIdArtCom(int idArtCom) {
		this.idArtCom = idArtCom;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getQuantite() {
		return Quantite;
	}

	public void setQuantite(int quantite) {
		Quantite = quantite;
	}
	
	

}
