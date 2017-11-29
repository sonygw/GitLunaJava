package com.formation.DAO;

import java.util.ArrayList;

import com.formation.model.ArtCom;

public class ArticleDAOSQL implements ArticleDAO, ArtComDAO {

	@Override
	public ArrayList<ArtCom> SelectAllArticleFromCommande(int idCommande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DeleteArticleFromCommande(ArtCom obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateArticleFromCommande(ArtCom obj, int idArtCom) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CreateArticleFromCommande(ArtCom obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
