package com.kitri.inheritanceTest;
import java.awt.*;

public class IsATest extends Frame {
	
	Button b = new Button("@Quit@");

	public IsATest(){
		super("Is A Test입니다.");
		//f.setTitle("Hs A Test입니다.");
		setLayout(new FlowLayout());
		add(b);
		setSize(400, 300);
		setLocation(300, 200);
		setVisible(true);
		//b.setLabel("Quit");
}

public static void main(String[] args){

	IsATest iat = new IsATest();
		
		}
}

