package com.kitri.test;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class View2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public View2() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 432, 369);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JRadioButton radioButton = new JRadioButton("");
		panel.add(radioButton, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 389, 432, 114);
		add(panel_1);
		panel_1.setLayout(new GridLayout(1, 5, 0, 0));
		
		JButton btnNewButton = new JButton("\uC0C8\uAC8C\uC784");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("\uCE5C\uAD6C\uB791 \uAC19\uC774");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("\uD63C\uC790");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\uC885\uB8CC");
		panel_1.add(btnNewButton_1);

	}
}
