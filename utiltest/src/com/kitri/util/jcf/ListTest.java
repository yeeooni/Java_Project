package com.kitri.util.jcf;

import java.util.List;
import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("����Ʈ�� ũ��� : " + list.size());
		list.add("����");
		list.add("������");
		list.add("�ڰǿ�");
		list.add("����ȯ");
		System.out.println("����Ʈ�� ũ��� : " + list.size());

		System.out.println("===�λ��� Ÿ��===");

//		String name[] = list.toArray(new String[0]);
//		int len = name.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println(name[i]);
//		}
//		
//		int size = list.size();
//		for (int i = 0; i < size; i++) {
//			System.out.println(i + 1 + "��Ÿ�� " + list.get(i));
//		}
//		

		String name = "������";

		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "�� " + (i + 1) + " ��Ÿ���Դϴ�.");
				break;
			}
		}

		String name2 = "�����";

		System.out.println(name + "�� " + name2 + "���� ��ü");

		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
				list.set(i, name2);
				break;
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.println(i + 1 + "��Ÿ�� " + list.get(i));
		}

	}
}
