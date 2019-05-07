package com.kitri.loopTest;
public class Lotto {
	public static void main(String[] args) {

	System.out.println(" ======= LOTTO Program =======");

	System.out.println("");
		// do ~ while 문

			int num1 = (int) (Math.random() *45) +1;
			int num2 = (int) (Math.random() *45) +1;
			int num3 = (int) (Math.random() *45) +1;
			int num4 = (int) (Math.random() *45) +1;
			int num5 = (int) (Math.random() *45) +1;
			int num6 = (int) (Math.random() *45) +1;

		do{
			
			 num1 = (int) (Math.random() *45) +1;
			 num2 = (int) (Math.random() *45) +1;
			 num3 = (int) (Math.random() *45) +1;

			 num4 = (int) (Math.random() *45) +1;
			 num5 = (int) (Math.random() *45) +1;
			 num6 = (int) (Math.random() *45) +1;



		}
		while (num1 == num2 || num2 == num3 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 ||
				num2 == num4 || num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 ||
				 num4 == num5 || num4 == num6);


	System.out.println("오늘의 Lotto 당첨번호는 : " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);

		System.out.println("======================================");
	}
}


/*
int num1 = (int) (Math.random() * 3) + 1;
int num2 = 0;
int num3 = 0;


do{
	num2 = (int) (Math.random() * 3) + 1;
	} while(num1 == num2);

	do{
		num3 = (int) (Math.random() * 3) + 1;
		} while(num1 == num2 || num2 == num3);


		System.out.println("금주 당첨 번호 : " + num1 + " " + num2 + " " + num3);
*/