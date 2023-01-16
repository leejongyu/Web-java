package edu.java.jdbc01;

import static edu.java.ojdbc.OracleJdbc.PASSWORD;
import static edu.java.ojdbc.OracleJdbc.URL;
import static edu.java.ojdbc.OracleJdbc.USER;
import static edu.java.ojdbc.model.Blog.Entity.COL_AUTHOR;
import static edu.java.ojdbc.model.Blog.Entity.COL_BLOG_NO;
import static edu.java.ojdbc.model.Blog.Entity.COL_CONTENT;
import static edu.java.ojdbc.model.Blog.Entity.COL_CREATED_DATE;
import static edu.java.ojdbc.model.Blog.Entity.COL_MODIFIED_DATE;
import static edu.java.ojdbc.model.Blog.Entity.COL_TITLE;
import static edu.java.ojdbc.model.Blog.Entity.TBL_BLOGS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import edu.java.ojdbc.model.Blog;
import oracle.jdbc.OracleDriver;

public class JdbcSelect01 {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Oracle Driver 등록 성공");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Oracle DB 접속 성공");

            String sql = String.format(
                    "select * from %s where %s like ? order by %s desc", 
                    TBL_BLOGS, COL_TITLE ,COL_BLOG_NO);

            System.out.println(sql);
            stmt = conn.prepareStatement(sql);
            
            System.out.println("검색할 제목 입력 > ");
            String titleInput = sc.nextLine();
            stmt.setString(1, "%"+titleInput+"%");
            
            rs = stmt.executeQuery();
            System.out.println(rs);

            while (rs.next()) { 
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
            try {
                rs.close();
                stmt.close();
                conn.close(); 
                System.out.println("Oracle DB와 연결 해제 성공");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
