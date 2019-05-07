package com.kitri.interfaceTest;
import java.awt.*;
import java.awt.event.*;

public class InterFaceTest extends Frame implements WindowListener, ActionListener{
	
	Button b = new Button("@Quit@");

	public InterFaceTest(){
		super("interface 입니다.");
		//f.setTitle("Hs A Test입니다.");
		setLayout(new FlowLayout());
		add(b);
		setSize(400, 300);
		setLocation(300, 200);
		setVisible(true);
		//b.setLabel("Quit");

		//WindowListener wl = new InterFaceTest();
		addWindowListener(this);
		b.addActionListener(this);

}

		public void windowDeactivated(WindowEvent e){}
		public void windowActivated(WindowEvent e){}
		public void windowDeiconified(WindowEvent e){}
		public void windowIconified(WindowEvent e){}
		public void windowClosed(WindowEvent e){}
		public void windowClosing(WindowEvent e){System.exit(0);}
		public void windowOpened(WindowEvent e){}
		
		public void actionPerformed(ActionEvent e){
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				setBackground(new Color(r,g,b));
				}
		

public static void main(String[] args){

	InterFaceTest iat = new InterFaceTest();
		
	}
}