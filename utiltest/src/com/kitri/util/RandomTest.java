package com.kitri.util;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		boolean b = random.nextBoolean();
		System.out.println("b == " + b);

		// Math.random()�� ����.
		double d = random.nextDouble();
		System.out.println("d == " + d);

		int i = random.nextInt();
		System.out.println("i == " + i);

		// 0���� 256 ������
		i = random.nextInt(256);
		System.out.println("i == " + i);
	}
}
