package com.formation.DAO;

import java.util.ArrayList;

import com.formation.model.Commande;

public interface CommandeDAO {

	public ArrayList<Commande> SelectAllCommandes();
	public ArrayList<Commande> SelectClientCommandes(int idclient);
	public ArrayList<Commande> SelectCommandesArticles(int id);
	public Commande SelectCommande(int id);
	public boolean CreateCommande(Commande commande);
	public boolean UpdateCommande(Commande commande, int id);
	public boolean DeleteCommande(int id);
	
}
