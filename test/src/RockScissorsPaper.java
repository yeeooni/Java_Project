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
		
		System.out.print("한판더(1), 종료(0) : ");
		int exit = Integer.parseInt(in.readLine());

		if(exit == 0){
			exit();
		} else comRandom();

	}


	public void exit(){

		System.out.println("프로그램을 종료합니다.");
		System.exit(0);

	}

	private void game(int my) throws Exception {
		
		int result = (my - com + 2) % 3;
		
			if( result == 0){//이겼다.
				System.out.println("나 : " + gbb(my) + " 컴퓨터는 : " + gbb(com) +  "\t 결과 : 이겼다.");
				}else if(result ==1){//졌다.
					System.out.println("나 : " + gbb(my) + " 컴퓨터는 : " + gbb(com) +  "\t 결과 : 졌다.");
				}else {//비겼다.
					System.out.println("나 : " + gbb(my)+ " 컴퓨터는 : " + gbb(com) +  "\t 결과 : 비겼다.");
				}
			
			menu();
	}

// 메소드 
	public String gbb(int num){
		String gbb = " ";
		if(num == 0){
			gbb = "가위.";
		}else if(num == 1 ){
			gbb = "바위.";
		}else{
			gbb = "보.";
		}

		return gbb;
	}
	
	public static void main(String[] args) throws Exception {
		
		//객체 생성
		RockScissorsPaper rocksScissorsPaper = new RockScissorsPaper();
		System.out.println("============컴퓨터와 가위 바위 보 한판 !!!================");
		while(true){
			System.out.print("가위 (0), 바위(1), 보(2) 선택하세요. : ");
			int my = Integer.parseInt(rocksScissorsPaper.in.readLine());
				//다른 숫자가 입력될 경우 출력 / 계속 진행 
				if(my > 2){
					System.out.println("가위 (0), 바위(1), 보(2)만 입력 가능합니다.");
					continue;
				}
			rocksScissorsPaper.game(my);
		}
	}	
}










