public class FreeTest1 {
	public static void main(String[] args) {
	
int num = 20;			
int twocount = 0 ;
int threecount = 0;
int fivecount = 0;

			System.out.println(" �ݺ� Ƚ���� �Է��ϼ��� : " + num);

			for(int i = 1; i <=num; i++){
			
					System.out.print(i + ".");
					
					if(i % 2 == 0){
						System.out.print(" 2�ǹ��");
						twocount++;
					} 
					if(i % 3 == 0){
						System.out.print(" 3�ǹ��");
						threecount++;
					}
					if(i % 5 == 0){
						System.out.print(" 5�ǹ��");
						fivecount++;
					}

					System.out.print("\n");
				
				}
	
			
				System.out.println("===== ��� Ƚ�� =====");
				System.out.println(" 2�� ��� : " + twocount);
				System.out.println(" 3�� ��� : " + threecount);
				System.out.println(" 5�� ��� : " + fivecount);


	}
}
