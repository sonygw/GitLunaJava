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
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;

public class jpClientsRecherche extends JPanel {
	private JTextField fixe;
	private JTextField prenom;
	private JTextField adresse;
	private JTextField code;
	private JTextField date;
	private JTextField nom;
	private JTextField mobile;
	private JTextField email;
	private JTextField remarques;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public jpClientsRecherche() {
		setMinimumSize(new Dimension(790, 590));
		setBackground(new Color(173, 216, 230));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label = new JLabel("Pr\u00E9nom");
		
		JLabel label_1 = new JLabel("Nom");
		
		fixe = new JTextField();
		fixe.setEnabled(false);
		fixe.setColumns(10);
		
		JLabel label_2 = new JLabel("Fixe");
		
		JLabel label_3 = new JLabel("Mobile");
		
		prenom = new JTextField();
		prenom.setEnabled(false);
		prenom.setColumns(10);
		
		adresse = new JTextField();
		adresse.setEnabled(false);
		adresse.setColumns(10);
		
		JLabel label_6 = new JLabel("Code");
		
		code = new JTextField();
		code.setEnabled(false);
		code.setColumns(10);
		
		JLabel label_7 = new JLabel("Cr\u00E9\u00E9 le ");
		
		date = new JTextField();
		date.setEnabled(false);
		date.setColumns(10);
		
		JLabel label_8 = new JLabel("Adresse");
		
		nom = new JTextField();
		nom.setEnabled(false);
		nom.setColumns(10);
		
		mobile = new JTextField();
		mobile.setEnabled(false);
		mobile.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		
		email = new JTextField();
		email.setEnabled(false);
		email.setColumns(10);
		
		JLabel lblRemarques = new JLabel("Remarques");
		
		remarques = new JTextField();
		remarques.setEnabled(false);
		remarques.setColumns(10);
		
		JCheckBox chckbxCarteDeFidlit = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		chckbxCarteDeFidlit.setEnabled(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(85)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblRemarques)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblEmail)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(remarques, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(prenom)
									.addComponent(code, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
								.addGap(28)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(date, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(chckbxCarteDeFidlit))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(nom))))
							.addComponent(adresse)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(fixe, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addGap(33)
								.addComponent(label_3)
								.addGap(18)
								.addComponent(mobile))
							.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(82))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_7)
							.addComponent(date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxCarteDeFidlit)
							.addComponent(label_6))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_1)
							.addComponent(nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(fixe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(mobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(remarques, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRemarques))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
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
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(82, Short.MAX_VALUE))
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 555, Short.MAX_VALUE)
		);
		
		JButton btnNewButton = new JButton("Rechercher");
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
		btnImprimer.setBorder(null);
		btnImprimer.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Printer-48-actif.png")));
		btnImprimer.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Printer-48.png")));
		btnImprimer.setContentAreaFilled(false);
		
		JButton btnExport = new JButton("Export");
		btnExport.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Data-Export-48-actif.png")));
		btnExport.setBorder(null);
		btnExport.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Data-Export-48.png")));
		btnExport.setBorderPainted(false);
		btnExport.setContentAreaFilled(false);
		
		JButton btnNewButton_1 = new JButton("Accueil");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Home-48-actif.png")));
		btnNewButton_1.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Home-48.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setDefaultCapable(false);
		
		JButton btnAperu = new JButton("Aper\u00E7u");
		btnAperu.setBorder(null);
		btnAperu.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48-actif.png")));
		btnAperu.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48.png")));
		btnAperu.setContentAreaFilled(false);
		
		JButton btnClients = new JButton("");
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
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addComponent(btnAperu, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
				.addComponent(btnImprimer, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnExport, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnClients, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(85))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnClients)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(196)
					.addComponent(btnAperu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addGap(56)
					.addComponent(btnNewButton_1)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Code", "Nom", "Prénom", "Carte Fidélité", "Date Création"
			}
		));
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}
}
