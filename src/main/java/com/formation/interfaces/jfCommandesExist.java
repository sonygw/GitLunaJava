package com.formation.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.formation.DAO.ArtComDAOSQL;
import com.formation.DAO.ClientDAOSQL;
import com.formation.DAO.CommandeDAOSQL;
import com.formation.model.Client;
import com.formation.model.Commande;
import com.formation.utilitaires.Admin;
import com.formation.utilitaires.ConnexionJDBC;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jfCommandesExist extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfCommandesExist frame = new jfCommandesExist();
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
	public jfCommandesExist() {

		CommandeDAOSQL commandeDao = new CommandeDAOSQL(ConnexionJDBC.getInstance());
		ClientDAOSQL clientDao = new ClientDAOSQL(ConnexionJDBC.getInstance());
		ArtComDAOSQL artComDao = new ArtComDAOSQL(ConnexionJDBC.getInstance());

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
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 223, 551);
		contentPane.add(panel);

		JButton button_retour = new JButton("Retour");
		button_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_retour.setIcon(new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Home-48.png")));
		button_retour.setRolloverIcon(
				new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Home-48-actif.png")));
		button_retour.setForeground(Color.BLACK);
		button_retour.setFocusable(false);
		button_retour.setContentAreaFilled(false);
		button_retour.setBorder(null);
		button_retour.setBackground(new Color(85, 107, 47));
		button_retour.setBounds(10, 478, 119, 62);
		panel.add(button_retour);

		JLabel label = new JLabel("Commandes");
		label.setIcon(new ImageIcon(
				jfCommandesExist.class.getResource("/Images/gestion/commande/Shopping-Bag-64-actif.png")));
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(10, 12, 203, 67);
		panel.add(label);

		JButton button_apercu = new JButton("Aper\u00E7u");
		button_apercu.setRolloverIcon(
				new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Preview-48-actif.png")));
		button_apercu.setIcon(new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Preview-48.png")));
		button_apercu.setForeground(Color.BLACK);
		button_apercu.setFocusable(false);
		button_apercu.setContentAreaFilled(false);
		button_apercu.setBorder(null);
		button_apercu.setBackground(Color.WHITE);
		button_apercu.setBounds(6, 304, 123, 54);
		panel.add(button_apercu);

		JButton button_impr = new JButton("Imprimer");
		button_impr.setIcon(new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Printer-48.png")));
		button_impr.setRolloverIcon(
				new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Printer-48-actif.png")));
		button_impr.setForeground(Color.BLACK);
		button_impr.setFocusable(false);
		button_impr.setContentAreaFilled(false);
		button_impr.setBorder(null);
		button_impr.setBackground(Color.WHITE);
		button_impr.setBounds(6, 359, 123, 50);
		panel.add(button_impr);

		JButton button_exporter = new JButton("Exporter");
		button_exporter.setRolloverIcon(
				new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Data-Export-48-actif.png")));
		button_exporter
				.setIcon(new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Data-Export-48.png")));
		button_exporter.setForeground(Color.BLACK);
		button_exporter.setFocusable(false);
		button_exporter.setContentAreaFilled(false);
		button_exporter.setBorder(null);
		button_exporter.setBackground(Color.WHITE);
		button_exporter.setBounds(6, 415, 123, 54);
		panel.add(button_exporter);

		JButton btnSupprimer = new JButton("Supprimer");

		btnSupprimer.setRolloverIcon(
				new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Garbage-Open-48-actif.png")));
		btnSupprimer.setIcon(new ImageIcon(jfCommandesExist.class.getResource("/Images/gestion/Garbage-Open-48.png")));
		btnSupprimer.setForeground(Color.BLACK);
		btnSupprimer.setFocusable(false);
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setBorder(null);
		btnSupprimer.setBackground(Color.WHITE);
		btnSupprimer.setBounds(9, 90, 120, 64);
		if(Admin.isAdmin())
		panel.add(btnSupprimer);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(233, 11, 547, 529);
		contentPane.add(scrollPane);

		table = new JTable();
		Object[][] tableData = null;
		DefaultTableModel tblModel = new DefaultTableModel(tableData,
				new String[] { "id", "Ref", "Prix", "idC", "Client", "Date", "Reglement" }) {
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

		table.getColumn("idC").setMinWidth(0);
		table.getColumn("idC").setMaxWidth(0);

		scrollPane.setViewportView(table);

		ArrayList<Commande> listCom = commandeDao.SelectAllCommandes();
		int o = 0;
		for (Commande c : listCom) {

			tblModel.addRow(tableData);
			table.setValueAt(c.getIdCommande(), o, 0);
			table.setValueAt(c.getRef(), o, 1);
			table.setValueAt(c.getPrixHT(), o, 2);
			table.setValueAt(c.getIdClient(), o, 3);

			Client cli = clientDao.SelectClient(c.getIdClient());
			table.setValueAt((cli.getNom() + " " + cli.getPrenom()), o, 4);

			table.setValueAt(c.getDate().subSequence(0, 10), o, 5);
			table.setValueAt(c.getReglement(), o, 6);

			o++;

		}

		// ----------------------------------------------- TRAITEMENT DES EVENEMENTS
		// -----------------

		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int n = JOptionPane.showConfirmDialog(null,
						"Voulez-vous supprimer cet article? \nIl vous sera impossible de faire marche arrière.");

				if (n == 0) {

					int idCom = Integer.parseInt(tblModel.getValueAt(table.getSelectedRow(), 0).toString());
					artComDao.DeleteArtComFromIdCommande(idCom);

					if (commandeDao.DeleteCommande(idCom)) {

						tblModel.removeRow(table.getSelectedRow());
					}
					else {
						JOptionPane.showMessageDialog(null, "Impossible de supprimer cette commande. Contactez l'équipe de développement.");
					}

				}
			}
		});

	}
}
