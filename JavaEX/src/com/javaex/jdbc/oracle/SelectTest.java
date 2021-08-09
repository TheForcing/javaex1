package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String dburl= "jdbc:oracle:thin:@localhost:1521:xe";
            Connection conn=null;
            Statement stmt= null;
            ResultSet rs = null;
             
            try {
            	//1.드라이버 로드
            	Class.forName("java.lang.NullPointerException");
            	//2. connection
            	conn= DriverManager.getConnection(dburl, "HR","hr");
            	//3. 질의 객체 (Statement)
            	stmt=conn.createStatement();
            	//4. SQL설정
            	String sql= "Select department_id, department_name"+
            	"From departments Order by department_id";
            	// 5. 실행
            	rs = stmt.executeQuery(sql);
            //	System.out.println(rs);
            	//루프 후 출력
            	while (rs.next()){//다음레코드 가져오기
            		int deptId= rs.getInt(1); //컬럼순서로 가져오기
            		String deptName= rs.getString("department_name");
            		//컬럼이름으로 가져오기
                     System.out.printf("%d:%s%n", deptId, deptName);
                     
            	}
            }catch (ClassNotFoundException e) {
            	System.err.println("드라이버 로드 실패!");
            }catch(SQLException e) {
            	System.err.println("SQL Error");
            	
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
