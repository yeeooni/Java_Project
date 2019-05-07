package com.kitri.util.jcf;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
//		Map<String, PlayerDto> map = new HashMap<String, PlayerDto>();
		Map<String, PlayerDto> map = new Hashtable<String, PlayerDto>();

		map.put("DS24", new PlayerDto(24, "�����", 4, 0.321));
		map.put("DS9", new PlayerDto(9, "�丣������", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "�ں�ȣ", 3, 0.431));
		map.put("HH19", new PlayerDto(19, "�丣������", 7, 0.321));

		int size = map.size();
		System.out.println("��� �ο� == " + size);
		
		int number = 24;
		System.out.println("�λ��� " + number + "���� ������ ���� !!");
		
		// get ������.
		PlayerDto playerDto = map.get("DS" + number);
		System.out.println(playerDto);
	}
}
