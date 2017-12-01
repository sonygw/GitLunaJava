package com.formation.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class jfArticles extends JFrame {

	private JPanel contentPane;

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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBorder(null);
		btnNewButton.setFocusable(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(36, 255, 133, 42);
		panel.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setForeground(Color.BLACK);
		button.setFocusable(false);
		button.setContentAreaFilled(false);
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(36, 299, 133, 42);
		panel.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setForeground(Color.BLACK);
		button_1.setFocusable(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorder(null);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(36, 352, 133, 42);
		panel.add(button_1);
	}
}
