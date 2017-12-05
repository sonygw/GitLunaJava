package com.formation.utilitaires;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
	/**
	 * Test du Code Postal � travers les expressions r�guli�res
	 * @param CP code postal
	 * @return bool�en qui est true si le code postal est mal �crit.
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
	 * Test du num�ro de t�l�phone � travers les expressions r�guli�res
	 * @param num num�ro de t�l
	 * @return bool�en qui est true si le num�ro est mal �crit.
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