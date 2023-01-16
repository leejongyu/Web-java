package edu.java.jdbc01;

import static edu.java.ojdbc.OracleJdbc.*;
import static edu.java.ojdbc.model.Blog.Entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; // SQL 문장을 작성, DB에 전송, 결과를 받음
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import edu.java.ojdbc.model.Blog;
import oracle.jdbc.OracleDriver;

/*
 * 
 * JDBC = (JAVA Database Connectivity)
 * 자바 프로그램에서 데이터베이스를 연결하고 SQL 문장들을 실행하는 방법
 * 
 * 1. Maven search에서 Oracle JDBC 라이브러리 (ojdbc8-x.x.x.x.jar)를 다운로드하고 자바 프로젝트에 추가.
 *   (1) 다운로드
 *   (2) 이클립스 자바 프로젝트에 lib 폴더 생성
 *   (3) lib 폴더에 다운로드한 jar 파일을 복사.
 *   (4) jar 파일을 빌드 패스에 추가.
 *   
 * 2. Oracle Database System에 접속하기 위한 정보들 (URL, USER, Password, ...)
 * 
 * 3. Oracle JDBC 라이브러리를 사용할 수 있도록 메모리에 로드
 * 
 * 4. 오라클 데이터 베이스 시스템에 접속(connection).
 * 
 * 5. Statement 객체를 생성 - 데이터베이스 서버에서 실행할 SQL 문장을 작성, 실행할 수 있는 객체.
 * 
 * 6. Statement 객체의 메서드를 사용해서 SQL 문장을 데이터베이서 서버로 전송하고, 그 결과를 받음.
 *   (1) executeQuery() - select
 *   (2) executeUpdate() - insert, update, delete
 *   
 * 7. 결과 처리 - 화면 출력
 * 
 * 8. 사용한 모든 리소스 해제(close)
 * 
 */

public class JdbcMain01 {

    public static void main(String[] args) {

        Connection conn = null; // finally 구문에서 close 해야할 리소스 객체
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            // 3. --
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Oracle Driver 등록 성공");
            // 4. --
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Oracle DB 접속 성공");
            
            // 5. select 할 수 있는 SQL 문장과 Statement객체 생성
            // JDBC에서는 SQL 문장 끝에 세미콜론을 사용하지 않음.
            String sql = String.format(
                    "select * from %s order by %s desc",
                    TBL_BLOGS, COL_BLOG_NO);
            System.out.println(sql);
            
            stmt = conn.prepareStatement(sql);
            
            // 6. SQL 문장을 DB 서버로 전송, 결과를 받음.
            rs = stmt.executeQuery();    
            System.out.println(rs);
            
            // 7. SQL 실행 결과를 화면에 출력.
            while (rs.next()) { // RS에 행이 있는 경우
                Integer blogNO = rs.getInt(COL_BLOG_NO);    
                String title = rs.getString(COL_TITLE);
                String content = rs.getString(COL_CONTENT);
                String author = rs.getString(COL_AUTHOR);
                LocalDateTime createdDate = rs.getTimestamp(COL_CREATED_DATE).toLocalDateTime();
                LocalDateTime modifiedDate = rs.getTimestamp(COL_MODIFIED_DATE).toLocalDateTime();
                
                Blog blog = new Blog(blogNO, title, content, author, createdDate, modifiedDate);
                System.out.println(blog);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 사용한 리소스 해제 (close) - 객체들이 생성된 반대 순서로 close (나중에 생성된 객체부터 close)
            try {
                rs.close();
                stmt.close();
                conn.close(); // Oracle DB와 연결 해제
                System.out.println("Oracle DB와 연결 해제 성공");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
