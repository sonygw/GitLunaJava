package com.formation.main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
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