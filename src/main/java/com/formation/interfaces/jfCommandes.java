package com.formation.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jfCommandes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_PrixTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfCommandes frame = new jfCommandes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jfCommandes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(jfCommandes.class.getResource("/Images/Moon-32.png")));
		setTitle("Gestion des commandes");
		setResizable(false);
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 223, 551);
		contentPane.add(panel);
		
		JButton button = new JButton("Acceuil");
		button.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Home-48.png")));
		button.setRolloverIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Home-48-actif.png")));
		button.setForeground(Color.BLACK);
		button.setFocusable(false);
		button.setContentAreaFilled(false);
		button.setBorder(null);
		button.setBackground(new Color(85, 107, 47));
		button.setBounds(10, 478, 119, 62);
		panel.add(button);
		
		JLabel lblCommandes = new JLabel("Commandes");
		lblCommandes.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommandes.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCommandes.setBounds(10, 12, 203, 67);
		panel.add(lblCommandes);
		
		JButton button_Aperçu = new JButton("Aper\u00E7u");
		button_Aperçu.setRolloverIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Preview-48-actif.png")));
		button_Aperçu.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Preview-48.png")));
		button_Aperçu.setForeground(Color.BLACK);
		button_Aperçu.setFocusable(false);
		button_Aperçu.setContentAreaFilled(false);
		button_Aperçu.setBorder(null);
		button_Aperçu.setBackground(Color.WHITE);
		button_Aperçu.setBounds(6, 304, 123, 54);
		panel.add(button_Aperçu);
		
		JButton button_Imp = new JButton("Imprimer");
		button_Imp.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Printer-48.png")));
		button_Imp.setRolloverIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Printer-48-actif.png")));
		button_Imp.setForeground(Color.BLACK);
		button_Imp.setFocusable(false);
		button_Imp.setContentAreaFilled(false);
		button_Imp.setBorder(null);
		button_Imp.setBackground(Color.WHITE);
		button_Imp.setBounds(6, 359, 123, 50);
		panel.add(button_Imp);
		
		JButton button_Exp = new JButton("Exporter");
		button_Exp.setRolloverIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Data-Export-48-actif.png")));
		button_Exp.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Data-Export-48.png")));
		button_Exp.setForeground(Color.BLACK);
		button_Exp.setFocusable(false);
		button_Exp.setContentAreaFilled(false);
		button_Exp.setBorder(null);
		button_Exp.setBackground(Color.WHITE);
		button_Exp.setBounds(6, 415, 123, 54);
		panel.add(button_Exp);
		
		JButton btnSuppLigne = new JButton("Supprimer toutes les lignes");
		btnSuppLigne.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Garbage-Open-48.png")));
		btnSuppLigne.setForeground(Color.BLACK);
		btnSuppLigne.setFocusable(false);
		btnSuppLigne.setContentAreaFilled(false);
		btnSuppLigne.setBorder(null);
		btnSuppLigne.setBackground(Color.WHITE);
		btnSuppLigne.setBounds(6, 228, 217, 64);
		panel.add(btnSuppLigne);
		
		JButton btnCommandesExistantes = new JButton("Commandes existantes");
		btnCommandesExistantes.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/Receipt-48.png")));
		btnCommandesExistantes.setForeground(Color.BLACK);
		btnCommandesExistantes.setFocusable(false);
		btnCommandesExistantes.setContentAreaFilled(false);
		btnCommandesExistantes.setBorder(null);
		btnCommandesExistantes.setBackground(Color.WHITE);
		btnCommandesExistantes.setBounds(10, 91, 187, 64);
		panel.add(btnCommandesExistantes);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0)), "Informations g\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(226, 0, 568, 104);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(150, 25, 173, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Commande en cours :");
		lblNewLabel.setBounds(12, 27, 134, 16);
		panel_1.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(387, 25, 141, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setBounds(341, 27, 55, 16);
		panel_1.add(lblDate);
		
		JComboBox comboBox_Client = new JComboBox();
		comboBox_Client.setBounds(150, 67, 378, 25);
		panel_1.add(comboBox_Client);
		
		JLabel lblNomDuClient = new JLabel("Nom du client :");
		lblNomDuClient.setBounds(51, 71, 89, 16);
		panel_1.add(lblNomDuClient);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0)), "Valeurs de la commande", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(226, 115, 568, 340);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton button_4 = new JButton("Ajouter");
		button_4.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Add-New-48.png")));
		button_4.setForeground(Color.BLACK);
		button_4.setFocusable(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorder(null);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(65, 128, 123, 48);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("Modifier");
		button_5.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Data-Edit-48.png")));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_5.setForeground(Color.BLACK);
		button_5.setFocusable(false);
		button_5.setEnabled(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorder(null);
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(200, 128, 123, 48);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("Supprimer");
		button_6.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Garbage-Open-48.png")));
		button_6.setForeground(Color.BLACK);
		button_6.setFocusable(false);
		button_6.setEnabled(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorder(null);
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(335, 128, 123, 48);
		panel_2.add(button_6);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(56, 90, 114, 20);
		panel_2.add(textField);
		
		JLabel label = new JLabel("Qte :");
		label.setBounds(12, 92, 55, 16);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Prix Unitaire :");
		label_1.setBounds(267, 92, 96, 16);
		panel_2.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(346, 90, 185, 20);
		panel_2.add(textField_1);
		
		JLabel label_2 = new JLabel("\u20AC");
		label_2.setBounds(538, 92, 18, 16);
		panel_2.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(90, 51, 466, 34);
		panel_2.add(textField_2);
		
		JLabel label_3 = new JLabel("Designation :");
		label_3.setBounds(12, 60, 90, 16);
		panel_2.add(label_3);
		
		JLabel lblCode = new JLabel("Code : ");
		lblCode.setBounds(12, 23, 55, 16);
		panel_2.add(lblCode);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(56, 21, 193, 20);
		panel_2.add(textField_3);
		
		JLabel label_5 = new JLabel("Cat\u00E9gorie : ");
		label_5.setBounds(267, 23, 74, 16);
		panel_2.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(346, 21, 210, 20);
		panel_2.add(textField_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 188, 547, 140);
		panel_2.add(scrollPane);
		
		table = new JTable();
		Object[][] tableData = null;
		DefaultTableModel tblModel = new DefaultTableModel(tableData,
				new String[] { "id", "Code", "Categorie", "Designation", "Quantit\u00E9", "Prix Unitaire" }) {
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
		
		JLabel lblModeDeRglement = new JLabel("Mode de r\u00E9glement :");
		lblModeDeRglement.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/ATM-32.png")));
		lblModeDeRglement.setBounds(348, 471, 156, 16);
		contentPane.add(lblModeDeRglement);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Esp\u00E8ces", "CB", "Ch\u00E8que"}));
		comboBox_1.setBounds(504, 467, 94, 25);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Valider la commande");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/Shopping-Cart-05-48.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setSelected(true);
		btnNewButton.setBounds(536, 504, 223, 32);
		contentPane.add(btnNewButton);
		
		textField_PrixTotal = new JTextField();
		textField_PrixTotal.setBorder(new LineBorder(new Color(255, 165, 0), 2));
		textField_PrixTotal.setBackground(new Color(255, 255, 0));
		textField_PrixTotal.setEditable(false);
		textField_PrixTotal.setBounds(693, 467, 76, 32);
		contentPane.add(textField_PrixTotal);
		textField_PrixTotal.setColumns(10);
	}
}
