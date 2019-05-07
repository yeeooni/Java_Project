public class FreeTest1 {
	public static void main(String[] args) {
	
int num = 20;			
int twocount = 0 ;
int threecount = 0;
int fivecount = 0;

			System.out.println(" 반복 횟수를 입력하세요 : " + num);

			for(int i = 1; i <=num; i++){
			
					System.out.print(i + ".");
					
					if(i % 2 == 0){
						System.out.print(" 2의배수");
						twocount++;
					} 
					if(i % 3 == 0){
						System.out.print(" 3의배수");
						threecount++;
					}
					if(i % 5 == 0){
						System.out.print(" 5의배수");
						fivecount++;
					}

					System.out.print("\n");
				
				}
	
			
				System.out.println("===== 출력 횟수 =====");
				System.out.println(" 2의 배수 : " + twocount);
				System.out.println(" 3의 배수 : " + threecount);
				System.out.println(" 5의 배수 : " + fivecount);


	}
}
