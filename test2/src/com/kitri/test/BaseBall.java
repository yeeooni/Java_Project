package com.kitri.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class BaseBall extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseBall frame = new BaseBall();
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
	public BaseBall() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC785\uB825");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(3, 416, 63, 18);
		contentPane.add(label);
		
		tf = new JTextField();
		tf.setBounds(78, 412, 279, 27);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(358, 10, 79, 396);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton 새게임 = new JButton("\uC0C8\uAC8C\uC784");
		새게임.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		새게임.setForeground(Color.MAGENTA);
		panel.add(새게임);
		
		JButton 지우기 = new JButton("\uC9C0\uC6B0\uAE30");
		panel.add(지우기);
		
		JButton 정답 = new JButton("\uC815\uB2F5");
		panel.add(정답);
		
		JButton 글자색 = new JButton("\uAE00\uC790\uC0C9");
		panel.add(글자색);
		
		JButton 종료 = new JButton("\uC885\uB8CC");
		종료.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(종료);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 345, 396);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
