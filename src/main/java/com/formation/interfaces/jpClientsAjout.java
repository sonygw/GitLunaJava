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
import com.formation.model.Commande;
import com.formation.utilitaires.ConnexionJDBC;
import com.formation.utilitaires.mesBoutons;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;

public class jpClientsAjout extends JPanel {
	private JTextField TxtFiel_CodePostal;
	private JTextField TxtField_Ville;
	private JTextField TxtField_Adresse;
	private JTextField TxtField_code;
	private JTextField TxtField_Prenom;
	private JTextField TxtField_Nom;
	private JTextField textField_telephone;
	private JTextField textField_email;
	private JTextField textField_remarques;
	private jfClients frame;

	/**
	 * Create the panel.
	 */
	
	public jpClientsAjout(jfClients jfc) {
		
		ClientDAOSQL dao = new ClientDAOSQL(ConnexionJDBC.getInstance());
		
		this.frame = jfc;
		setMinimumSize(new Dimension(790, 590));
		setBackground(new Color(173, 216, 230));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Clients", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		TxtField_code = new JTextField();
		TxtField_code.setEnabled(false);
		TxtField_code.setColumns(10);
		
		JLabel label_7 = new JLabel("Cr\u00E9\u00E9 le ");
		
		JCheckBox chckbxCarteDeFidlit = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		chckbxCarteDeFidlit.setBackground(new Color(173, 216, 230));
		
		JLabel label_6 = new JLabel("Code");
		
		JFormattedTextField formattedTextField_date = new JFormattedTextField();
		formattedTextField_date.setEnabled(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(97)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(TxtField_code, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(formattedTextField_date, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(chckbxCarteDeFidlit)
					.addContainerGap(10, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(TxtField_code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(label_6))
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(label_7)
					.addComponent(chckbxCarteDeFidlit)
					.addComponent(formattedTextField_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
						.addComponent(panel_4, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_3, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
					.addContainerGap(37, Short.MAX_VALUE))
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
		
		textField_remarques = new JTextField();
		textField_remarques.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(textField_remarques, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(textField_remarques, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel lblTlphone = new JLabel("T\u00E9l.");
		
		JLabel lblEmail = new JLabel("Email");
		
		textField_telephone = new JTextField();
		textField_telephone.setColumns(10);
		
		textField_email = new JTextField();
		textField_email.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTlphone, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_telephone, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
						.addComponent(textField_email, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_telephone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTlphone))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel label = new JLabel("Pr\u00E9nom");
		
		JLabel label_1 = new JLabel("Nom");
		
		TxtField_Prenom = new JTextField();
		TxtField_Prenom.setColumns(10);
		
		TxtField_Nom = new JTextField();
		TxtField_Nom.setColumns(10);
		
		JLabel label_8 = new JLabel("Adresse");
		
		TxtField_Adresse = new JTextField();
		TxtField_Adresse.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		
		TxtFiel_CodePostal = new JTextField();
		TxtFiel_CodePostal.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville");
		
		TxtField_Ville = new JTextField();
		TxtField_Ville.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCodePostal)
						.addComponent(label)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(TxtField_Adresse)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(TxtFiel_CodePostal, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(190)
							.addComponent(lblVille)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(TxtField_Ville))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(TxtField_Prenom, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TxtField_Nom, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(TxtField_Prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TxtField_Nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(TxtField_Adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(TxtFiel_CodePostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVille)
						.addComponent(TxtField_Ville, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodePostal))
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
		// retour vers la fenêtre de gestion clients
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
		
		JButton btnClients = new JButton("Ajout");
		btnClients.setFocusable(false);
		btnClients.setBorder(null);
		btnClients.setRolloverIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/client/User-Add-64.png")));
		btnClients.setBackground(new Color(127, 255, 212));
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClients.setContentAreaFilled(false);
		btnClients.setIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/client/User-Add-64.png")));
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnSauvegarder.setFocusable(false);
		btnSauvegarder.setBorder(null);
		btnSauvegarder.setContentAreaFilled(false);
		btnSauvegarder.setRolloverIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Save-48-actif.png")));
		btnSauvegarder.setIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Save-48.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnSauvegarder)
							.addContainerGap(33, Short.MAX_VALUE))
						.addComponent(btnAperu, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
						.addComponent(btnImprimer, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnExport, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnClients, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addGap(70)
					.addComponent(btnNewButton_1)
					.addContainerGap(261, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(groupLayout);
		
	//	--------------------------------------------------------Traitement métier--------------------------------------------------------------
		
		String codecli = "CLIFRA" + (dao.SelectLastClient().getIdClient() + 1);
		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		TxtField_code.setText(codecli);
		formattedTextField_date.setText(date);
	
		// Ajout d'un client en base
		btnSauvegarder.addActionListener(new ActionListener() {
		
			Client cli = null;
			public void actionPerformed(ActionEvent arg0) {
				
			
						// Vérifie qu'aucun des champs du formulaire ne soit vide
				
					if (textField_email.getText().isEmpty() ||  textField_telephone.getText().isEmpty()||textField_remarques.getText().isEmpty()
							||TxtFiel_CodePostal.getText().isEmpty()||TxtField_Adresse.getText().isEmpty()||TxtField_code.getText().isEmpty()||
							TxtField_Nom.getText().isEmpty()||TxtField_Prenom.getText().isEmpty()||TxtField_Ville.getText().isEmpty() ||
							formattedTextField_date.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null,
								"Un des champs est vide. \nMerci de remplir le formulaire convenablement");
						
					} else {
						cli = new Client(-1, TxtField_Nom.getText(), TxtField_Prenom.getText(), textField_email.getText(), TxtField_Adresse.getText()+ " "+  TxtFiel_CodePostal.getText() + " "+ TxtField_Ville.getText(), 
								chckbxCarteDeFidlit.isSelected(), textField_telephone.getText(), textField_remarques.getText(), formattedTextField_date.getText(), TxtField_code.getText());
						cli.setCode(codecli);
						cli.setDate(date);
						if (dao.CreateClient(cli)) {
							JOptionPane.showMessageDialog(null, "Client correctement ajouté.");
							jpClients annule = new jpClients(jfc);
							mesBoutons annuler = new mesBoutons();
							annuler.setFenetre(frame);
						annuler.changerPanneau(annule, "Gestion des clients");
					}
					}
					

			}
			});
			
	}
}
