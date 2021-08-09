package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class HREmplist {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		Statement stmt= null;
		ResultSet rs= null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn. DriverManager.getConnetion(dburl, "hr","hr");
			String sql= "SELECT emp.first_name || '' || emp.last_name as name,"
         + " mgr.first_name ||''|| mgr.last_name mgr_name"+
					"From employees emp, employees mgr"+
         "where emp.manager_id=mgr.employee_id"+
					"ORDER by name Desc";
			stmt= conn.createStatement();
			// 질의 수행
			rs= stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name= rs.getString("name");
				String mgrName= rs.getString("Mgr_name");
				
				System.out.printf("name:%s, Manager:%s%n" , name, mgrName);
				
			}
		} catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
         
	}

}
