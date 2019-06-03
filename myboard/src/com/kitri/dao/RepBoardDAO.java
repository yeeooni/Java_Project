package com.kitri.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.dto.RepBoard;
import com.kitri.exception.AddException;

public class RepBoardDAO {

	public void insert(RepBoard repboard) throws AddException {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kitri", "kitri");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "INSERT INTO repboard("
				+ "	BOARD_SEQ, PARENT_SEQ, BOARD_SUBJECT, BOARD_WRITER, BOARD_CONTENTS, BOARD_DATE, BOARD_PASSWORD, BOARD_VIEWCOUNT) \n"
				+ "	VALUES(board_seq.nextval, ?, ?, ?, ? , systimestamp, ?, 0) \n";

		try {

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, repboard.getParent_seq());
			pstmt.setString(2, repboard.getBoard_subject());
			pstmt.setString(3, repboard.getBoard_writer());
			pstmt.setString(4, repboard.getBoard_contents());
			pstmt.setString(5, repboard.getBoard_password());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public List<RepBoard> selectByRows(int startRow, int endRow) {
		List<RepBoard> list = new ArrayList<RepBoard>();

		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * " + 
						"FROM(SELECT rownum r, repboard.* \n" + 
									"	FROM repboard \n"
				+ 					"	START WITH parent_seq = 0 \n" + 
									"	CONNECT BY PRIOR board_seq = parent_seq \n"
				+ 					"	ORDER SIBLINGS BY board_seq DESC) \n" 
				+ 		"WHERE r BETWEEN ? AND ? ");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kitri", "kitri");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RepBoard repBoard = new RepBoard();

				repBoard.setBoard_seq(rs.getInt("board_seq"));
				repBoard.setParent_seq(rs.getInt("parent_seq"));
				repBoard.setBoard_subject(rs.getString("board_subject"));
				repBoard.setBoard_writer(rs.getString("board_writer"));
				repBoard.setBoard_contents(rs.getString("board_contents"));
				repBoard.setBoard_date(rs.getTimestamp("board_date"));
				repBoard.setBoard_password(rs.getString("board_password"));
				repBoard.setBoard_viewcount(rs.getInt("board_viewcount"));

				list.add(repBoard);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
		}
		return list;
	}

	//
	public int selectTotalCnt() {
		
		int totalCnt = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kitri", "kitri");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "SELECT count(*) FROM repboard \n";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
				while(rs.next()) {
					totalCnt = rs.getInt(1);
				}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
		
		return totalCnt;
	}
	

	public static void main(String[] args) {
		RepBoardDAO repBoardDAO = new RepBoardDAO();
		
		// 셀렉문 테스트 
		for(RepBoard repBoard : repBoardDAO.selectByRows(1, 4)) {
			System.out.println(repBoard);
		}
		
		while (repBoardDAO.selectTotalCnt() != 0 ) {
			System.out.println("cnt= "  + repBoardDAO.selectTotalCnt());
			break;
		}
		/*
		 * RepBoardDAO dao = new RepBoardDAO(); RepBoard repBoard = new RepBoard();
		 * repBoard.setBoard_subject("게시판 제목"); repBoard.setBoard_writer("김의연");
		 * repBoard.setBoard_contents("테스트 내용"); repBoard.setBoard_password("1234"); try
		 * { dao.insert(repBoard); //글쓰기용 테스트입니다. } catch (AddException e) {
		 * e.printStackTrace(); }
		 */
	}

}
