package com.kitri.loopTest;
public class ForTest1 {
	public static void main(String[] args) {
// 1 ~ 10 까지 출력중에  홀수만 


	/*	for (int i=1;i<11;i++ ){
			if(i % 2 !=0){
				System.out.pirntln(i);
			}
		} */
		
	for (int i=1; i<11; i+=2){
		System.out.println(i + " ");
	}

	


// 1 ~ 100까지 출력중에 10단위로 줄바꿈
	for (int i = 1; i<101; i++){
		System.out.print(i + " ");
		if(i % 10 == 0){
			System.out.println(" ");
		}
	
	}


	}

}


			
