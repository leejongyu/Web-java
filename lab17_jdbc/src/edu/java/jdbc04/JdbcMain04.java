package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import static edu.java.ojdbc.model.Blog.Entity.*;
import static edu.java.ojdbc.OracleJdbc.*;

public class JdbcMain04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement stmt = null;
        
        
        try {
            
            DriverManager.registerDriver(new OracleDriver());
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = String.format("delete from %s where %s = ?", TBL_BLOGS, COL_BLOG_NO);
            
            stmt = conn.prepareStatement(sql);
            
            
            System.out.println("수정할 블로그의 번호 입력 > ");
            int no = Integer.parseInt(sc.nextLine().trim()); 
            
            stmt.setInt(1, no);
            
            int result = stmt.executeUpdate();
            System.out.println(result + "개 행이 삭제 되었습니다.");
            
        } catch (Exception e) {
            
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
