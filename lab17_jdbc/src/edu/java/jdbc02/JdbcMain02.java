package edu.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import static edu.java.ojdbc.OracleJdbc.*;
import static edu.java.ojdbc.model.Blog.Entity.*;

public class JdbcMain02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // 라이브러리 관리자에게 오라클 라이브러리를 등록 - 메모리 로딩
            DriverManager.registerDriver(new OracleDriver());
            
            // 라이브러리 관리자를 이용해서 데이터 베이스와 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // SQL 문장 - insert
            
            String sql = String.format("insert into %s (%s, %s, %s) values (?, ?, ?)", TBL_BLOGS, COL_TITLE, COL_CONTENT, COL_AUTHOR);
            System.out.println(sql);
            
            stmt = conn.prepareStatement(sql);
            
            System.out.println("제목 입력 > ");
            String title = sc.nextLine();
            System.out.println("내용 입력 > ");
            String content = sc.nextLine();
            System.out.println("작성자 > ");
            String author = sc.nextLine();
            
            // PreparedStatement 객체에 입력받은 값들을 설정
            stmt.setString(1, title); // stmt에서 첫번째 ?를 변수 title 값으로 대체. (SQL은 0이 아니라 1부터 시작)
            stmt.setString(2, content); // stmt에서 두번째 ?를 변수 content 값으로 대체. 
            stmt.setString(3, author); // stmt에서 세번째 ?를 변수 author 값으로 대체. 
            
            int result = stmt.executeUpdate();
            System.out.println(result +"개 행이 삽입 되었습니다.");
            
        } catch (SQLException e) {

            e.printStackTrace();
            
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        
        
    }

}
