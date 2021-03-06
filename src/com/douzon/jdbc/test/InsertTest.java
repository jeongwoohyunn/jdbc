package com.douzon.jdbc.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		boolean result = insert("띵이3","둘리","dog","f","2018-11-11",null);
		System.out.println(result);
	}

	public static boolean insert(String name, String owner, String birth, String species, String gendr, String death) {
		// 이런걸 보면 객체가 필요하다를 생각해야한다.
		Connection conn = null;
		Statement stmt = null;
		// 전부 try안에 들어가야된다.
		boolean result = false;
		try {
			// 1. JDBC Driver(MySQL) 로딩
			Class.forName("com.mysql.jdbc.Driver");

			// 2. 연결하기 (Connection 객체 얻어오기)
			String url = "jdbc:mysql://localhost:3306/webdb";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

			// 3. Statement 객체를 생성
			stmt = conn.createStatement();

			// 4. SQL문 실행 - //테스트를 한후 자바를 돌린다
			// 라이브러리 링크, 비밀번호, ';'붙이는 실수 세가지
			// sql문 떨어트려서 에러가남
			String sql = " insert into pet values( '" + name + "','" + owner + "','" + birth + "','"
					+ species + "','" + gendr + "',null)";
			int count = stmt.executeUpdate(sql);
			result = count == 1;
			// 5. 결과 가져오기

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
