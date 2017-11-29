package com.formation.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.formation.model.ArtCom;

public class ArtComDAOSQL implements ArtComDAO {

	Connection conn = null;
	Statement state = null;

	public ArtComDAOSQL() {
		// TODO Auto-generated constructor stub
	}

	public ArtComDAOSQL(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public ArrayList<ArtCom> SelectAllArticleFromCommande(int idCommande) {
		ResultSet result = null;
		ArrayList<ArtCom> articles = new ArrayList<ArtCom>();

		ArtCom resultat = null;

		try {
			state = conn.createStatement();
			result = state.executeQuery("Select * from artCom where idCommande =" + idCommande);

			while (result.next()) {
				resultat = new ArtCom(result.getInt("idArtCom"), result.getInt("idCommande"),
						result.getInt("idArticle"), result.getInt("quantite"));
				articles.add(resultat);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return articles;
	}

	@Override
	public boolean DeleteArticleFromCommande(ArtCom obj) {

		boolean result = false;
		try {
			state = conn.createStatement();
			state.executeUpdate("Delete from artCom where idArtCom =" + obj.getIdArtCom());
			result = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean UpdateArticleFromCommande(ArtCom obj, int idArtCom) {

		boolean result = false;

		try {
			state = conn.createStatement();
			state.executeUpdate("Update artCom SET idCommande = " + obj.getIdArtCom() + ", idArticle = "
					+ obj.getIdArticle() + " where idArtCom = " + idArtCom);
			result = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean CreateArticleFromCommande(ArtCom obj) {
		boolean result = false;

		try {
			state = conn.createStatement();
			state.executeUpdate("insert into artCom values (null, " + obj.getIdCommande() + "," + obj.getIdArticle()
					+ "," + obj.getquantite() + ")");
			result = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
