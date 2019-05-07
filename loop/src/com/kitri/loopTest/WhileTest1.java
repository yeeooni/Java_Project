package com.kitri.loopTest;
public class WhileTest1 {
	public static void main(String[] args) {

		System.out.println("===1 ~ 10까지 출력.===");

		int i = 0;

			while(i < 10 ){

				System.out.println(++i);

			}

		//while문
			System.out.println("====1 ~ 10까지 수중 난수 발생.====");
			boolean flag = true;
			int countWhile = 0; //while문이 도는 개수


			while(flag){

				countWhile++;
				int num1 = (int)(Math.random() * 11); //0 ~ 11
				if(num1 != 0){
				System.out.println(num1);
				} else {
					System.out.println("0이 발생" + "("+ countWhile + "번째)되어 프로그램 종료!!!!");
					flag = false;
				}
			}

				
			
			

	}
}