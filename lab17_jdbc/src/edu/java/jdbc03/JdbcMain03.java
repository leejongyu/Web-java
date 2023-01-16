package edu.java.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import static edu.java.ojdbc.OracleJdbc.*;
import static edu.java.ojdbc.model.Blog.Entity.*;

public class JdbcMain03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            DriverManager.registerDriver(new OracleDriver());
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = String.format("update %s set %s = ?, %s = ?, %s = sysdate where %s = ?", TBL_BLOGS, COL_TITLE, COL_CONTENT,COL_MODIFIED_DATE ,COL_BLOG_NO);
            System.out.println(sql);
        
            stmt = conn.prepareStatement(sql);
            
            System.out.println("수정할 블로그의 번호 입력 > ");
            int no = Integer.parseInt(sc.nextLine().trim()); 
            
            System.out.println("변경할 제목 입력 > ");
            String title = sc.nextLine();
            
            System.out.println("변경할 본문 입력 > ");
            String content = sc.nextLine();
            

            stmt.setString(1, title); // 1번째 물음표 : 제목
            stmt.setString(2, content); // 2번째 물음표 : 본문
            stmt.setInt(3, no); // 3번째 물음표 : 업데이트 할 글 번호
            
            int result = stmt.executeUpdate();
            System.out.println(result + "개 행이 업데이트 되었습니다.");
            
        } catch (Exception e) {

            e.printStackTrace();
        
        } finally {
            
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        
        
    }
}
