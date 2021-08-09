package com.javaex.jdbc.oracle;
//jdbc apI
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionTest {
	
  public static void main(String[ ] args) {
	  //DB접속 URL
	  String dburl= "jdbc:oracle:thin:@localhost:1521:xe";
	  String dbuser= "C##BITUSER";
	  String dbpass = "bituser";
	  
	  //접속
	  Connection conn = null;
	  try {
		  // 드라이버 로드
		  Class.forName("oracle.jdbc.driver.OracelDriver");
		  conn = DriverManager.getConnection(dburl, dbuser, dbpass);
		  
		  System.out.println(conn);
		  System.out.println("접속 성공!");
		  
	  } catch (ClassNotFoundException e) {
		  System.err.println("드라이버 로드 실패!");
		  
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }finally {
		  //자원 정리
		  try {
			  conn.close();
			  
		  }catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
  }

}
