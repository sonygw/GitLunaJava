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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

import com.formation.DAO.ArticleDAOSQL;
import com.formation.DAO.ClientDAOSQL;
import com.formation.model.Article;
import com.formation.model.Client;
import com.formation.utilitaires.ConnexionJDBC;
import com.formation.utilitaires.mesBoutons;

import javax.swing.AbstractAction;
import javax.swing.Action;

public class jpClients extends JPanel {
	private JTable table;
	private jfClients frame;
	private JTextField textField_code;
	private JTextField textField_date;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_adresse;
	private JTextField textField_fixe;
	private JTextField textField_mobile;
	private JTextField textField_email;
	private JTextField textField_remarques;


	/**
	 * Create the panel.
	 */

	
	
	@SuppressWarnings("serial")
	public jpClients(jfClients jfc) {
		
		ClientDAOSQL dao = new ClientDAOSQL(ConnexionJDBC.getInstance());
		
		setMinimumSize(new Dimension(790, 590));
		setBackground(new Color(173, 216, 230));
		
		this.frame = jfc;
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBorder(null);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 605, Short.MAX_VALUE)
		);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Code");
		label.setBounds(11, 11, 47, 14);
		panel.add(label);
		
		textField_code = new JTextField();
		textField_code.setEnabled(false);
		textField_code.setColumns(10);
		textField_code.setBounds(68, 8, 116, 20);
		panel.add(textField_code);
		
		JLabel label_1 = new JLabel("Cr\u00E9\u00E9 le ");
		label_1.setBounds(202, 11, 60, 14);
		panel.add(label_1);
		
		textField_date = new JTextField();
		textField_date.setEnabled(false);
		textField_date.setColumns(10);
		textField_date.setBounds(258, 8, 130, 20);
		panel.add(textField_date);
		
		JCheckBox checkBox = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		checkBox.setEnabled(false);
		checkBox.setBounds(451, 7, 156, 23);
		panel.add(checkBox);
		
		textField_nom = new JTextField();
		textField_nom.setEnabled(false);
		textField_nom.setColumns(10);
		textField_nom.setBounds(407, 37, 200, 20);
		panel.add(textField_nom);
		
		JLabel label_2 = new JLabel("Nom");
		label_2.setBounds(350, 40, 47, 14);
		panel.add(label_2);
		
		textField_prenom = new JTextField();
		textField_prenom.setEnabled(false);
		textField_prenom.setColumns(10);
		textField_prenom.setBounds(68, 34, 188, 20);
		panel.add(textField_prenom);
		
		JLabel label_3 = new JLabel("Pr\u00E9nom");
		label_3.setBounds(11, 40, 53, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Adresse");
		label_4.setBounds(11, 68, 53, 14);
		panel.add(label_4);
		
		textField_adresse = new JTextField();
		textField_adresse.setEnabled(false);
		textField_adresse.setColumns(10);
		textField_adresse.setBounds(68, 65, 539, 20);
		panel.add(textField_adresse);
		
		JLabel label_5 = new JLabel("Fixe");
		label_5.setBounds(11, 99, 47, 14);
		panel.add(label_5);
		
		textField_fixe = new JTextField();
		textField_fixe.setEnabled(false);
		textField_fixe.setColumns(10);
		textField_fixe.setBounds(68, 96, 194, 20);
		panel.add(textField_fixe);
		
		JLabel label_6 = new JLabel("Mobile");
		label_6.setBounds(350, 99, 54, 14);
		panel.add(label_6);
		
		textField_mobile = new JTextField();
		textField_mobile.setEnabled(false);
		textField_mobile.setColumns(10);
		textField_mobile.setBounds(409, 96, 198, 20);
		panel.add(textField_mobile);
		
		textField_email = new JTextField();
		textField_email.setEnabled(false);
		textField_email.setColumns(10);
		textField_email.setBounds(68, 127, 539, 20);
		panel.add(textField_email);
		
		JLabel label_7 = new JLabel("Email");
		label_7.setBounds(11, 130, 47, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Remarques");
		label_8.setBounds(10, 189, 64, 14);
		panel.add(label_8);
		
		textField_remarques = new JTextField();
		textField_remarques.setEnabled(false);
		textField_remarques.setColumns(10);
		textField_remarques.setBounds(68, 165, 539, 63);
		panel.add(textField_remarques);
		
		JButton btnNewButton = new JButton("Rechercher");
	
		btnNewButton.setFocusable(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Search-32-actif.png")));
		btnNewButton.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Search-48.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpClientsRecherche rechercher = new jpClientsRecherche(jfc);
				mesBoutons recherche = new mesBoutons();
				recherche.setFenetre(frame);
			recherche.changerPanneau(rechercher, "Recherche de clients");
			}
		});
		
		JButton btnAfficher = new JButton("Ajouter");
		
		btnAfficher.setFocusable(false);
		btnAfficher.setBorder(null);
		btnAfficher.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Add-New-48-actif.png")));
		btnAfficher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAfficher.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Add-New-48-actif.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAfficher.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Add-New-48-actif.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				jpClientsAjout ajouter = new jpClientsAjout(jfc);
				mesBoutons ajout = new mesBoutons();
				ajout.setFenetre(frame);
			ajout.changerPanneau(ajouter, "Ajout des clients");
			}
		});
		btnAfficher.setMinimumSize(new Dimension(56, 11));
		btnAfficher.setMaximumSize(new Dimension(68, 20));
		btnAfficher.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Add-New-48.png")));
		btnAfficher.setContentAreaFilled(false);
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jpClientsModif modifier = new jpClientsModif(jfc);
				mesBoutons modification = new mesBoutons();
				modification.setFenetre(frame);
			modification.changerPanneau(modifier, "Modification des clients");
			}
		});
		
		btnModifier.setFocusable(false);
		btnModifier.setBorder(null);
		btnModifier.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Data-Edit-48-actif.png")));
		btnModifier.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Data-Edit-48.png")));
		btnModifier.setContentAreaFilled(false);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		btnSupprimer.setFocusable(false);
		btnSupprimer.setBorder(null);
		btnSupprimer.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Garbage-Open-48-actif.png")));
		btnSupprimer.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Garbage-Open-48.png")));
		btnSupprimer.setContentAreaFilled(false);
		
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
		
		JButton btnNewButton_1 = new JButton("Accueil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jfc.dispose();
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Home-48-actif.png")));
		btnNewButton_1.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Home-48.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setDefaultCapable(false);
		
		JButton btnAperu = new JButton("Aper\u00E7u");
		btnAperu.setFocusable(false);
		btnAperu.setBorder(null);
		btnAperu.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48-actif.png")));
		btnAperu.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48.png")));
		btnAperu.setContentAreaFilled(false);
		
		JButton btnClients = new JButton("CLIENTS");
		btnClients.setFocusable(false);
		btnClients.setBorder(null);
		btnClients.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/client/People-64-actif.png")));
		btnClients.setBackground(new Color(127, 255, 212));
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClients.setContentAreaFilled(false);
		btnClients.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/client/People-64-actif.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAfficher, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnModifier, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(btnSupprimer, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
				.addComponent(btnAperu, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
				.addComponent(btnImprimer, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnClients, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnExport, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnClients)
					.addGap(11)
					.addComponent(btnAfficher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSupprimer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAperu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(37))
		);
		panel_1.setLayout(gl_panel_1);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		Object[][] tableData = null;

		DefaultTableModel tblModel = new DefaultTableModel(tableData,
				new String[] { "id", "Code", "Nom", "Prénom", "Carte de fidélité", "Date de création" }) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// all cells false
				return false;
			}
		};
		
		
		table.getTableHeader().setReorderingAllowed(false);
		table.setModel(tblModel);
		table.getColumn("id").setMinWidth(0);
		table.getColumn("id").setMaxWidth(0);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
		
		
		
	//	-------------------------------------------------Traitement métier----------------------------------------------------------------------
		
		ArrayList<Client> list = new ArrayList<Client>();

		list = dao.SelectAllClients();
		int o = 0;
		for (Client c : list) {

			tblModel.addRow(tableData);
			table.setValueAt(c.getIdClient(), o, 0);
			table.setValueAt(c.getCode(), o, 1);
			table.setValueAt(c.getNom(), o, 2);
			table.setValueAt(c.getPrenom(), o, 3);
			table.setValueAt(c.fidel(), o, 4);
			table.setValueAt(c.getDate(), o, 5);

			o++;

		}
		
		// Quand on clique sur une ligne, les TxtField se remplissent
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Client cli  = dao.SelectClient(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));

				
				textField_code.setText(cli.getCode());
				textField_date.setText(cli.getDate());
				textField_nom.setText(cli.getNom());
				textField_prenom.setText(cli.getPrenom());
				textField_adresse.setText(cli.getAdresse());
				textField_fixe.setText(cli.getNumeroTelephone());
				textField_mobile.setText(cli.getNumeroTelephone());
				textField_email.setText(cli.getEmail());
				textField_remarques.setText(cli.getRemarques());
				checkBox.setSelected(cli.isCarteFidelite());
					
			}

		});
		
		// Suppression d'un client
		
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = JOptionPane.showConfirmDialog(null,
						"Voulez-vous supprimer cet article ? \nIl vous sera impossible de faire marche arrière.");

				if (n == 0)
					if (dao.DeleteClient(dao.SelectClient(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString())))) {
						JOptionPane.showMessageDialog(null, "Suppression effectuée.");

						// table.remove(Integer.parseInt(table.getValueAt(table.getSelectedRow(),
						// 0).toString()));

						tblModel.removeRow(table.getSelectedRow());

					} else {
						JOptionPane.showMessageDialog(null,
								"Ce client a au moins une commande en cours, il n'est pas possible de le supprimer. \n Merci de supprimer les commandes associées à ce client");
					}

			}
		});

		
		
	}
}
	
