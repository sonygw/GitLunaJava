package com.formation.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formation.DAO.UserDAOSQL;
import com.formation.model.User;
import com.formation.utilitaires.ConnexionJDBC;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class jfConnexion extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JPasswordField motdepasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfConnexion frame = new jfConnexion();
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
	public jfConnexion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(jfConnexion.class.getResource("/Images/Moon-32.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSarlLunaBienvenue = new JLabel("Connexion au programme");
		lblSarlLunaBienvenue.setIcon(new ImageIcon(jfConnexion.class.getResource("/Images/connection/Shopping-Cart-05-48.png")));
		lblSarlLunaBienvenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSarlLunaBienvenue.setBounds(68, 0, 304, 33);
		contentPane.add(lblSarlLunaBienvenue);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(30, 42, 384, 206);
		contentPane.add(panel);
		panel.setLayout(null);
		
				JLabel lblLogin = new JLabel("Login");
				lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
				lblLogin.setIcon(new ImageIcon(jfConnexion.class.getResource("/Images/connection/Windows-8-Login-16.png")));
				lblLogin.setBounds(10, 34, 83, 25);
				panel.add(lblLogin);
				
						login = new JTextField();
						login.setBounds(103, 36, 227, 20);
						panel.add(login);
						login.setToolTipText("");
						login.setColumns(10);
						
								motdepasse = new JPasswordField();
								motdepasse.setBounds(103, 67, 227, 20);
								panel.add(motdepasse);
								
										JLabel lblMotDePasse = new JLabel("Mot de passe");
										lblMotDePasse.setIcon(new ImageIcon(jfConnexion.class.getResource("/Images/connection/Key-16.png")));
										lblMotDePasse.setBounds(10, 64, 84, 25);
										panel.add(lblMotDePasse);
										
												JButton btnAnnuler = new JButton("Annuler");
												btnAnnuler.setContentAreaFilled(false);
												btnAnnuler.setFocusable(false);
												btnAnnuler.setPressedIcon(new ImageIcon(jfConnexion.class.getResource("/Images/connection/Stop-48-actif.png")));
												btnAnnuler.setBorder(null);
												btnAnnuler.setBackground(Color.LIGHT_GRAY);
												btnAnnuler.setIcon(new ImageIcon(jfConnexion.class.getResource("/Images/connection/Stop-48.png")));
												btnAnnuler.setBounds(30, 142, 139, 48);
												panel.add(btnAnnuler);
												
														JButton btnConnexion = new JButton("Connexion");
														btnConnexion.setPressedIcon(new ImageIcon(jfConnexion.class.getResource("/Images/connection/Power-48-actif.png")));
														btnConnexion.setContentAreaFilled(false);
														btnConnexion.setFocusable(false);
														btnConnexion.setBorder(null);
														btnConnexion.setBackground(Color.LIGHT_GRAY);
														btnConnexion.setIcon(new ImageIcon(jfConnexion.class.getResource("/Images/connection/Power-48.png")));
														btnConnexion.setBounds(185, 137, 159, 58);
														panel.add(btnConnexion);
														btnConnexion.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {

																String str = login.getText();
																char[] s = motdepasse.getPassword();
																String pass = new String(s);

																UserDAOSQL user = new UserDAOSQL(ConnexionJDBC.getInstance());

																ArrayList<User> list = user.SelectAllUsers();
																boolean b = false;
																for (int i = 0; i < list.size(); i++) {
																	if (str.equals(list.get(i).getLogin())) {
																		if (pass.equals(list.get(i).getMotDePasse()))

																		{

																			jfAcceuil accueil = new jfAcceuil();
																			accueil.setVisible(true);
																			dispose();
																			b = true;
																			// System.out.println("Ok");
																		}
																	}

																}
																if (!b) {
																	JOptionPane.showMessageDialog(null, "Identifiant ou mot de passe incorrect", "Erreur",
																			JOptionPane.ERROR_MESSAGE);
																}
															}
														});
												btnAnnuler.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														dispose();
													}
												});
	}
}
