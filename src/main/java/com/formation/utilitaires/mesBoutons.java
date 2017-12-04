package com.formation.utilitaires;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.formation.interfaces.jfClients;

public class mesBoutons extends JButton {
	
	private jfClients fenetre;

	public void setFenetre(jfClients jfClients) {
		this.fenetre= jfClients;
	}
	
	private jfClients getFenetre() {
		return fenetre;
	}
	
	public void changerPanneau(JPanel panneau, String titre) {
		fenetre.setContentPane(panneau);
		fenetre.setTitle(titre);
		fenetre.revalidate();
	}

	public jfClients getFenetre1() {
		return fenetre;
	}

	
}
