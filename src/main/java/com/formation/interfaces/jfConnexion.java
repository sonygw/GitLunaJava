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

		JLabel lblSarlLunaBienvenue = new JLabel("S.A.R.L LUNA \r\nBIENVENUE");
		lblSarlLunaBienvenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSarlLunaBienvenue.setBounds(111, 0, 261, 33);
		contentPane.add(lblSarlLunaBienvenue);

		login = new JTextField();
		login.setToolTipText("");
		login.setBounds(123, 97, 190, 20);
		contentPane.add(login);
		login.setColumns(10);

		motdepasse = new JPasswordField();
		motdepasse.setBounds(123, 140, 190, 20);
		contentPane.add(motdepasse);

		JButton btnConnexion = new JButton("Connexion");
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
		btnConnexion.setBounds(111, 199, 101, 23);
		contentPane.add(btnConnexion);

		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAnnuler.setBounds(222, 199, 101, 23);
		contentPane.add(btnAnnuler);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(28, 100, 49, 14);
		contentPane.add(lblLogin);

		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(29, 143, 84, 14);
		contentPane.add(lblMotDePasse);
	}
}
