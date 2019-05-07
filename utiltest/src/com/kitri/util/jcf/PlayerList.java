package com.kitri.util.jcf;

import java.util.*;

public class PlayerList {

//	List<PlayerDto> list = new ArrayList<PlayerDto>();
	List<PlayerDto> list = new Vector<PlayerDto>();

	private void playerRegister(PlayerDto playerDto) {
		list.add(playerDto);
	}

	private void playerList() {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}

	}

	private PlayerDto playerSearch(int number) {
		PlayerDto playerDto = null;

		int size = list.size();

		for (int i = 0; i < size; i++) {
			PlayerDto dto = list.get(i);
			if (number == dto.getNumber()) {
				playerDto = dto;
				break;
			}
		}

		return playerDto;
	}

	private void playerInfo(PlayerDto playerDto) {

		if (playerDto != null)
			System.out.println(playerDto);
		else
			System.out.println("선수는 없습니다.");
	}

	public static void main(String[] args) {
		PlayerList p1 = new PlayerList();

		p1.playerRegister(new PlayerDto(24, "오재원", 4, 0.321));
		p1.playerRegister(new PlayerDto(13, "허경민", 5, 0.351));
		p1.playerRegister(new PlayerDto(34, "린드블럼", 1, 0.001));
		p1.playerRegister(new PlayerDto(9, "페르난데스", 3, 0.421));
		p1.playerRegister(new PlayerDto(38, "김대한", 7, 0.384));

		p1.playerList();

		int number = 38;

		System.out.println(number + "번 선수 정보!!");
		PlayerDto playerDto = p1.playerSearch(number);
		p1.playerInfo(playerDto);

		number = 13;
		
		double score = 0.357;
		System.out.println(number + "번 선수가 안타!! 타율이 " + score + "로 변경");
		playerDto = p1.playerSearch(number);
		p1.playerInfo(playerDto);
		playerDto.setGrade(score);
		p1.playerInfo(playerDto);
		
	}

}
