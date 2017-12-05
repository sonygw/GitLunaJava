package com.formation.main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
	public static void testCP(String CP) {
		String chaine = "1a1b1e2d";
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher(chaine);
		while(m.find()) {
			System.out.println(m.group());
			
		}
	}
}