package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;

	public Book(int bookNo, String title, String author) {
		// 생성자 void x
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	private int stateCode;

	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됬습니다.");
	}

	public void print() {
		System.out.println("책 제목 : " + title + ", 작가 : " + author + ", 대여 유무 : " + (stateCode == 1 ? "재고있음" : "대여중")
		// 삼항연산자
		//syso 안에서 조건줄떄 삼항연산
		/*
		 * ( if(stateCode ==1) { "재고있음" } else { "대여중" } )
		 */
		);
	}
}