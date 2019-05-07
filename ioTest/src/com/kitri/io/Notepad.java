package com.kitri.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Notepad extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenu file = new JMenu("\uD30C\uC77C");
	private JMenuItem exit = new JMenuItem("\uC885\uB8CC");
	private JMenuItem open = new JMenuItem("\uC5F4\uAE30");
	private JMenuItem save = new JMenuItem("\uC800\uC7A5");
	private JMenu help = new JMenu("\uB3C4\uC6C0\uB9D0");
	private final JTextArea editor = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad frame = new Notepad();
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
	public Notepad() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 461);

		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);

		mb.add(file);

		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);

		mb.add(help);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		contentPane.add(editor, BorderLayout.CENTER);

		file.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		Object ob = e.getSource();
		if (ob == exit) {
			System.exit(0);
		} else if (ob == open) {
			jfc.setCurrentDirectory(new File("E:\\javadata\\javasource"));
			jfc.showOpenDialog(this);

			BufferedReader fin = null;
			File file = jfc.getSelectedFile();
			if (file != null) {
				String infile = file.getPath();

				try {
					fin = new BufferedReader(new InputStreamReader(new FileInputStream(infile)));
					String str = null;
					editor.setText("");
					while ((str = fin.readLine()) != null) {
						editor.append(str);
						//System.out.println(fin);
					}

				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {

					e1.printStackTrace();
				}

			}
		} else if (ob == save) {
			jfc.showSaveDialog(this);
			
//			file = jfc.getSelectedFile();
//			String outfile = file.getp
			
		}

	}

}
