package com.kitri.array;

public class PlayerTeam {
	public static void main(String[] args) {

		PlayerDto player [] = new PlayerDto [5];
		
		PlayerDto p1 = new PlayerDto(24, "오재원", 4, 0.321);
		PlayerDto p2 = new PlayerDto(13, "허경민", 5, 0.351);
		PlayerDto p3 = new PlayerDto(34, "린드블럼", 1, 0.001);
		PlayerDto p4 = new PlayerDto(9, "페르난데스", 3, 0.421);
		PlayerDto p5 = new PlayerDto(38, "김대한", 7, 0.384);
		
		
		player[0] = p1;
		player[1] = p2;
		player[2] = p3;
		player[3] = p4;
		player[4] = p5;
			
		
//		포지션 바꾸기 4번이면:2루수 / 5번이면: 3루수
//		린드블럼은 방어율 grade
		int len = player.length;
		for (int i = 0; i < len; i++) {
				
			System.out.println(player[i]);
		}
	
	
	}
}
		
	