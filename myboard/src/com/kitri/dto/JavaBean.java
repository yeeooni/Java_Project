package com.kitri.dto;

import java.util.List;

public class JavaBean {

	private int cntPerPage = 10; // 페이지별 보여줄 목록 수
	private int startRow = 1; // 시작 행
	private int endRow = 1; // 끝 행
	private List<RepBoard> list; // 목록
	private int totalPage = 1; // 총 페이지 수
	private int totalCnt; // 총 게시글 수
	private int cntPerPageGroup = 3; // 페이지 그룹에 보여줄 페이지
	private int startPage; // 페이지 그룹의 시작 페이지
	private int endPage; // 페이지 그룹의 끝 페이지
	private String url; // 페이지 링크 클릭시 요청할 url
	private int currentPage; // 현재 페이지

	public JavaBean() {

	}

	public JavaBean(int cntPerPage, int totalCnt, int cntPerPageGroup, int currentPage,  String url) {
		super();
		this.cntPerPage = cntPerPage;
		this.totalCnt = totalCnt;
		this.cntPerPageGroup = cntPerPageGroup;
		this.url = url;
		this.currentPage = currentPage;
		excute(); // 객체가 생성되자마자 모든페이지가 계산된다.
	}

	public void excute() {
		startRow = (currentPage - 1) * cntPerPage + 1;
		endRow = currentPage * cntPerPage;

		startPage = (currentPage - 1) * cntPerPageGroup + 1;
		endPage = startPage * cntPerPageGroup;

		if (endPage > totalPage) {
			endPage = totalPage;
		}
	}

	public int getCntPerPage() {
		return cntPerPage;
	}

	public void setCntPerPage(int cntPerPage) {
		this.cntPerPage = cntPerPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public List<RepBoard> getList() {
		return list;
	}

	public void setList(List<RepBoard> list) {
		this.list = list;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public int getCntPerPageGroup() {
		return cntPerPageGroup;
	}

	public void setCntPerPageGroup(int cntPerPageGroup) {
		this.cntPerPageGroup = cntPerPageGroup;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

}
