package com.kitri.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;

	//view1 클래스의 변수를 선언하고 객체를 생성한다.
	View1 v1 = new View1();
	//view2 클래스의 변수를 선언하고 객체를 생성한다.
	View2 v2 = new View2();

	CardLayout cl_panel = new CardLayout();
	private JPanel panel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		super("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setLayout(cl_panel);

		// 패널에 v1, v2를 추가한다.
		panel.add("view1", v1);
		panel.add("view2", v2);
		cl_panel.show(panel, "view1");
		panel.setBounds(12, 72, 456, 513);
		contentPane.add(panel);

		b1 = new JButton("\uD654\uBA74 1");
		b1.setBounds(22, 10, 209, 52);
		contentPane.add(b1);

		b2 = new JButton("\uD654\uBA74 2");
		b2.setBounds(234, 10, 219, 52);
		contentPane.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == b1) {
			cl_panel.show(panel, "view1");
		} else if (ob == b2) {
			cl_panel.show(panel, "view2");
		}

	}

}
