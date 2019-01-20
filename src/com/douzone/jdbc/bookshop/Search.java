package com.douzone.jdbc.bookshop;

import java.util.List;
import java.util.Scanner;

import com.douzone.jdbc.bookshop.dao.BookDao;
import com.douzone.jdbc.bookshop.dao.SearchDao;
import com.douzone.jdbc.bookshop.vo.BookVo;
import com.douzone.jdbc.bookshop.vo.SearchVo;

public class Search {

	public static void main(String[] args) {
		getListTest("Parto");
	}

	public static void getListTest(String name) {
		SearchVo vo = new SearchVo();
		vo.setFirst_name(name);
		vo.setLast_name(name);
		
		List<SearchVo> list = new SearchDao().getList(vo);
		for (SearchVo sv : list) {
			System.out.println("이름 : "+sv.getFirst_name()+" "+sv.getLast_name()+"\n 입사일 : "+sv.getHire_date());
			
		}
	}

}
