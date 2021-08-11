package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SalarySearchPrePare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dburl = "jtbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		ResultSet rs= null;
	    
		System.out.println("최소급여,최대급여:");
		int sal = scan.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn= DriverManager.getConnection(dburl, "Hr", "hr");
			
			String sql= "Selcet First_name ||''|| last_name, salary"+
			"From employees"+ "where between Max(salary) and Min(salary)";
			pstmt= conn.prepareStatement(sql);
	         pstmt.getInt(1.sal.Max());
	         pstmt.getInt(2.sal.Min());
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int maxsal= 
				
				
			}
		}
	    

	}

}
