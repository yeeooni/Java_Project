package com.kitri.array;

//Dto : Data Transfer Object
//Vo : value Object
//Bean
public class PlayerDto {

	private int number; // 등번호 pramary key
	private String name; // 선수 이름
	private int position; // 포지션은 숫자로 표기
	private double grade; // 선수 성적
	private String str[] = { "지명타자", "투수", "포수", "1루수", "2루수", "3루수", "유격수", "좌익수", "중견수", "우익수" };

	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getGrade() {
		return grade;

	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PlayerDto [등번호=" + number + " 선수명=" + name + " 포지션=" + str[position] + " "
				+ (position != 1 ? "타율 = " : "방어율 = ") + grade + "]";
	}

}