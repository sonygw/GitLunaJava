package com.formation.DAO;

import java.util.ArrayList;

import com.formation.model.Article;

public interface ArticleDAO {

	
	public ArrayList<Article> SelectAllArticles();
	public Article SelectArticleById(int id);
	public boolean DeleteArticle(int id);
	public boolean UpdateArticle(Article obj, int id);
	public boolean CreateArticle(Article obj);
	public Article SelectLastArticle();
	
	
}
