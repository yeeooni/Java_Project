package com.kitri.service;

import java.util.List;

import com.kitri.dao.RepBoardDAO;
import com.kitri.dto.RepBoard;
import com.kitri.exception.AddException;

public class RepBoardService {

	private RepBoardDAO dao;
	
	public RepBoardService() {
		dao = new RepBoardDAO();
	}
	
	public void writer(RepBoard repBoard) {
		try {
			dao.insert(repBoard);
		} catch (AddException e) {
			e.printStackTrace();
		}
	}
	public void reply(RepBoard repBoard) {
		try {
			if(repBoard.getParent_seq() == 0) {
				throw new AddException("부모글번호가 없는 답글입니다. ");
			}
			dao.insert(repBoard);
		} catch (AddException e) {
			e.printStackTrace();
		}
	}
	
	public List<RepBoard> findByRows(int startRow, int endRow){
		return dao.selectByRows(startRow, endRow);
	}

	public int getTotalCnt() {
		
		return dao.selectTotalCnt();
	}

	
}
