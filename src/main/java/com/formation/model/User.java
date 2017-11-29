package com.formation.model;

public class User {
	
	private int idUser;
	private String Nom;
	private String Login;
	private String MotDePasse;
	private boolean Admin;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int idUser, String nom, String login, String motDePasse, boolean admin) {
		super();
		this.idUser = idUser;
		Nom = nom;
		Login = login;
		MotDePasse = motDePasse;
		Admin = admin;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getMotDePasse() {
		return MotDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		MotDePasse = motDePasse;
	}

	public boolean isAdmin() {
		return Admin;
	}

	public void setAdmin(boolean admin) {
		Admin = admin;
	}
	
	

}
