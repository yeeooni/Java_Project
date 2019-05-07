import java.awt.*;
import java.awt.event.*;


public class AbstractTest3 extends Frame {
	
	Button b = new Button("@Quit@");

	public AbstractTest3(){
		super("AbstractTest입니다.");
		//f.setTitle("Hs A Test입니다.");
		setLayout(new FlowLayout());
		add(b);
		setSize(400, 300);
		setLocation(300, 200);
		setVisible(true);
		//b.setLabel("Quit");

		WindowListener w1 = new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
				}

			public void widowIconified(WindowEvent e){
				System.out.println("아이콘화");
				}
		};
			addWindowListener(w1);
	}

public static void main(String[] args){

	AbstractTest3 iat = new AbstractTest3();
		
	}
}