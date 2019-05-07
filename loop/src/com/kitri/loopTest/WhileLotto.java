package com.kitri.loopTest;
/* 
첫번째 num1은 세가지 숫자가 다 나와도 상관없다.
두번째 num2는 num1과 같지 않으면 된다.
세번째 num3는 num1과 num2와 같지 않으면 된다.

int num1 = (int) (Math.random() * 3) + 1;
int num2 = 0;
int num3 = 0;

for(;;){
		num2 = (int) (Math.random() * 3) + 1;
		if(num1 != num2){
			break;
			}
		}

			for(;;){
				num3 = (int) (Math.random() * 3) + 1;
				if(num1 != num3 && num2 != num3){
					break;
					}
				} 
*/


// while 선 조건 후 실행

public class WhileLotto {
	public static void main(String[] args) {

				int num1 = (int) (Math.random() * 3) + 1; // 첫번째 1 ~ 3 까지 난수 발생
				int num2 = (int) (Math.random() * 3) + 1;
				int num3 = (int) (Math.random() * 3) + 1;		
		


		while(num1 == num2 || num2 == num3 || num1 == num3){

				 num1 = (int) (Math.random() * 3) + 1; // 첫번째 1 ~ 3 까지 난수 발생
				 num2 = (int) (Math.random() * 3) + 1;
				 num3 = (int) (Math.random() * 3) + 1;		
	
		}




		System.out.println(num1+ " " + num2 + " " + num3);
	}
}