package com.kitri.loopTest;
public class WhileGugudan {
	public static void main(String[] args) {


			
		System.out.println(" ** 구구단 ** ");


		int dan = 1;
		int i = 1;
			
			while(dan < 9){
			
				++dan;
				System.out.print(dan + " * " + i + " = " + dan * i + " ");

					while(i < 9){
					++i;
					System.out.print(dan + " * " + i + " = " + dan * i + " ");
						
					}
								i = 1;
								System.out.println();
			} 
			
			
	/* 선생님 풀이과정
	
	int dan =2;
	while( dan < 10){
		int i =1;
		while( i < 10){
			System.out.printl(dan + " * " + i + " = " + dan * i " ");
			i++;
		}
	dan++;
	System.out.println();
	}
	
	*/





	}
}