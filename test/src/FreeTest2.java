import java.io.*;

public class FreeTest2 {
	
	BufferedReader in;

	public FreeTest2() {
		in = new BufferedReader (new InputStreamReader (System.in));		
	}
	
	
	public void game(int my) throws Exception {

		while(true){
			System.out.println(" 0 1 2 �Է� : ");
			System.out.println("my ====" + my);
			if(my == 4){
				exit();
			}
		}

	}


		public void exit(){

					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
		}


	public static void main(String[] args) throws Exception {
		FreeTest2 t = new FreeTest2();
		t.game(0);
	}

}
