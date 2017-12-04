package com.formation.interfaces;

import javax.swing.JPanel;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Checkbox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Scrollbar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import com.formation.DAO.ClientDAOSQL;
import com.formation.model.Article;
import com.formation.model.Client;
import com.formation.utilitaires.ConnexionJDBC;
import com.formation.utilitaires.mesBoutons;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;

public class jpClientsModif extends JPanel {
	private JTextField textField_CodePostal;
	private JTextField textField_Ville;
	private JTextField textField_Adresse;
	private JTextField code;
	private JTextField textField_Prenom;
	private JTextField textField_Nom;
	private JTextField textField_Fixe;
	private JTextField textField_Mobile;
	private JTextField textField_Email;
	private JTextField textField_Remarques;
	private jfClients frame;

	/**
	 * Create the panel.
	 */
	public jpClientsModif(jfClients jfc) {
		
		ClientDAOSQL dao = new ClientDAOSQL(ConnexionJDBC.getInstance());
		
		this.frame=jfc;
		setMinimumSize(new Dimension(790, 590));
		setBackground(new Color(173, 216, 230));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Clients", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		code = new JTextField();
		code.setEnabled(false);
		code.setColumns(10);
		
		JLabel label_7 = new JLabel("Cr\u00E9\u00E9 le ");
		
		JCheckBox chckbxCarteDeFidlit = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		chckbxCarteDeFidlit.setBackground(new Color(173, 216, 230));
		
		JLabel label_6 = new JLabel("Code");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setEnabled(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(103)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(code, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addComponent(chckbxCarteDeFidlit)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(chckbxCarteDeFidlit))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBorder(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Etat civil", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Coordonn\u00E9es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(173, 216, 230));
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Remarques", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_3, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_2, 0, 0, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 783, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(286, Short.MAX_VALUE))
		);
		
		textField_Remarques = new JTextField();
		textField_Remarques.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_Remarques, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(textField_Remarques, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel label_2 = new JLabel("Fixe");
		
		JLabel label_3 = new JLabel("Mobile");
		
		JLabel lblEmail = new JLabel("Email");
		
		textField_Fixe = new JTextField();
		textField_Fixe.setColumns(10);
		
		textField_Mobile = new JTextField();
		textField_Mobile.setColumns(10);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(lblEmail))
					.addGap(28)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(textField_Fixe, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_Mobile, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(textField_Email, GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
					.addGap(19))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_Fixe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Mobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel label = new JLabel("Pr\u00E9nom");
		
		JLabel label_1 = new JLabel("Nom");
		
		textField_Prenom = new JTextField();
		textField_Prenom.setColumns(10);
		
		textField_Nom = new JTextField();
		textField_Nom.setColumns(10);
		
		JLabel label_8 = new JLabel("Adresse");
		
		textField_Adresse = new JTextField();
		textField_Adresse.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		
		textField_CodePostal = new JTextField();
		textField_CodePostal.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville");
		
		textField_Ville = new JTextField();
		textField_Ville.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCodePostal)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textField_CodePostal, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(190)
							.addComponent(lblVille)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_Ville))
						.addComponent(textField_Adresse)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textField_Prenom, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_Nom, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_Adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodePostal)
						.addComponent(textField_CodePostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVille)
						.addComponent(textField_Ville, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setFocusable(false);
		btnImprimer.setBorder(null);
		btnImprimer.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Printer-48-actif.png")));
		btnImprimer.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Printer-48.png")));
		btnImprimer.setContentAreaFilled(false);
		
		JButton btnExport = new JButton("Export");
		btnExport.setFocusable(false);
		btnExport.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Data-Export-48-actif.png")));
		btnExport.setBorder(null);
		btnExport.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Data-Export-48.png")));
		btnExport.setBorderPainted(false);
		btnExport.setContentAreaFilled(false);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				jpClients annule = new jpClients(jfc);
				mesBoutons annuler = new mesBoutons();
				annuler.setFenetre(frame);
			annuler.changerPanneau(annule, "Gestion des clients");
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setRolloverIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Cancel-48-actif.png")));
		btnNewButton_1.setIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Cancel-48.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setDefaultCapable(false);
		
		JButton btnAperu = new JButton("Aper\u00E7u");
		btnAperu.setFocusable(false);
		btnAperu.setBorder(null);
		btnAperu.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48-actif.png")));
		btnAperu.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48.png")));
		btnAperu.setContentAreaFilled(false);
		
		JButton btnClients = new JButton("Modification");
		btnClients.setFocusable(false);
		btnClients.setBorder(null);
		btnClients.setRolloverIcon(new ImageIcon(jpClientsModif.class.getResource("/Images/gestion/client/User-Modify-64.png")));
		btnClients.setBackground(new Color(127, 255, 212));
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClients.setContentAreaFilled(false);
		btnClients.setIcon(new ImageIcon(jpClientsModif.class.getResource("/Images/gestion/client/User-Modify-64.png")));
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.setFocusable(false);
		btnSauvegarder.setBorder(null);
		btnSauvegarder.setContentAreaFilled(false);
		btnSauvegarder.setRolloverIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Save-48-actif.png")));
		btnSauvegarder.setIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Save-48.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnSauvegarder)
							.addContainerGap(33, Short.MAX_VALUE))
						.addComponent(btnAperu, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnExport, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnClients, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnImprimer, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(7)
					.addComponent(btnClients)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSauvegarder)
					.addGap(114)
					.addComponent(btnAperu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(btnExport)
					.addGap(70)
					.addComponent(btnNewButton_1)
					.addContainerGap(261, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(groupLayout);
		
	//	--------------------------------------------------------Traitement métier-----------------------------------------------------------------
////		
//		btnSauvegarder.addActionListener(new ActionListener() {
//			
//			
//			Client cli = dao.SelectClient(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
//			int i = cli.getIdClient();
//			
//			public void actionPerformed(ActionEvent arg0) {
//				
//			cli = new Client(-1, textField_Nom.getText(), textField_Prenom.getText(), textField_Email.getText(), textField_Adresse.getText(), 
//					chckbxCarteDeFidlit.isSelected(), textField_Mobile.getText(), textField_Remarques.getText(), formattedTextField.getText(), 
//					code.getText());
//
//			if (dao.UpdateClient(cli, i)) {
//				JOptionPane.showMessageDialog(null, "Client correctement modifié.");
//				jpClients annule = new jpClients(jfc);
//				mesBoutons annuler = new mesBoutons();
//				annuler.setFenetre(frame);
//				annuler.changerPanneau(annule, "Gestion des clients");
//
//
//
//					} else {
//						JOptionPane.showMessageDialog(null,
//								"Problème de modification en base. Contactez l'équipe de développement.");
//					}
//			}
//			
//	});
	
}
}		
