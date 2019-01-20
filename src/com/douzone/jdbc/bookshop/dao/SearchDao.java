package com.douzone.jdbc.bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.douzone.jdbc.bookshop.Search;
import com.douzone.jdbc.bookshop.vo.SearchVo;

public class SearchDao {
	public List<SearchVo> getList(SearchVo vo) {
		List<SearchVo> list = new ArrayList<SearchVo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			// 3. Statement 객체를 생성
			stmt = conn.createStatement();
			// 4. SQL문 실행
			String sql = "select a.first_name" + ",a.last_name"
					+ ", a.hire_date from employees a where a.first_name = '" + SearchVo.getFirst_name()
					+ "' or a.last_name = +'" + SearchVo.getLast_name() + "'";
			rs = stmt.executeQuery(sql);
			// 5. 결과 가져오기
			while (rs.next()) {
				SearchVo sv = new SearchVo();

				String first_name = rs.getString(1);
				String last_name = rs.getString(2);
				String hire_date = rs.getString(3);

				sv.setFirst_name(first_name);
				sv.setLast_name(last_name);
				sv.setHire_date(hire_date);

				list.add(sv);
			}

			System.out.println("연결 성공");

		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		return list;

	}

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			// 1. JDBC Driver(MYSQL) 로딩
			Class.forName("com.mysql.jdbc.Driver");
			// pripertiy -> build path를 등록해줘야된다.
			// 2. 연결하기 ( jdbc:연결할database://ip:port/database이름 ) port번호는 생략가능하다.
			// url과 id와 password를 같이 입력해준다. (Connection 객체 얻어오기)
			String url = "jdbc:mysql://localhost:3306/employees";
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 : " + e);
		}
		return conn;
	}
}
