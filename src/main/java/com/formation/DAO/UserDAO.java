package com.formation.DAO;

import java.sql.Connection;
import java.sql.ResultSet;

import com.formation.model.User;

public interface UserDAO {

	public User SelectUser(Connection con, int id);
	public ResultSet SelectAllUsers(Connection con);
	public boolean UpdateUser(Connection con, int id);
	public boolean CreateUser(Connection con);
	public boolean DeleteUser(Connection con, int id);
	
}
