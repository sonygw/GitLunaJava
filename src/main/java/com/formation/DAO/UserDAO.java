package com.formation.DAO;

import java.util.ArrayList;

import com.formation.model.User;

public interface UserDAO {

	public User SelectUser(int id);
	public ArrayList<User> SelectAllUsers();
	public boolean UpdateUser(User user, int id);
	public boolean CreateUser(User user);
	public boolean DeleteUser(int id);
	
}
