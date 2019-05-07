package com.kitri.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//0. com, my 3자리 배열
//1. com 세자리수 난수 발생  처음 시작할 때 
//2. 조건 1의 숫자는 중복 숫자 X
//				0으로 시작하면 안됨 
//3. 내가 입력한 3자리 숫자를 my 배열에 넣기 
//4. com과 my의 숫자와 자릿수 비교
//5. 숫자가 같다면 
//	5-1 자릿수가 같다면 strike 증가
//		5-2 자릿수가 다르다면 ball 증가
//6. 5의 결과 중에서 
//	6-1 strike가 3 : xxx는 x번째만의 정답입니다.
//		계속(1), 종료(0) :
//			6-2 strike가 3이 아니라면 
//				1. xxx는 x스트라이크 x볼입니다. >>3번으로
public class NumberBaseBall {

	private int my[] = new int[3];
	private int com[] = new int[3];
	BufferedReader in;
	private int count = 0;
	private int strike = 0;
	private int ball = 0;

	public NumberBaseBall() {
//		my = new int[3];
//		com = new int[3];
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	private void comRandom() {// 난수 발생

		// 첫번째 숫자는 1~ 부터 9까지
		com[0] = (int) (Math.random() * 9) + 1;
		do {
			com[1] = (int) (Math.random() * 10);
		} while (com[0] == com[1]);

		do {
			com[2] = (int) (Math.random() * 10);
		} while (com[1] == com[2] && com[0] == com[3]);

	}

	private void game() throws NumberFormatException, IOException {// 무한 루프
		while (true) {
			strike = 0;
			ball = 0;
			count = 0; // 초기화가 
			System.out.println("숫자입력 : ");
			
			int myNum = getNumber();// 149

			my[0] = myNum / 100;
			my[1] = (myNum / 10) % 10;
			my[2] = myNum % 10;
//			실행자가 똑같은 숫자를 입력을 했다면 다시 입력해라 system.out.println("다시 입력하세요!");
//			if(my[0]
			System.out.println(com[0] + "" + com[1] + "" + com[2]);

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (my[i] == com[j]) {
						if (i == j) {
							strike++;
							System.out.println(myNum + "은 " + strike + "스트라이크 " + ball + " 볼입니다.");
						} else {
							ball++;
							System.out.println(myNum + "은 " + strike + "스트라이크 " + ball + " 볼입니다.");
						}
					}
				}
			}
//			count++;
			if (strike == 3) {
				count++;
				System.out.println(count + "번째 정답입니다.");

			}
		}
	}

	private void exit() throws Exception {
		for (;;) {
			System.out.println("계속하시겠습니까? 계속 (1) 종료(0)");
			int regame = getNumber();
			if (regame == 1) {
				comRandom();
				game();

			} else
				System.exit(0);
		}
	}

	@Override
	public String toString() {
		return "NumberBaseBall [my=" + Arrays.toString(my) + ", com=" + Arrays.toString(com) + "]";
	}

	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	public static void main(String[] args) throws Exception {

		NumberBaseBall nbb = new NumberBaseBall();
		nbb.game();
		nbb.exit();

	}

}