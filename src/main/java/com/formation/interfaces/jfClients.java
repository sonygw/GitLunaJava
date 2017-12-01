package com.formation.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Checkbox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import java.awt.Dimension;

public class jfClients extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfClients frame = new jfClients();
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
	public jfClients() {
		setMinimumSize(new Dimension(800, 600));
		setResizable(false);
		setTitle("Gestion des Clients");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(jfClients.class.getResource("/Images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 658, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 628, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 395, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
//		
//		jpClients cli = new jpClients();
//	cli.setBounds(0, 0, 700, 600);      //ajout de JPanel dans JFrame
//	getContentPane().add(cli);
	
	}
}
