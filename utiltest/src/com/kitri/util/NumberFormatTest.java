package com.kitri.util;

import java.text.Format;
import java.text.DecimalFormat;

public class NumberFormatTest {
	public static void main(String[] args) {
		double number = 34563242365453.1263;
//	���ڸ����� , ��� .�Ҽ���

		Format f = new DecimalFormat("00,000,000,000,000.00");
		String num = f.format(number);
		System.out.println(num);

	}
}
