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
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;

public class jpClientsModif extends JPanel {
	private JTextField fixe;
	private JTextField prenom;
	private JTextField adresse;
	private JTextField code;
	private JTextField nom;
	private JTextField mobile;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public jpClientsModif() {
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
					.addGap(97)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(code, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(chckbxCarteDeFidlit)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(label_6))
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
					.addComponent(label_7)
					.addComponent(chckbxCarteDeFidlit)
					.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 745, Short.MAX_VALUE))
					.addContainerGap())
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
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel label_2 = new JLabel("Fixe");
		
		JLabel label_3 = new JLabel("Mobile");
		
		JLabel lblEmail = new JLabel("Email");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
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
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel label = new JLabel("Pr\u00E9nom");
		
		JLabel label_1 = new JLabel("Nom");
		
		nom = new JTextField();
		nom.setColumns(10);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		
		JLabel label_8 = new JLabel("Adresse");
		
		adresse = new JTextField();
		adresse.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		
		fixe = new JTextField();
		fixe.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville");
		
		prenom = new JTextField();
		prenom.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCodePostal)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
							.addComponent(label)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(nom, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(mobile, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
						.addComponent(adresse, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(fixe, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addGap(190)
							.addComponent(lblVille)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(prenom, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodePostal)
						.addComponent(fixe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVille)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
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
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setRolloverIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Cancel-48-actif.png")));
		btnNewButton_1.setIcon(new ImageIcon(jpClientsAjout.class.getResource("/Images/gestion/Cancel-48.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setDefaultCapable(false);
		
		JButton btnAperu = new JButton("Aper\u00E7u");
		btnAperu.setBorder(null);
		btnAperu.setRolloverIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48-actif.png")));
		btnAperu.setIcon(new ImageIcon(jpClients.class.getResource("/Images/gestion/Preview-48.png")));
		btnAperu.setContentAreaFilled(false);
		
		JButton btnClients = new JButton("Modification");
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
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btnAperu, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
						.addComponent(btnImprimer, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnExport, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnClients, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(btnClients)
					.addGap(18)
					.addComponent(btnSauvegarder)
					.addGap(114)
					.addComponent(btnAperu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addGap(70)
					.addComponent(btnNewButton_1)
					.addContainerGap(229, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(groupLayout);

	}
}
