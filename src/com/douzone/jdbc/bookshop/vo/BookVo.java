package com.douzone.jdbc.bookshop.vo;

public class BookVo {
	private long no;
	private String title;
	private String status;
	private long authorNo;//북을 insert할때
	private String AuthorName;//출력
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(long authorNo) {
		this.authorNo = authorNo;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", status=" + status + ", authorNo=" + authorNo
				+ ", AuthorName=" + AuthorName + "]";
	}

}
