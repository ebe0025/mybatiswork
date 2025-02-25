package com.study.mybatis.common.vo;

public class PageInfo {
	private int totalRecord;	// 전체 레코드 수(board테이블의 전체 행의 수)
	private int nowPage;		// 현재 해당하는 페이지
	private int numPerPage;	// 1page에 보여줄 레코드 수
	private int pagePerBlock;	// 블록당 페이지 수 = [1][2][3][4][5] 
	
	// 위의 4개를 가지고 계산		
	private int totalPage;	// 전체 페이지 : 레코드수 67개라면, totalPage=7  [1][2][3][4][5][6][7]
	private int startPage;	// 페이징바의 시작 수
	private int endPage;	// 페이징바의 끝수
	
	public PageInfo() {
	}

	public PageInfo(int totalRecord, int nowPage, int numPerPage, int pagePerBlock, int totalPage, int startPage,
			int endPage) {
		super();
		this.totalRecord = totalRecord;
		this.nowPage = nowPage;
		this.pagePerBlock = pagePerBlock;
		this.numPerPage = numPerPage;
		this.totalPage = totalPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getPagePerBlock() {
		return pagePerBlock;
	}

	public void setPagePerBlock(int pagePerBlock) {
		this.pagePerBlock = pagePerBlock;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
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

	@Override
	public String toString() {
		return "PageInfo [totalRecord=" + totalRecord + ", nowPage=" + nowPage + ", numPerPage=" + numPerPage
				+ ", pagePerBlock=" + pagePerBlock + ", totalPage=" + totalPage + ", startPage=" + startPage
				+ ", endPage=" + endPage + "]";
	}

	

	
	
}
