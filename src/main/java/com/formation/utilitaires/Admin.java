package com.formation.utilitaires;

public class Admin {

	private static boolean admin;
	
	public Admin(boolean admin) {
		Admin.admin = admin;
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean isAdmin()
	{
		return admin;
	}
	
	
}
