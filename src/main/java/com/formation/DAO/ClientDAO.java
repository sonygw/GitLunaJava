package com.formation.DAO;

import java.util.ArrayList;

import com.formation.model.Client;

public interface ClientDAO {

	
	public Client SelectClient(int id);
	public ArrayList<Client> SelectAllClients();
	public boolean DeleteClient(Client obj);
	public boolean UpdateClient(Client obj, int id);
	public boolean CreateClient(Client obj);
	
}
