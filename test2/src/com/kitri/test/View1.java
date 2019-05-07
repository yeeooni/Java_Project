package com.kitri.test;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;

public class View1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public View1() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 20, 432, 326);
		add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 356, 432, 147);
		add(panel);
		panel.setLayout(new GridLayout(1, 4, 0, 0));
		
		JButton btnNewButton = new JButton("\uCE5C\uAD6C \uCC3E\uAE30");
		btnNewButton.setBorder(new LineBorder(Color.ORANGE, 5));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCE5C\uAD6C \uBAA9\uB85D");
		btnNewButton_1.setBackground(UIManager.getColor("Button.foreground"));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 255), new Color(100, 100, 100), new Color(138, 43, 226), SystemColor.textHighlight));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC804 \uC1A1");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setForeground(new Color(255, 255, 0));
		btnNewButton_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC885 \uB8CC");
		btnNewButton_3.setBackground(Color.PINK);
		panel.add(btnNewButton_3);

	}

}
