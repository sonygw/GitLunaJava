package com.formation.utilitaires;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionJDBC {
	


		private String url = "jdbc:mysql://localhost:3306/lunajava";
		private String user = "root";
		private String passwd = "";
		
		private static Connection connect;
		
		/**
		 * Constructeur permettant d"instancier une nouvelle connexion avec le Driver JDBC
		 */
		private ConnexionJDBC() {
			try {
				connect = DriverManager.getConnection(url,user,passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/**
		 * Retourne un instance de connexion à travers un singleton. Méthode statique.
		 * @return un instance de Connexion
		 */
		public static Connection getInstance() {
			if (connect==null) {
				new ConnexionJDBC();
			}
			return connect;
		}


}
