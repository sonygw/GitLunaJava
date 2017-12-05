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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.formation.DAO.ArtComDAOSQL;
import com.formation.DAO.ArticleDAOSQL;
import com.formation.DAO.ClientDAOSQL;
import com.formation.DAO.CommandeDAOSQL;
import com.formation.model.ArtCom;
import com.formation.model.Article;
import com.formation.model.Client;
import com.formation.model.Commande;
import com.formation.utilitaires.Admin;
import com.formation.utilitaires.ConnexionJDBC;

import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class jfCommandes extends JFrame {

	private JPanel contentPane;
	private JTextField textField_QteArtic;
	private JTextField textField_PrixUnitaiArt;
	private JTextField textField_DesignArtic;
	private JTextField textField_CodeArtic;
	private JTextField textField_CatArticle;
	private JTable table;
	private JTextField textField_NumCmde;
	private JTextField textField_Date;
	private JTextField textField_PrixTotal;

	private Client cliEnCours = null;
	private Commande comEnCours = null;
	private Article artEnCours = null;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		ClientDAOSQL clientDao = new ClientDAOSQL(ConnexionJDBC.getInstance());
		CommandeDAOSQL commandeDao = new CommandeDAOSQL(ConnexionJDBC.getInstance());
		ArticleDAOSQL articleDao = new ArticleDAOSQL(ConnexionJDBC.getInstance());
		ArtComDAOSQL artComDao = new ArtComDAOSQL(ConnexionJDBC.getInstance());

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);

		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnNewMenu.add(mntmQuitter);
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
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
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
		lblCommandes.setIcon(
				new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommandes.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCommandes.setBounds(10, 12, 203, 67);
		panel.add(lblCommandes);

		JButton button_Aperçu = new JButton("Aper\u00E7u");
		button_Aperçu
				.setRolloverIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Preview-48-actif.png")));
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
		button_Imp
				.setRolloverIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Printer-48-actif.png")));
		button_Imp.setForeground(Color.BLACK);
		button_Imp.setFocusable(false);
		button_Imp.setContentAreaFilled(false);
		button_Imp.setBorder(null);
		button_Imp.setBackground(Color.WHITE);
		button_Imp.setBounds(6, 359, 123, 50);
		panel.add(button_Imp);

		JButton button_Exp = new JButton("Exporter");
		button_Exp.setRolloverIcon(
				new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Data-Export-48-actif.png")));
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
		btnCommandesExistantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jfCommandesExist frame = new jfCommandesExist();
				frame.setVisible(true);

			}
		});
		btnCommandesExistantes
				.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/Receipt-48.png")));
		btnCommandesExistantes.setForeground(Color.BLACK);
		btnCommandesExistantes.setFocusable(false);
		btnCommandesExistantes.setContentAreaFilled(false);
		btnCommandesExistantes.setBorder(null);
		btnCommandesExistantes.setBackground(Color.WHITE);
		btnCommandesExistantes.setBounds(10, 91, 187, 64);
		panel.add(btnCommandesExistantes);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0)), "Informations g\u00E9n\u00E9rales",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(226, 0, 568, 104);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		textField_NumCmde = new JTextField();
		textField_NumCmde.setEditable(false);
		textField_NumCmde.setBounds(150, 25, 173, 20);
		panel_1.add(textField_NumCmde);
		textField_NumCmde.setColumns(10);

		JLabel lblNewLabel = new JLabel("Commande en cours :");
		lblNewLabel.setBounds(12, 27, 134, 16);
		panel_1.add(lblNewLabel);

		textField_Date = new JTextField();
		textField_Date.setEditable(false);
		textField_Date.setBounds(387, 25, 141, 20);
		panel_1.add(textField_Date);
		textField_Date.setColumns(10);

		JLabel lblDate = new JLabel("Date :");
		lblDate.setBounds(341, 27, 55, 16);
		panel_1.add(lblDate);

		JComboBox<String> comboBox_Client = new JComboBox<String>();

		comboBox_Client.setBounds(102, 67, 333, 25);
		panel_1.add(comboBox_Client);

		ArrayList<Client> ListCli = clientDao.SelectAllClients();

		for (int x = 0; x < ListCli.size(); x++)
			comboBox_Client.addItem(
					ListCli.get(x).getNom() + " - " + ListCli.get(x).getPrenom() + " - " + ListCli.get(x).getEmail());

		JLabel lblNomDuClient = new JLabel("Nom du client :");
		lblNomDuClient.setBounds(12, 71, 89, 16);
		panel_1.add(lblNomDuClient);

		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 140, 0)), "Valeurs de la commande",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(226, 115, 568, 340);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JButton button_add = new JButton("Ajouter");
		button_add.setEnabled(false);

		button_add.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Add-New-48.png")));
		button_add.setForeground(Color.BLACK);
		button_add.setFocusable(false);
		button_add.setContentAreaFilled(false);
		button_add.setBorder(null);
		button_add.setBackground(Color.WHITE);
		button_add.setBounds(81, 158, 123, 48);
		panel_2.add(button_add);

		JButton button_upd = new JButton("Modifier");
		button_upd.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Data-Edit-48.png")));
		button_upd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_upd.setForeground(Color.BLACK);
		button_upd.setFocusable(false);
		button_upd.setEnabled(false);
		button_upd.setContentAreaFilled(false);
		button_upd.setBorder(null);
		button_upd.setBackground(Color.WHITE);
		button_upd.setBounds(216, 158, 123, 48);
		panel_2.add(button_upd);

		JButton button_del = new JButton("Supprimer");

		button_del.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/Garbage-Open-48.png")));
		button_del.setForeground(Color.BLACK);
		button_del.setFocusable(false);
		button_del.setEnabled(false);
		button_del.setContentAreaFilled(false);
		button_del.setBorder(null);
		button_del.setBackground(Color.WHITE);
		button_del.setBounds(351, 158, 123, 48);
		panel_2.add(button_del);

		textField_QteArtic = new JTextField();
		textField_QteArtic.setColumns(10);
		textField_QteArtic.setBounds(66, 126, 104, 20);
		panel_2.add(textField_QteArtic);

		JLabel label = new JLabel("Qte :");
		label.setBounds(12, 128, 55, 16);
		panel_2.add(label);

		JLabel label_1 = new JLabel("Prix Unitaire :");
		label_1.setBounds(267, 128, 96, 16);
		panel_2.add(label_1);

		textField_PrixUnitaiArt = new JTextField();
		textField_PrixUnitaiArt.setEditable(false);
		textField_PrixUnitaiArt.setColumns(10);
		textField_PrixUnitaiArt.setBounds(346, 126, 185, 20);
		panel_2.add(textField_PrixUnitaiArt);

		JLabel label_2 = new JLabel("\u20AC");
		label_2.setBounds(538, 128, 18, 16);
		panel_2.add(label_2);

		textField_DesignArtic = new JTextField();
		textField_DesignArtic.setEditable(false);
		textField_DesignArtic.setColumns(10);
		textField_DesignArtic.setBounds(90, 87, 466, 34);
		panel_2.add(textField_DesignArtic);

		JLabel label_3 = new JLabel("Designation :");
		label_3.setBounds(12, 96, 90, 16);
		panel_2.add(label_3);

		JLabel lblCode = new JLabel("Code : ");
		lblCode.setBounds(12, 59, 55, 16);
		panel_2.add(lblCode);

		textField_CodeArtic = new JTextField();
		textField_CodeArtic.setEditable(false);
		textField_CodeArtic.setColumns(10);
		textField_CodeArtic.setBounds(66, 57, 183, 20);
		panel_2.add(textField_CodeArtic);

		JLabel label_5 = new JLabel("Cat\u00E9gorie : ");
		label_5.setBounds(267, 59, 74, 16);
		panel_2.add(label_5);

		textField_CatArticle = new JTextField();
		textField_CatArticle.setEditable(false);
		textField_CatArticle.setColumns(10);
		textField_CatArticle.setBounds(346, 57, 210, 20);
		panel_2.add(textField_CatArticle);

		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(9, 218, 547, 110);
		panel_2.add(scrollPane);

		table = new JTable();
		Object[][] tableData = null;
		DefaultTableModel tblModel = new DefaultTableModel(tableData,
				new String[] { "id", "Code", "Categorie", "Designation", "Quantit\u00E9", "Prix Unitaire" , "QR"}) {
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
		
		table.getColumn("QR").setMinWidth(0);
		table.getColumn("QR").setMaxWidth(0);
		
		scrollPane.setViewportView(table);

		JComboBox<String> comboBox_Articles = new JComboBox<String>();

		comboBox_Articles.setBounds(66, 27, 490, 20);
		panel_2.add(comboBox_Articles);

		ArrayList<Article> listArticles = articleDao.SelectAllArticles();

		for (int x = 0; x < listArticles.size(); x++)
			comboBox_Articles.addItem(listArticles.get(x).getCode() + " - " + listArticles.get(x).getCategorie() + " - "
					+ listArticles.get(x).getPrixHT() + "€");

		JLabel lblArticle = new JLabel("Article :");
		lblArticle.setBounds(12, 27, 55, 16);
		panel_2.add(lblArticle);

		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBounds(226, 452, 568, 99);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblModeDeRglement = new JLabel("Mode de r\u00E9glement :");
		lblModeDeRglement.setBounds(38, 16, 156, 16);
		panel_3.add(lblModeDeRglement);
		lblModeDeRglement.setIcon(new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/ATM-32.png")));

		JComboBox comboBox_Reglement = new JComboBox();
		comboBox_Reglement.setBounds(199, 12, 94, 25);
		panel_3.add(comboBox_Reglement);
		comboBox_Reglement.setModel(new DefaultComboBoxModel(new String[] { "Esp\u00E8ces", "CB", "Ch\u00E8que" }));

		JButton btnValiderCmde = new JButton("Valider la commande");
		btnValiderCmde.setBounds(333, 55, 223, 32);
		panel_3.add(btnValiderCmde);

		btnValiderCmde.setBorder(null);
		btnValiderCmde.setIcon(
				new ImageIcon(jfCommandes.class.getResource("/Images/gestion/commande/Shopping-Cart-05-48.png")));
		btnValiderCmde.setContentAreaFilled(false);
		btnValiderCmde.setSelected(true);

		textField_PrixTotal = new JTextField();
		textField_PrixTotal.setBounds(427, 8, 76, 32);
		panel_3.add(textField_PrixTotal);
		textField_PrixTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_PrixTotal.setText("0");
		textField_PrixTotal.setBorder(new LineBorder(new Color(255, 165, 0), 2));
		textField_PrixTotal.setBackground(new Color(255, 255, 0));
		textField_PrixTotal.setEditable(false);
		textField_PrixTotal.setColumns(10);

		JLabel label_4 = new JLabel("\u20AC");
		label_4.setBounds(508, 16, 18, 16);
		panel_3.add(label_4);

		// ------------------------------------------------------------------------------
		// Traitement des evenements ----------

		// --------------------------------------------- Selection d'un Client dans la
		// comboBox client

		comboBox_Client.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cliEnCours = ListCli.get(comboBox_Client.getSelectedIndex());
				comEnCours = new Commande();
				Commande lastCommande = commandeDao.SelectLastCommande();
				String nomCommande = "COMFRA" ;
				if (!lastCommande.equals(null)) {
				nomCommande += (lastCommande.getIdCommande() + 1);
				}else
				{
					nomCommande += 1;
				}
				comEnCours.setRef(nomCommande);
				textField_NumCmde.setText(nomCommande);

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date = sdf.format(new Date());

				textField_Date.setText(date);
				comEnCours.setDate(date);
				comEnCours.setIdClient(cliEnCours.getIdClient());
				comEnCours.setAdresse(cliEnCours.getAdresse());

				panel_2.setVisible(true);

			}
		});

		// ---------------------------------------- Selection d'un article dans la
		// comboBox article

		comboBox_Articles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				artEnCours = listArticles.get(comboBox_Articles.getSelectedIndex());

				textField_CatArticle.setText(artEnCours.getCategorie());
				textField_CodeArtic.setText(artEnCours.getCode());
				textField_PrixUnitaiArt.setText(Double.toString(artEnCours.getPrixHT()));
				textField_DesignArtic.setText(artEnCours.getDescription());

				button_add.setEnabled(true);

			}
		});

		// ------------------------------------------------ Ajout d'un nouvel article
		// dans le tableau + MàJ du prix

		
		
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!(textField_QteArtic.getText().equals(""))) {
					
					tblModel.addRow(tableData);
					table.setValueAt(artEnCours.getIdArticle(), tblModel.getRowCount() - 1, 0);
					table.setValueAt(artEnCours.getCode(), tblModel.getRowCount() - 1, 1);
					table.setValueAt(artEnCours.getCategorie(), tblModel.getRowCount() - 1, 2);
					table.setValueAt(artEnCours.getDescription(), tblModel.getRowCount() - 1, 3);
					table.setValueAt(textField_QteArtic.getText(), tblModel.getRowCount() - 1, 4);
					table.setValueAt(artEnCours.getPrixHT(), tblModel.getRowCount() - 1, 5);				
					table.setValueAt((artEnCours.getQuantite() - Integer.parseInt(textField_QteArtic.getText()) ), tblModel.getRowCount() - 1, 6);				
					
					
					textField_PrixTotal.setText(Double.toString(Double.parseDouble(textField_PrixTotal.getText())
							+ (artEnCours.getPrixHT() * Integer.parseInt(textField_QteArtic.getText()))));

				} else {
					JOptionPane.showMessageDialog(null, "Veuillez renseigner une quantité svp !");
				}

				panel_3.setVisible(true);

			}
		});

		// ----------------------------------------------------------- à la séléction
		// d'un article dans le tableau

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			button_del.setEnabled(true);
			}

		});

		// -----------------------------------------------------------------------
		// supprimer article de la commande

		button_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int n = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cet article de la commande?");

				if (n == 0) {

					textField_PrixTotal.setText(Double.toString(Double.parseDouble(textField_PrixTotal.getText()) - (

					Double.parseDouble(table.getValueAt(table.getSelectedRow(), 4).toString())
							* Double.parseDouble(table.getValueAt(table.getSelectedRow(), 5).toString())

					// artEnCours.getPrixHT() * Integer.parseInt(
					// textField_QteArtic.getText())
					)));
					tblModel.removeRow(table.getSelectedRow());

				}

			}
		});

		// ----------------------------------------- Boutton SUPP TOUTES LES LIGNES

		btnSuppLigne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField_CatArticle.setText("");
				textField_CodeArtic.setText("");
				textField_Date.setText("");
				textField_DesignArtic.setText("");
				textField_NumCmde.setText("");
				textField_PrixTotal.setText("0");
				textField_PrixUnitaiArt.setText("");
				textField_QteArtic.setText("");
				int n = tblModel.getRowCount();
				for (int i = n - 1; i >= 0; --i)
					tblModel.removeRow(i);
			}
		});

		// ----------------------------------------- VALIDATION COMMANDE
		// ------------------------------------

		btnValiderCmde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comEnCours.setPrixHT(Double.parseDouble(textField_PrixTotal.getText()));
				comEnCours.setReglement(comboBox_Reglement.getItemAt(comboBox_Reglement.getSelectedIndex()).toString());
				commandeDao.CreateCommande(comEnCours);
				int idCmde = commandeDao.SelectLastCommande().getIdCommande();
				for (int i = 0; i < table.getRowCount(); i++) {
					ArtCom obj = new ArtCom(-1, idCmde, Integer.parseInt(table.getValueAt(i, 0).toString()),
							Integer.parseInt(table.getValueAt(i, 4).toString()));
					// on créer le lien entre la commande et l'article
					artComDao.CreateArtComFromCommande(obj);

					// on récupere l'article qu'on a dans la commande
					artEnCours = articleDao.SelectArticleById(Integer.parseInt(table.getValueAt(i, 0).toString()));
					// on update la quantité 
					artEnCours.setQuantite(artEnCours.getQuantite() - Integer.parseInt(table.getValueAt(i, 4).toString()));
					// on update l'article en base
					articleDao.UpdateArticle(artEnCours, artEnCours.getIdArticle());
					
				}

				JOptionPane.showMessageDialog(null, "Commande ajoutée en base !");

				jfCommandes frame = new jfCommandes();
				frame.setVisible(true);
				dispose();
			}
		});
	}
}
