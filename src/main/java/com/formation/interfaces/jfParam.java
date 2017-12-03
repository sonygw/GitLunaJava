package com.formation.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class jfParam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfParam frame = new jfParam();
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
	public jfParam() {
		setTitle("\u00C0 propos");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(jfParam.class.getResource("/Images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationDveloppePar = new JLabel("<html><center> Application d\u00E9velopp\u00E9e par : <br>\r\nZybura Louis <br>\r\nArenas Daniel");
		lblApplicationDveloppePar.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationDveloppePar.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblApplicationDveloppePar.setBounds(23, 28, 385, 210);
		contentPane.add(lblApplicationDveloppePar);
	}
}
