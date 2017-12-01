package com.formation.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.formation.DAO.ArticleDAOSQL;
import com.formation.model.Article;
import com.formation.utilitaires.ConnexionJDBC;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class jfArticles extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCode;
	private JTextField textFieldCategorie;
	private JTextField textFieldDesign;
	private JTextField textFieldQte;
	private JTextField textFieldPrix;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfArticles frame = new jfArticles();
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
	public jfArticles() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(jfArticles.class.getResource("/Images/Moon-32.png")));
		setTitle("Gestion des articles");
		setResizable(false);
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(0, 0, 223, 551);
		contentPane.add(panel);
		
		JButton btnAcceuil = new JButton("Acceuil");
		btnAcceuil.setContentAreaFilled(false);
		btnAcceuil.setPressedIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Home-48-actif.png")));
		btnAcceuil.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Home-48.png")));
		btnAcceuil.setFocusable(false);
		btnAcceuil.setForeground(Color.BLACK);
		btnAcceuil.setBorder(null);
		btnAcceuil.setBackground(new Color(85, 107, 47));
		btnAcceuil.setBounds(10, 478, 119, 62);
		panel.add(btnAcceuil);
		
		JLabel lblArticles = new JLabel("Articles");
		lblArticles.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/article/Product-64-actif.png")));
		lblArticles.setFont(new Font("Dialog", Font.BOLD, 20));
		lblArticles.setBounds(10, 12, 203, 67);
		panel.add(lblArticles);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 51, 189, 28);
		panel.add(label_1);
		
		JButton btnNewButton = new JButton("Aper\u00E7u");
		btnNewButton.setRolloverIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Preview-48-actif.png")));
		btnNewButton.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Preview-48.png")));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBorder(null);
		btnNewButton.setFocusable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(6, 304, 123, 54);
		panel.add(btnNewButton);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setRolloverIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Printer-48-actif.png")));
		btnImprimer.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Printer-48.png")));
		btnImprimer.setForeground(Color.BLACK);
		btnImprimer.setFocusable(false);
		btnImprimer.setContentAreaFilled(false);
		btnImprimer.setBorder(null);
		btnImprimer.setBackground(Color.WHITE);
		btnImprimer.setBounds(6, 359, 123, 50);
		panel.add(btnImprimer);
		
		JButton btnExporter = new JButton("Exporter");
		btnExporter.setRolloverIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Data-Export-48-actif.png")));
		btnExporter.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Data-Export-48.png")));
		btnExporter.setForeground(Color.BLACK);
		btnExporter.setFocusable(false);
		btnExporter.setContentAreaFilled(false);
		btnExporter.setBorder(null);
		btnExporter.setBackground(Color.WHITE);
		btnExporter.setBounds(6, 415, 123, 54);
		panel.add(btnExporter);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(226, 0, 568, 218);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textFieldCode = new JTextField();
		textFieldCode.setEditable(false);
		textFieldCode.setBounds(53, 12, 193, 20);
		panel_1.add(textFieldCode);
		textFieldCode.setColumns(10);
		
		textFieldCategorie = new JTextField();
		textFieldCategorie.setEditable(false);
		textFieldCategorie.setBounds(343, 12, 187, 20);
		panel_1.add(textFieldCategorie);
		textFieldCategorie.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cat\u00E9gorie : ");
		lblNewLabel.setBounds(264, 14, 74, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom : ");
		lblNewLabel_1.setBounds(9, 14, 55, 16);
		panel_1.add(lblNewLabel_1);
		
		textFieldDesign = new JTextField();
		textFieldDesign.setEditable(false);
		textFieldDesign.setBounds(87, 44, 443, 34);
		panel_1.add(textFieldDesign);
		textFieldDesign.setColumns(10);
		
		JLabel lblDesignation = new JLabel("Designation :");
		lblDesignation.setBounds(9, 53, 90, 16);
		panel_1.add(lblDesignation);
		
		textFieldQte = new JTextField();
		textFieldQte.setEditable(false);
		textFieldQte.setBounds(53, 90, 114, 20);
		panel_1.add(textFieldQte);
		textFieldQte.setColumns(10);
		
		JLabel lblQte = new JLabel("Qte :");
		lblQte.setBounds(9, 92, 55, 16);
		panel_1.add(lblQte);
		
		JLabel lblNewLabel_2 = new JLabel("Prix Unitaire :");
		lblNewLabel_2.setBounds(264, 92, 96, 16);
		panel_1.add(lblNewLabel_2);
		
		textFieldPrix = new JTextField();
		textFieldPrix.setEditable(false);
		textFieldPrix.setBounds(343, 90, 164, 20);
		panel_1.add(textFieldPrix);
		textFieldPrix.setColumns(10);
		
		JLabel label = new JLabel("\u20AC");
		label.setBounds(512, 90, 18, 16);
		panel_1.add(label);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setRolloverIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Add-New-48-actif.png")));
		btnAjouter.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Add-New-48.png")));
		btnAjouter.setForeground(Color.BLACK);
		btnAjouter.setFocusable(false);
		btnAjouter.setContentAreaFilled(false);
		btnAjouter.setBorder(null);
		btnAjouter.setBackground(Color.WHITE);
		btnAjouter.setBounds(9, 141, 123, 64);
		panel_1.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setRolloverIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Data-Edit-48-actif.png")));
		btnModifier.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Data-Edit-48.png")));
		btnModifier.setForeground(Color.BLACK);
		btnModifier.setFocusable(false);
		btnModifier.setContentAreaFilled(false);
		btnModifier.setBorder(null);
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(144, 141, 123, 64);
		panel_1.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setRolloverIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Garbage-Open-48-actif.png")));
		btnSupprimer.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Garbage-Open-48.png")));
		btnSupprimer.setForeground(Color.BLACK);
		btnSupprimer.setFocusable(false);
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setBorder(null);
		btnSupprimer.setBackground(Color.WHITE);
		btnSupprimer.setBounds(279, 141, 123, 64);
		panel_1.add(btnSupprimer);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.setRolloverIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Cancel-48-actif.png")));
		btnEffacer.setIcon(new ImageIcon(jfArticles.class.getResource("/Images/gestion/Cancel-48.png")));
		btnEffacer.setForeground(Color.BLACK);
		btnEffacer.setFocusable(false);
		btnEffacer.setContentAreaFilled(false);
		btnEffacer.setBorder(null);
		btnEffacer.setBackground(Color.WHITE);
		btnEffacer.setBounds(414, 141, 123, 64);
		panel_1.add(btnEffacer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(226, 221, 568, 330);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 568, 330);
		panel_2.add(scrollPane);
		
		table = new JTable();
		
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		Object[][] tableData = null;
		
		DefaultTableModel tblModel = new DefaultTableModel(tableData,new String[] {"Nom", "Categorie", "Designation", "Quantit\u00E9", "Prix Unitaire"}) {
			@Override
		    public boolean isCellEditable(int row, int column) {
		       //all cells false
		       return false;
		    }
		};
		table.getTableHeader().setReorderingAllowed(false) ;
		table.setModel(tblModel);
		scrollPane.setViewportView(table);
		
	
		
		
		// -------------------------------------------------------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------ Traitement � l'ouverture -----------------------------------------------------------
		// -------------------------------------------------------------------------------------------------------------------------------------------------
		
		// ------------------------------------------------------------- Remplissage des TxtFields ---------------------------------------------------------
		
		ArrayList<Article> list = new ArrayList<Article>(); 
		ArticleDAOSQL dao = new ArticleDAOSQL(ConnexionJDBC.getInstance());
		
		
		list = dao.SelectAllArticles();
		int o = 0;
		for(Article a : list)
		{
				
			tblModel.addRow(tableData);
			table.setValueAt(a.getNom(), o, 0);
			table.setValueAt(a.getCategorie(), o, 1);
			table.setValueAt(a.getDescription(), o, 2);
			table.setValueAt(a.getQuantite(), o, 3);
			table.setValueAt(a.getPrixHT(), o, 4);
		
			o++;
			
		}
		
		//-------------------------------------------------------------- Execution de code a la selection d'une ligne -------------------------------------
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int index = table.getSelectedRow();
				
				textFieldCode.setText((String) table.getValueAt(index, 0));
				textFieldCategorie.setText((String) table.getValueAt(index, 1));
				textFieldDesign.setText((String) table.getValueAt(index, 2));
				textFieldQte.setText(table.getValueAt(index, 3).toString());
				textFieldPrix.setText(table.getValueAt(index, 4).toString());
			
			}
		});
		
		
	}
}
