import java.io.*;

public class RockScissorsPaper {

	//field
	private int com;
	BufferedReader in;
	
	//Constructor
	public RockScissorsPaper() {
		in = new BufferedReader (new InputStreamReader (System.in));	
		comRandom();
	}

	// method 
	private void comRandom(){
	
		com = (int) (Math.random() * 3);
	
	}

	private void menu() throws Exception{
		
		System.out.print("���Ǵ�(1), ����(0) : ");
		int exit = Integer.parseInt(in.readLine());

		if(exit == 0){
			exit();
		} else comRandom();

	}


	public void exit(){

		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);

	}

	private void game(int my) throws Exception {
		
		int result = (my - com + 2) % 3;
		
			if( result == 0){//�̰��.
				System.out.println("�� : " + gbb(my) + " ��ǻ�ʹ� : " + gbb(com) +  "\t ��� : �̰��.");
				}else if(result ==1){//����.
					System.out.println("�� : " + gbb(my) + " ��ǻ�ʹ� : " + gbb(com) +  "\t ��� : ����.");
				}else {//����.
					System.out.println("�� : " + gbb(my)+ " ��ǻ�ʹ� : " + gbb(com) +  "\t ��� : ����.");
				}
			
			menu();
	}

// �޼ҵ� 
	public String gbb(int num){
		String gbb = " ";
		if(num == 0){
			gbb = "����.";
		}else if(num == 1 ){
			gbb = "����.";
		}else{
			gbb = "��.";
		}

		return gbb;
	}
	
	public static void main(String[] args) throws Exception {
		
		//��ü ����
		RockScissorsPaper rocksScissorsPaper = new RockScissorsPaper();
		System.out.println("============��ǻ�Ϳ� ���� ���� �� ���� !!!================");
		while(true){
			System.out.print("���� (0), ����(1), ��(2) �����ϼ���. : ");
			int my = Integer.parseInt(rocksScissorsPaper.in.readLine());
				//�ٸ� ���ڰ� �Էµ� ��� ��� / ��� ���� 
				if(my > 2){
					System.out.println("���� (0), ����(1), ��(2)�� �Է� �����մϴ�.");
					continue;
				}
			rocksScissorsPaper.game(my);
		}
	}	
}










