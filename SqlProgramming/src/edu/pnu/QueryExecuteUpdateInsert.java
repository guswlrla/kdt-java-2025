package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class QueryExecuteUpdateInsert {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb", "scott", "tiger");
			
			String name = "홍길동";
			String mobile = "010-1111-1111";
			
			String sql = "insert into phonebook(name, mobile) values(?, ?)";
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, mobile);
			psmt.executeUpdate();
			
		} catch(Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		} finally {
			try {
				if (con != null) con.close();
			} catch(Exception e) {
				System.out.println("오류 : " + e.getMessage());
			}
		}
		
		
		
		
	}
}
