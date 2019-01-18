package com.douzone.jdbc.bookshop.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.jdbc.bookshop.dao.AuthorDao;
import com.douzone.jdbc.bookshop.vo.AuthorVo;
public class AuthorDaoTest {

	public static void main(String[] args) {
//		insertTest("스테파니메이어");
//		insertTest("조정래");
		getListTest();
	}

	
	public static void insertTest(String name ) {
		AuthorVo vo = new AuthorVo();
		vo.setName(name);
		vo.setBio("");
		new AuthorDao().insert(vo);
	}
	
	public static void getListTest() {//리스트 가져와서 보여주다.for문에 넣고 돌려서
		List<AuthorVo> list = new AuthorDao().getList();
		for(AuthorVo vo : list) {
			System.out.println(vo);
		}
	}
}