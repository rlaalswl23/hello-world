package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample2 {
    public static void main(String args[]) {
    	
        // 1단계: DB 연결을 위한 커넥션 인터페이스
    	Connection conn = null;
    	// Statement 인터페이스 - SQL 실행.
    	Statement stmt = null;
    	// ResultSet 인터페이스 - SQL 결과를 저장.
    	ResultSet rs = null;
        // try ~ catch 문에서 DB연결 중에 예외가 발생하는지를 검사.
    	try {
    		String gcode = null;
    		String cname = null;
    		String price = null;
    		String maker = null;
        	// 2단계: JDBC드라이버를 로드한다.
            Class.forName("com.mysql.jdbc.Driver");
            // 3단계: 드라이버매니져 클래스는 getConnection메소드로 DB를 연결한다.
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/malldb", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
            
            //malldb  접속정보 ->
            //show processlist;
            //select now();
            // 커넥션 객체가 Statement 객체를 생성
            stmt = conn.createStatement();
            // DML SQL쿼리 실행 후 결과를 저장
            rs = stmt.executeQuery("select gcode,	cname,	price,	maker from goodsinfo");
            
            System.out.println("상품코드      상품명    가격   제조사");
            
            while(rs.next()) {
                
            	gcode = rs.getString(1); //rs.getString("jumincd");
            	cname   = rs.getString(2); //rs.getString("pname");
            	price  = rs.getString(3); //rs.getString("gender");
            	maker     = rs.getString(4);    //rs.getInt("age");
            
                System.out.println(gcode + "---" + cname + "----" + price + "-----" + maker);   
            }

            // 4단계: DB연결을 종료한다.
            conn.close();
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}