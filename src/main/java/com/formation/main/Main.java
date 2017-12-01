/**
 * 
 */
package com.formation.main;

import java.util.ArrayList;

import com.formation.DAO.ArticleDAOSQL;
import com.formation.DAO.CommandeDAOSQL;
import com.formation.model.Article;
import com.formation.model.Commande;
import com.formation.utilitaires.ConnexionJDBC;

/**
 * @author SDJ09
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArticleDAOSQL test = new ArticleDAOSQL(ConnexionJDBC.getInstance());
		
		boolean b = test.DeleteArticle(9);
		System.out.println(b);
		
		
		//for(int i = 0 ; i < art.size(); i++)
		//	System.out.println(art.get(i).getIdArticle() + " / " + art.get(i).getPrixHT());
			
		// System.out.println(art.getCategorie() + "/" + art.getNom() + "/" + art.getDescription() + "/" +
		// art.getPrixHT() + "/" + art.getQuantite());
	}

}
