package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
	public static void main(String[] args) {
//		첫 번째 '문자'의 아스키 코드값을 받는다.
		try {
//			System.out.print("입력 :");
//			int x = System.in.read();
//			System.out.println("1. x == " + x);

			// 읽어드린 byte를 출력한다. \n(2byte) \t(2byte) 까지 읽어드린다.
			System.out.print("입력2 :");
			byte b[] = new byte[100];
			int x = System.in.read(b);
			System.out.println("2. x == " + x);
			int len = b.length;
			for (int i = 0; i < len; i++) {
				System.out.println(b[i]);
			}

			// - 2 하는 이유는 엔터를 지워주기 위해서
			String s = new String(b, 0, x - 2);
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}