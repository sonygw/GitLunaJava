package com.formation.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.formation.model.Article;

public class ArticleDAOSQL implements ArticleDAO {

	Connection conn = null;
	Statement state = null;

	public ArticleDAOSQL() {
		// TODO Auto-generated constructor stub
	}

	public ArticleDAOSQL(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public ArrayList<Article> SelectAllArticles() {

		ResultSet result = null;
		ArrayList<Article> articles = new ArrayList<Article>();

		Article resultat = null;

		try {
			state = conn.createStatement();
			result = state.executeQuery("Select * from article");

			while (result.next()) {
				resultat = new Article(result.getInt("idArticle"), result.getString("nom"),
						result.getString("description"), result.getDouble("prixHT"), result.getInt("quantite"),
						result.getString("categorie"));
				articles.add(resultat);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return articles;

	}

	@Override
	public Article SelectArticleById(int id) {

		ResultSet result = null;
		Article article = null;

		try {
			state = conn.createStatement();
			result = state.executeQuery("Select * from article where idArticle = " + id);
			result.next();
			article = new Article(result.getInt("idArticle"), result.getString("nom"), result.getString("description"),
					result.getDouble("prixHT"), result.getInt("quantite"), result.getString("categorie"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return article;
	}

	@Override
	public boolean DeleteArticle(int id) {
		boolean result = false;
		try {
			state = conn.createStatement();
			state.executeUpdate("Delete from article where idArticle =" + id);
			result = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean UpdateArticle(Article obj, int id) {
		boolean result = false;

		try {
			state = conn.createStatement();
			
			String str = "Update article SET nom = '" + obj.getNom() + "', description = '" + obj.getDescription()
					+ "', prixHT = " + obj.getPrixHT() + ", quantite = " + obj.getQuantite() + ", categorie = '"
					+ obj.getCategorie() + "' where idArticle = " + id;
			state.executeUpdate(str);
			result = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean CreateArticle(Article obj) {
		boolean result = false;

		try {
			state = conn.createStatement();
			state.executeUpdate("INSERT INTO article VALUES (null, '" +  obj.getNom() + "','" + obj.getDescription()
		+ "'," + obj.getPrixHT() + "," + obj.getQuantite() + ",'"
		+ obj.getCategorie()+"')");
			result=true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
