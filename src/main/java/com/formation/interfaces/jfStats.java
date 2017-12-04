package com.formation.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class jfStats extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfStats frame = new jfStats();
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
	public jfStats() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		DefaultPieDataset pieDataset = new DefaultPieDataset();
	
	

		pieDataset.setValue("Valeur2", new Integer(10));

		pieDataset.setValue("Valeur3", new Integer(50));

		pieDataset.setValue("Valeur4", new Integer(5));

		 
	
		JFreeChart pieChart = ChartFactory.createPieChart("Test camembert",

		pieDataset, true, true, true);

		ChartPanel cPanel = new ChartPanel(pieChart);

		contentPane.add(cPanel); 
		
		
		
		
	}

}
