package com.formation.utilitaires;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionJDBC {
	


		
		private String url = "jdbc:mysql://localhost:3306/lunajava";
		private String user = "root";
		private String passwd = "";
		
		private static Connection connect;
		
		private ConnexionJDBC() {
			try {
				connect = DriverManager.getConnection(url,user,passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getInstance() {
			if (connect==null) {
				new ConnexionJDBC();
			}
			return connect;
		}


}
