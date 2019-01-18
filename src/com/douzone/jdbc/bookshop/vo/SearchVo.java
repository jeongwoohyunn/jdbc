package com.douzone.jdbc.bookshop.vo;

public class SearchVo {
	private String first_name;
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	private String hire_date;

	@Override
	public String toString() {
		return "SearchDao [first_name=" + first_name + ", hire_date=" + hire_date + "]";
	}
}
