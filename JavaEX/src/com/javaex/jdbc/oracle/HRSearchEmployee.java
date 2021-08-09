package com.javaex.jdbc.oracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployee {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		Statement stmt= null;
		ResultSet rs= null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn.DriverManager.getConnetion(dburl, "hr","hr");
			String sql= "Select first_name ||''|| last_name as name, Phone_number, hire_date, email"
					+"From employees"
					+ 	"Where lower(first_name) likt % + last_name like (%%)";
			conn.createStatement()
		}

	}

}
