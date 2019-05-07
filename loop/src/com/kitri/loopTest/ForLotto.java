package com.kitri.loopTest;

/* lotto

1 ~ 3까지의 난수 서로다른 난수 발생.

*/

public class ForLotto {
	public static void main(String[] args){
		 
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;

	/*	int num1 = (int)(Math.random()* 3 + 1);
				int num2 = (int)(Math.random()* 3 + 1);
					int num3 = (int)(Math.random()* 3 + 1);


		for (;;){
			if( num1 == num2 || num1 == num3){
				 num1 = (int)(Math.random() * 3 + 1);		
			} else if ( num2 == num3){
				 num2 = (int)(Math.random() * 3 + 1);
			} else break;	
		}

		System.out.println("금주 당첨 번호 :" + num1 + " " + num2 + " " + num3);
	
	*/
	
	num1 = (int) (Math.random() * 3) + 1;


	for(;;) {
			if(num1 != num2){
			num2 = (int) (Math.random() * 3) + 1;
			}
	}
	
	/*for(;;) {
			if(num1 != num3) {
				num3 = (int)(Math.random() * 3) + 1;
			}
	}*/
	
	
	
	
	
	
	
	
	
	}
}


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