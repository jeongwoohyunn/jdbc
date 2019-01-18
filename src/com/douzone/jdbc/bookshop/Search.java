package com.douzone.jdbc.bookshop;

import java.util.List;
import java.util.Scanner;

import com.douzone.jdbc.bookshop.dao.BookDao;
import com.douzone.jdbc.bookshop.dao.SearchDao;
import com.douzone.jdbc.bookshop.vo.BookVo;
import com.douzone.jdbc.bookshop.vo.SearchVo;

public class Search {

	public static void main(String[] args) {
		displayBookInfo();

		Scanner scanner = new Scanner(System.in);
		System.out.print("검색하고자 하는 사원의 성을 입력하세요.");
		String no = scanner.next();
		scanner.close();

		//search();
		displayBookInfo();
	}

//	private static void search() {
//		new SerachDao().select();
//	}

	private static void displayBookInfo() {
		System.out.println("*****사원 정보 출력하기******");
		List<SearchVo> list = new SearchDao().getList();
		for (SearchVo vo : list) {
			System.out.println("[" + vo.getFirst_name() +"     "+vo.getHire_date() +"]");

		}
	}

}
