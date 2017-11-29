package com.formation.DAO;

import java.sql.Connection;
import java.sql.ResultSet;

import com.formation.model.User;

public class UserDAOSQL implements UserDAO {

	@Override
	public User SelectUser(Connection con, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet SelectAllUsers(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UpdateUser(Connection con, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CreateUser(Connection con) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteUser(Connection con, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
