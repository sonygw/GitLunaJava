package com.formation.DAO;

import java.util.ArrayList;

import com.formation.model.Commande;

public interface CommandeDAO {

	/**
	 * Selectionne toutes les commandes
	 * @return ArrayList de clients
	 */
	public ArrayList<Commande> SelectAllCommandes();
	/**
	 * Selectionne les Commandes d'un client
	 * @param idclient id du client
	 * @return
	 */
	public ArrayList<Commande> SelectCommandesClient(int idclient);
	/**
	 * Selectionne les commandes d'un articles
	 * @param id id de l'article
	 * @return
	 */
	public ArrayList<Commande> SelectCommandesArticles(int id);
	/**
	 * selectionne une commande gr�ce � son ID
	 * @param id id de la commande
	 * @return un objet Commande
	 */
	public Commande SelectCommande(int id);
	/**
	 * Selectionne la derni�re commande
	 * @return un objet commande
	 */
	public Commande SelectLastCommande();
	/**
	 * Cr�er une commande 
	 * @param commande Objet commande � cr�er
	 * @return un bool de v�rif. vrai = reussi
	 */
	public boolean CreateCommande(Commande commande);
	/**
	 * Update une commande gr�ce � son ID
	 * @param commande objet commande a inserer
	 * @param id id de la commande � modifier
	 * @return un bool de v�rif. vrai = reussi
	 */
	public boolean UpdateCommande(Commande commande, int id);
	/**
	 * Supprime la commande
	 * @param id id de la commande � supprimer
	 * @return un bool de v�rif. vrai = reussi
	 */
	public boolean DeleteCommande(int id);
	
}
