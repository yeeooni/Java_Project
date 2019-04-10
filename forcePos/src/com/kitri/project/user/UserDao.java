package com.kitri.project.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


//데이터베이스에 접근하는 객체 DAO

public class UserDao {

	//회원리스트 클래스
	MemberList mList;
	
	//DB연결시 필요 
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	
	
	//기본생성자
	public UserDao() {
		
	}
	//
	public UserDao(MemberList mList) {
		this.mList = mList;
	}
	//리스트에 담은 값들을 얻어온다.
	//회원 검색 
	public Vector getMemberList() {
		
		Vector data = new Vector(); //Jtable에 넣을 값 //유저코드, 이름, 분류
		
		Connection con = null; //연결
		PreparedStatement ps = null; //명령
		ResultSet rs = null; //결과
		
		con = getConnection();
		
		String select = "select *" +
						"from members"+
						"order by name asc";
		try {
			ps = con.prepareStatement(select);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int user_code = rs.getInt(1);
				String name = rs.getString(2);
				String id = rs.getString(3);
				String pw = rs.getString(4);
				String authority = rs.getNString(5);
				
				Vector row = new Vector();
				
				row.add(user_code);
				row.add(name);
				row.add(id);
				row.add(pw);
				row.add(authority);
				
				data.add(row);
					
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return data;
	}
	
	//회원수
	public boolean updateMember(UserDto dto) {
		boolean result = false;
		
		Connection con = null;
		PreparedStatement ps = null;
		
		con = getConnection();
		String update = "update members set name= ?, pw= ?" +
						"where id = ? and pw = ?";
	
		try {
			ps = con.prepareStatement(update);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getPw());
			
			int r = ps.executeUpdate();
			
			if (r > 0 ) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//회원정보삭제
	public boolean deleteMember(String id, String pw) {
		boolean result = false;
		Connection con = null;
		PreparedStatement ps = null;
		
		con = getConnection();
		String delete = "delete" +
						"from members " +
						"where id = ? and pw = ?";
		
		try {
			ps = con.prepareStatement(delete);
			ps.setString(1, id);
			ps.setString(2, pw);

			int r = ps.executeUpdate();

			if(r > 0 ) {
				result = true;
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	//회원등록
	public boolean insertMember(UserDto dto) {
		boolean result = false;
		
		Connection con = null;
		PreparedStatement ps = null;
		
		con = getConnection();
		String insert = "insert into members(" +
						"user_code, name, id, pw" +
						") values(?, ?, ?, ?)";		
		try {
			ps = con.prepareStatement(insert);
			
			ps.setInt(1, dto.getUserCode());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getId());
			ps.setString(4, dto.getPw());
			ps.setString(5, dto.getAuthority());
			
			int r = ps.executeUpdate(); //실행 >> 저장
			
			if (r > 0 ) {
				System.out.println("회원가입 성공 ");
				result = true;
			} else	{
				System.out.println("회원가입 실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	

		//innerClass "DB 연결하는중..."
	public Connection getConnection() {
		
		String user = "kitri";
		String pw = "kitri";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				con = DriverManager.getConnection(url, user, pw);
				System.out.println("DB연결 성공했습니다.");
			} catch (SQLException e) {
				System.out.println("DB연결 실패했습니다.");
				e.printStackTrace();
			}
			
				
		} catch (ClassNotFoundException e) {
			System.out.println("알수없음.");
			e.printStackTrace();
		}
		return con;
	}
	
}
