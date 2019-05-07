package com.kitri.util.jcf;

import java.util.List;
import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("리스트의 크기는 : " + list.size());
		list.add("허경민");
		list.add("정수빈");
		list.add("박건우");
		list.add("김재환");
		System.out.println("리스트의 크기는 : " + list.size());

		System.out.println("===두산의 타순===");

//		String name[] = list.toArray(new String[0]);
//		int len = name.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println(name[i]);
//		}
//		
//		int size = list.size();
//		for (int i = 0; i < size; i++) {
//			System.out.println(i + 1 + "번타자 " + list.get(i));
//		}
//		

		String name = "정수빈";

		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "은 " + (i + 1) + " 번타자입니다.");
				break;
			}
		}

		String name2 = "오재원";

		System.out.println(name + "을 " + name2 + "으로 교체");

		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
				list.set(i, name2);
				break;
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.println(i + 1 + "번타자 " + list.get(i));
		}

	}
}
