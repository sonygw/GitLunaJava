package com.formation.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import com.formation.utilitaires.Admin;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class jfAcceuil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfAcceuil frame = new jfAcceuil();
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
	public jfAcceuil() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(jfAcceuil.class.getResource("/Images/Moon-32.png")));
		setResizable(false);
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 596);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel menu = new JPanel();
		menu.setBackground(Color.GRAY);
		menu.setBounds(0, 0, 223, 551);
		contentPane.add(menu);
		menu.setLayout(null);

		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnQuitter.setPressedIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/gestion/Cancel-48-actif.png")));
		btnQuitter.setFocusable(false);
		btnQuitter.setContentAreaFilled(false);
		btnQuitter.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/gestion/Cancel-48.png")));
		btnQuitter.setBorder(null);
		btnQuitter.setForeground(Color.BLACK);
		btnQuitter.setBackground(Color.GRAY);
		btnQuitter.setBounds(10, 478, 123, 62);
		menu.add(btnQuitter);

		JLabel lblTitre = new JLabel("SARL LUNA");
		lblTitre.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitre.setBounds(10, 12, 203, 43);
		menu.add(lblTitre);

		JLabel lblAffichage = new JLabel("");
		lblAffichage.setBounds(10, 51, 189, 28);
		menu.add(lblAffichage);

		// UI.getLogo();

		JPanel corps = new JPanel();
		corps.setOpaque(false);
		corps.setBorder(null);
		corps.setBounds(221, 0, 573, 551);
		contentPane.add(corps);
		corps.setLayout(null);

		JButton btnArticles = new JButton("");
		btnArticles
				.setRolloverIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Product-128-actif.png")));
		btnArticles.setContentAreaFilled(false);
		btnArticles.setFocusable(false);
		btnArticles.setOpaque(false);
		btnArticles.setBackground(Color.WHITE);
		btnArticles.setBorder(null);
		btnArticles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jfArticles frame = new jfArticles();
				frame.setVisible(true);
			}
		});
		btnArticles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAffichage.setText("Gestion Articles");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAffichage.setText("");
			}
		});

		btnArticles.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Product-128.png")));
		btnArticles.setBounds(228, 51, 135, 135);
		corps.add(btnArticles);

		JButton btnClients = new JButton("");
		btnClients.setRolloverIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/People-128-actif.png")));
		btnClients.setContentAreaFilled(false);
		btnClients.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAffichage.setText("Gestion Clients");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAffichage.setText("");
			}
		});

		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jfClients fen = new jfClients();
				fen.setVisible(true);

			}
		});
		btnClients.setFocusable(false);
		btnClients.setOpaque(false);
		btnClients.setBorder(null);
		btnClients.setBackground(Color.WHITE);
		btnClients.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/People-128.png")));
		btnClients.setBounds(64, 209, 135, 135);
		corps.add(btnClients);

		JButton btnCommandes = new JButton("");
		btnCommandes.setRolloverIcon(
				new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Shopping-Bag-128-actif.png")));
		btnCommandes.setContentAreaFilled(false);
		btnCommandes.setFocusable(false);
		btnCommandes.setBackground(Color.WHITE);
		btnCommandes.setBorder(null);
		btnCommandes.setOpaque(false);
		btnCommandes.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Shopping-Bag-128.png")));
		btnCommandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jfCommandes frame = new jfCommandes();
				frame.setVisible(true);
			}
		});

		btnCommandes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAffichage.setText("Gestion Commandes");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAffichage.setText("");
			}
		});

		btnCommandes.setBounds(390, 209, 135, 135);
		corps.add(btnCommandes);

		JButton btnParametres = new JButton("");
		btnParametres.setRolloverIcon(
				new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Settings-02-128-actif.png")));
		btnParametres.setContentAreaFilled(false);
		btnParametres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jfParam frame = new jfParam();
				frame.setVisible(true);

			}
		});

		btnParametres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAffichage.setText("Paramètres");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAffichage.setText("");
			}
		});

		btnParametres.setFocusable(false);
		btnParametres.setBorder(null);
		btnParametres.setOpaque(false);
		btnParametres.setBackground(Color.WHITE);
		btnParametres.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Settings-02-128.png")));
		btnParametres.setBounds(228, 362, 135, 135);
		corps.add(btnParametres);

		JButton btnGraphs = new JButton("");
		btnGraphs.setRolloverIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Diagram-128-actif.png")));
		btnGraphs.setContentAreaFilled(false);
		btnGraphs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Pas encore implementé");
			}
		});

		btnGraphs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAffichage.setText("Statistiques");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAffichage.setText("");
			}
		});

		btnGraphs.setOpaque(false);
		btnGraphs.setBackground(Color.WHITE);
		btnGraphs.setBorder(null);
		btnGraphs.setFocusable(false);
		btnGraphs.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Diagram-128.png")));
		btnGraphs.setBounds(228, 209, 135, 135);
		
		if(Admin.isAdmin())
		corps.add(btnGraphs);
	}
}
