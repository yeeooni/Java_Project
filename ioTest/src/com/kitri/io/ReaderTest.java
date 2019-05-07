package com.kitri.io;

import java.io.*;

public class ReaderTest {
	public static void main(String[] args) {
		Reader in = null; 
		try {
			in = new InputStreamReader(System.in);
			char c[] = new char[100];
			System.out.println("입력 : ");
			//문자열의 길이
			int x = in.read(c);
			System.out.println(" x == " + x);
			
			
			//char 배열에 있는 값 확인 
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			
			
			String str = new String(c, 0, x - 2);
			System.out.println(str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}