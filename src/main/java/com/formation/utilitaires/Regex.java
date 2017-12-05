package com.formation.utilitaires;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
	/**
	 * Test du Code Postal à travers les expressions régulières
	 * @param CP code postal
	 * @return booléen qui est true si le code postal est mal écrit.
	 */
	public static boolean testCP(String CP) {
		String chaine = CP;
		boolean verif = false;
		if (chaine.length() != 5 )
		{verif = true;
			return verif;
		}
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher(chaine);
		while(m.find()) {
			verif =true;
			
		}
		
		return verif;
	}
	
	/**
	 * Test du numéro de téléphone à travers les expressions régulières
	 * @param num numéro de tél
	 * @return booléen qui est true si le numéro est mal écrit.
	 */
	public static boolean testNum(String num) {
		String chaine = num;
		boolean verif = false;
		if (chaine.length() != 10 )
		{verif = true;
			return verif;
		}
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher(chaine);
		while(m.find()) {
			verif =true;
			
		}
		
		return verif;
	}
}