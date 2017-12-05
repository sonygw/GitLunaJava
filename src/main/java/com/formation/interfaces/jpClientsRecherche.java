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

import com.formation.DAO.ClientDAOSQL;
import com.formation.model.Client;
import com.formation.utilitaires.ConnexionJDBC;
import com.formation.utilitaires.mesBoutons;

public class jpClientsRecherche extends JPanel {
	private JTable table;
	private JTextField textField_code;
	private JTextField textField_date;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_adresse;
	private JTextField textField_telephone;
	private JTextField textField_email;
	private JTextField textField_remarques;
	private jfClients frame;
	private JTextField textField_recherchenom;

	/**
	 * Create the panel.
	 */
	public jpClientsRecherche(jfClients jfc) {
		
		ClientDAOSQL dao = new ClientDAOSQL(ConnexionJDBC.getInstance());
		
		this.frame = jfc;
		setMinimumSize(new Dimension(790, 590));
		setBackground(new Color(173, 216, 230));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBorder(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label = new JLabel("Code");
		label.setBounds(10, 11, 47, 14);
		panel.add(label);
		
		textField_code = new JTextField();
		textField_code.setEditable(false);
		textField_code.setColumns(10);
		textField_code.setBounds(68, 8, 116, 20);
		panel.add(textField_code);
		
		JLabel label_1 = new JLabel("Cr\u00E9\u00E9 le ");
		label_1.setBounds(209, 11, 60, 14);
		panel.add(label_1);
		
		textField_date = new JTextField();
		textField_date.setEditable(false);
		textField_date.setEnabled(false);
		textField_date.setColumns(10);
		textField_date.setBounds(258, 8, 130, 20);
		panel.add(textField_date);
		
		JCheckBox checkBox_cartefidel = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		checkBox_cartefidel.setEnabled(false);
		checkBox_cartefidel.setBounds(394, 7, 150, 23);
		panel.add(checkBox_cartefidel);
		
		textField_nom = new JTextField();
		textField_nom.setEnabled(false);
		textField_nom.setEditable(false);
		textField_nom.setColumns(10);
		textField_nom.setBounds(394, 37, 212, 20);
		panel.add(textField_nom);
		
		JLabel label_2 = new JLabel("Nom");
		label_2.setBounds(361, 40, 36, 14);
		panel.add(label_2);
		
		textField_prenom = new JTextField();
		textField_prenom.setEditable(false);
		textField_prenom.setEnabled(false);
		textField_prenom.setColumns(10);
		textField_prenom.setBounds(68, 34, 188, 20);
		panel.add(textField_prenom);
		
		JLabel label_3 = new JLabel("Pr\u00E9nom");
		label_3.setBounds(10, 37, 54, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Adresse");
		label_4.setBounds(10, 68, 54, 14);
		panel.add(label_4);
		
		textField_adresse = new JTextField();
		textField_adresse.setEditable(false);
		textField_adresse.setEnabled(false);
		textField_adresse.setColumns(10);
		textField_adresse.setBounds(68, 65, 538, 20);
		panel.add(textField_adresse);
		
		JLabel lblTlphone = new JLabel("T\u00E9l.");
		lblTlphone.setBounds(10, 96, 64, 14);
		panel.add(lblTlphone);
		
		textField_telephone = new JTextField();
		textField_telephone.setEditable(false);
		textField_telephone.setEnabled(false);
		textField_telephone.setColumns(10);
		textField_telephone.setBounds(68, 96, 538, 20);
		panel.add(textField_telephone);
		
		textField_email = new JTextField();
		textField_email.setEditable(false);
		textField_email.setEnabled(false);
		textField_email.setColumns(10);
		textField_email.setBounds(68, 127, 538, 20);
		panel.add(textField_email);
		
		JLabel label_7 = new JLabel("Email");
		label_7.setBounds(10, 130, 47, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Remarques");
		label_8.setBounds(10, 189, 64, 14);
		panel.add(label_8);
		
		textField_remarques = new JTextField();
		textField_remarques.setEditable(false);
		textField_remarques.setEnabled(false);
		textField_remarques.setColumns(10);
		textField_remarques.setBounds(68, 165, 538, 63);
		panel.add(textField_remarques);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setName("Recherche client");
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Recherche client", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addGap(67))
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		panel_2.setLayout(null);
		
		JLabel lblEntrerLeNom = new JLabel("Entrer le nom du client recherch\u00E9 :");
		lblEntrerLeNom.setBounds(10, 47, 196, 14);
		panel_2.add(lblEntrerLeNom);
		
		textField_recherchenom = new JTextField();
		textField_recherchenom.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField_recherchenom.setBounds(240, 44, 252, 20);
		panel_2.add(textField_recherchenom);
		textField_recherchenom.setColumns(10);
		
		JButton btnNewButton = new JButton("Rechercher");
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Search-32-actif.png")));
		btnNewButton.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Search-48.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
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
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jpClients annule = new jpClients(jfc);
				mesBoutons annuler = new mesBoutons();
				annuler.setFenetre(frame);
			annuler.changerPanneau(annule, "Gestion des clients");
			}
		});
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
		
		JButton btnClients = new JButton("");
		btnClients.setFocusable(false);
		btnClients.setBorder(null);
		btnClients.setRolloverIcon(new ImageIcon(jpClientsRecherche.class.getResource("/Images/gestion/client/User-Find-64.png")));
		btnClients.setBackground(new Color(127, 255, 212));
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClients.setContentAreaFilled(false);
		btnClients.setIcon(new ImageIcon(jpClientsRecherche.class.getResource("/Images/gestion/client/User-Find-64.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(btnAperu, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
				.addComponent(btnImprimer, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnExport, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnClients, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnClients)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(196)
					.addComponent(btnAperu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addGap(33)
					.addComponent(btnNewButton_1)
					.addContainerGap(81, Short.MAX_VALUE))
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
	
		// -----------------------------------------------------Traitement métier---------------------------------------------------------------
		
			// Recherche des clients dans la base
		
		
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
		
		

		textField_recherchenom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Client> cli  = dao.SelectAllClientsByName(textField_recherchenom.getText());

				int n = tblModel.getRowCount();
				for (int i = n - 1; i >= 0; --i)
					tblModel.removeRow(i);
				
				int o = 0;
				for (Client c : cli) {
					tblModel.addRow(tableData);
					table.setValueAt(c.getIdClient(), o, 0);
					table.setValueAt(c.getCode(), o, 1);
					table.setValueAt(c.getNom(), o, 2);
					table.setValueAt(c.getPrenom(), o, 3);
					table.setValueAt(c.fidel(), o, 4);
					table.setValueAt(c.getDate(), o, 5);

					o++;
				}
			}
		});
		
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
						textField_telephone.setText(cli.getNumeroTelephone());
						textField_email.setText(cli.getEmail());
						textField_remarques.setText(cli.getRemarques());
						checkBox_cartefidel.setSelected(cli.isCarteFidelite());
				
					}
					});
		}
	}

