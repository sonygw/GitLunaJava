package com.formation.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.formation.model.ArtCom;

public interface ArtComDAO {

	public ArrayList<ArtCom> SelectAllArticleFromCommande(int idCommande);
	public boolean DeleteArticleFromCommande(ArtCom obj);
	public boolean UpdateArticleFromCommande(ArtCom obj, int idArtCom);
	public boolean CreateArticleFromCommande(ArtCom obj);
	
	
}
