package com.kitri.project.user;

public class UserDto {

	private int user_code; // 유저코드
	private String name; // 이름
	private String id; // 아이디

	public int getUserCode() {
		return user_code;
	}

	public void setUserCode(int userCode) {
		this.user_code = userCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	private String pw; // 패스워드
	private String authority; // 권한

}
