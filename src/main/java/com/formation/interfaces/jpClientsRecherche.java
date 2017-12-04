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

import com.formation.utilitaires.mesBoutons;

public class jpClientsRecherche extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private jfClients frame;

	/**
	 * Create the panel.
	 */
	public jpClientsRecherche(jfClients jfc) {
		this.frame = jfc;
		setMinimumSize(new Dimension(790, 590));
		setBackground(new Color(173, 216, 230));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBorder(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel label = new JLabel("Code");
		label.setBounds(10, 11, 47, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(68, 8, 116, 20);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("Cr\u00E9\u00E9 le ");
		label_1.setBounds(209, 11, 60, 14);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(258, 8, 130, 20);
		panel.add(textField_1);
		
		JCheckBox checkBox = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		checkBox.setEnabled(false);
		checkBox.setBounds(394, 7, 103, 23);
		panel.add(checkBox);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(394, 37, 212, 20);
		panel.add(textField_2);
		
		JLabel label_2 = new JLabel("Nom");
		label_2.setBounds(361, 40, 36, 14);
		panel.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(68, 34, 188, 20);
		panel.add(textField_3);
		
		JLabel label_3 = new JLabel("Pr\u00E9nom");
		label_3.setBounds(10, 37, 54, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Adresse");
		label_4.setBounds(10, 68, 54, 14);
		panel.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(68, 65, 538, 20);
		panel.add(textField_4);
		
		JLabel label_5 = new JLabel("Fixe");
		label_5.setBounds(10, 99, 30, 14);
		panel.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds(68, 96, 194, 20);
		panel.add(textField_5);
		
		JLabel label_6 = new JLabel("Mobile");
		label_6.setBounds(361, 99, 64, 14);
		panel.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		textField_6.setBounds(394, 96, 212, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(68, 127, 538, 20);
		panel.add(textField_7);
		
		JLabel label_7 = new JLabel("Email");
		label_7.setBounds(10, 130, 47, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Remarques");
		label_8.setBounds(10, 189, 64, 14);
		panel.add(label_8);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(68, 165, 538, 63);
		panel.add(textField_8);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(178, Short.MAX_VALUE))
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		
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
				.addGroup(gl_panel_1.createSequentialGroup()
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
					.addGap(46)
					.addComponent(btnNewButton_1)
					.addContainerGap(68, Short.MAX_VALUE))
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
