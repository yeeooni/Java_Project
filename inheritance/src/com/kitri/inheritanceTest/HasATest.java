package com.kitri.inheritanceTest;
import java.awt.*;

public class HasATest {

	Frame f = new Frame("Hs A Test입니다.");
	Button b = new Button("@Quit@");

	public HasATest(){
		//f.setTitle("Hs A Test입니다.");
		f.setLayout(new FlowLayout());
		f.add(b);
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		//b.setLabel("Quit");
}

public static void main(String[] args){

	HasATest hat = new HasATest();

	}
}