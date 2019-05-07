package com.kitri.loopTest;
// 가위바위보 게임
// 1. 가위 = 0, 바위 = 1, 보 = 2
// 2. 컴 : 난수 (0, 1, 2)
// 3. 결과 Logic (이김, 짐, 비김)
// 결과 출력 나 : 보, 컴 : 바위 결과는 : 이겼다.
// 나: 보, 컴 : 바위 비겼다.
// 나: 보, 컴 : 가위 졌다.

public class GBB {
	public static void main(String[] args) {
				
				
		String resultStr;

		int my = 1;
		int com = (int)(Math.random() * 3);
		int result = (my - com +2) % 3;
		
		
		if (result == 0){
				resultStr = "이겼다.";
		} else if (result == 1){
				resultStr = "졌다.";
		} else {
				resultStr = "비겼다.";
		}
			
	
			System.out.println("나 : " + my + " 컴퓨터: " + com + " 결과 : " + resultStr);
		
	}
}