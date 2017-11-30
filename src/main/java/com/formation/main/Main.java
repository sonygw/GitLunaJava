/**
 * 
 */
package com.formation.main;

import java.util.ArrayList;

import com.formation.DAO.CommandeDAOSQL;
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

		CommandeDAOSQL test = new CommandeDAOSQL(ConnexionJDBC.getInstance());
		
		ArrayList<Commande> cmd = test.SelectAllCommandes();
		
		
		for(int i = 0 ; i < cmd.size(); i++)
			System.out.println(cmd.get(i).getIdCommande() + " / " + cmd.get(i).getPrixHT());
			
		
	}

}
