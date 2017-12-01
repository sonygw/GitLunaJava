package com.formation.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		btnQuitter.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnQuitter.setForeground(Color.BLACK);
		btnQuitter.setBackground(Color.GRAY);
		btnQuitter.setBounds(10, 478, 203, 62);
		menu.add(btnQuitter);
		
		JLabel lblTitre = new JLabel("SARL LUNA");
		lblTitre.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitre.setBounds(10, 12, 203, 43);
		menu.add(lblTitre);
		
		JLabel lblAffichage = new JLabel("vide");
		lblAffichage.setBounds(10, 51, 99, 28);
		menu.add(lblAffichage);
		
		//UI.getLogo();
		
		JPanel corps = new JPanel();
		corps.setOpaque(false);
		corps.setBorder(null);
		corps.setBounds(221, 0, 573, 551);
		contentPane.add(corps);
		corps.setLayout(null);
		
		JButton btnCommandes = new JButton("");
		btnCommandes.setFocusable(false);
		btnCommandes.setOpaque(false);
		btnCommandes.setBackground(Color.WHITE);
		btnCommandes.setBorder(null);
		btnCommandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// todo nouvelle jframe
			}
		});
		btnCommandes.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Product-128-actif.png")));
		btnCommandes.setBounds(228, 51, 135, 135);
		corps.add(btnCommandes);
		
		JButton btnClients = new JButton("");
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
				
				//TODO nouvelle jframe
			}
		});
		btnClients.setFocusable(false);
		btnClients.setOpaque(false);
		btnClients.setBorder(null);
		btnClients.setBackground(Color.WHITE);
		btnClients.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/People-128-actif.png")));
		btnClients.setBounds(64, 209, 135, 135);
		corps.add(btnClients);
		
		JButton btnArticles = new JButton("");
		btnArticles.setFocusable(false);
		btnArticles.setBackground(Color.WHITE);
		btnArticles.setBorder(null);
		btnArticles.setOpaque(false);
		btnArticles.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Shopping-Bag-128-actif.png")));
		btnArticles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//todo nouvelle jframe
			}
		});
		btnArticles.setBounds(390, 209, 135, 135);
		corps.add(btnArticles);
		
		JButton btnParametres = new JButton("");
		btnParametres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// todo nouvelle Jframe
			}
		});
		btnParametres.setFocusable(false);
		btnParametres.setBorder(null);
		btnParametres.setOpaque(false);
		btnParametres.setBackground(Color.WHITE);
		btnParametres.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Settings-02-128-actif.png")));
		btnParametres.setBounds(228, 362, 135, 135);
		corps.add(btnParametres);
		
		JButton btnGraphs = new JButton("");
		btnGraphs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//todo nouvelle jframe
			}
		});
		btnGraphs.setOpaque(false);
		btnGraphs.setBackground(Color.WHITE);
		btnGraphs.setBorder(null);
		btnGraphs.setFocusable(false);
		btnGraphs.setIcon(new ImageIcon(jfAcceuil.class.getResource("/Images/accueil/Diagram-128-actif.png")));
		btnGraphs.setBounds(228, 209, 135, 135);
		corps.add(btnGraphs);
	}
}
