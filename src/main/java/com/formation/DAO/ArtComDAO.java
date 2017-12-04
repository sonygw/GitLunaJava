package com.formation.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.formation.model.ArtCom;

public interface ArtComDAO {

	public ArrayList<ArtCom> SelectAllArtComFromCommande(int idCommande);
	public boolean DeleteArtComFromCommande(ArtCom obj);
	public boolean UpdateArtComFromCommande(ArtCom obj, int idArtCom);
	public boolean CreateArtComFromCommande(ArtCom obj);
	public boolean DeleteArtComFromIdCommande(int id);
	public boolean DeleteArtComFromIdArticle(int id);
}
