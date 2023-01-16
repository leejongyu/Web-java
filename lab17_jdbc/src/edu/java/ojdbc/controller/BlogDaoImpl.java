package edu.java.ojdbc.controller;

import static edu.java.ojdbc.OracleJdbc.*;
import static edu.java.ojdbc.controller.JdbcSql.*;
import static edu.java.ojdbc.model.Blog.Entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.java.ojdbc.model.Blog;
import oracle.jdbc.OracleDriver;

public class BlogDaoImpl implements BlogDao {

    private static BlogDaoImpl instance = null;

    private BlogDaoImpl() {
    }

    public static BlogDaoImpl getinstance() {

        if (instance == null) {
            instance = new BlogDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Blog> select() {
        List<Blog> list = new ArrayList<>(); // 리턴하기 위한 Array List - select의 결과를 저장.

        Connection conn = null;

        PreparedStatement stmt = null;

        ResultSet rs = null;

        try {

            conn = getConnection(); // Oracle DB와 연결

            stmt = conn.prepareStatement(SQL_SELECT_ALL); // SQL 문장 준비

            rs = stmt.executeQuery(); // SQL 문장 실행 (select - executeQuery/ insert, update, delete - executeUpdate)

            while (rs.next()) { // resultSet에 다음 데이터가 있으면 각 컬럼의 값을 분석.
                Integer blogNo = rs.getInt(COL_BLOG_NO);
                String title = rs.getString(COL_TITLE);
                String content = rs.getString(COL_CONTENT);
                String author = rs.getString(COL_AUTHOR);
                LocalDateTime created = rs.getTimestamp(COL_CREATED_DATE).toLocalDateTime();
                LocalDateTime modified = rs.getTimestamp(COL_MODIFIED_DATE).toLocalDateTime();

                // 분석한 값으로 Blog 타입 객체 생성
                Blog blog = new Blog(blogNo, title, content, author, created, modified);

                // ArrayList에 추가
                list.add(blog);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeResources(conn, stmt, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public Blog select(Integer blogNo) {

        Blog blog = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_NUM);

            stmt.setInt(1, blogNo);

            rs = stmt.executeQuery();

            if (rs.next()) { // 검색 결과의 row 데이터가 있으면
                Integer no = rs.getInt(COL_BLOG_NO);
                String title = rs.getString(COL_TITLE);
                String content = rs.getString(COL_CONTENT);
                String author = rs.getString(COL_AUTHOR);
                LocalDateTime created = rs.getTimestamp(COL_CREATED_DATE).toLocalDateTime();
                LocalDateTime modified = rs.getTimestamp(COL_MODIFIED_DATE).toLocalDateTime();

                blog = new Blog(blogNo, title, content, author, created, modified);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeResources(conn, stmt, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return blog;
    }

    @Override
    public int insert(Blog blog) {

        int result = 0; // DB insert 결과 값(insert 된 행의 개수)를 저장할 변수

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = getConnection();

            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, blog.getTitle());
            stmt.setString(2, blog.getContent());
            stmt.setString(3, blog.getAuthor());

            result = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeResources(conn, stmt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    @Override
    public int update(Blog blog) {
        int result = 0;

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = getConnection();

            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, blog.getTitle());
            stmt.setString(2, blog.getContent());
            stmt.setInt(3, blog.getBlogNo());

            result = stmt.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            try {
                closeResources(conn, stmt);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return result;
    }

    @Override
    public int delete(Integer blogNo) {

        int result = 0;

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = getConnection();

            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, blogNo);

            result = stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {
            try {
                closeResources(conn, stmt);
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

        return result;
    }

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private void closeResources(Connection conn, Statement stmt) throws SQLException {
        stmt.close();
        conn.close();
    }

    private void closeResources(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
        rs.close();
        closeResources(conn, stmt);

    }

    @Override
    public List<Blog> search(int type, String keyword) {
        List<Blog> blogList = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();

            switch (type) {

            case 0: // all
                stmt = conn.prepareStatement(SQL_SEARCH_BY_ALL);
                stmt.setString(1, "%" + keyword.toLowerCase() + "%");
                stmt.setString(2, "%" + keyword.toLowerCase() + "%");
                stmt.setString(3, "%" + keyword.toLowerCase() + "%");
                break;
            case 1: // title
                stmt = conn.prepareStatement(SQL_SEARCH_TITLE);
                stmt.setString(1, "%" + keyword.toLowerCase() + "%");
                break;
            case 2: // content
                stmt = conn.prepareStatement(SQL_SEARCH_CONTENT);
                stmt.setString(1, "%" + keyword.toLowerCase() + "%");
                break;
            case 3: // t + c
                stmt = conn.prepareStatement(SQL_SEARCH_BY_TITLE_OR_CONTENR);
                stmt.setString(1, "%" + keyword.toLowerCase() + "%");
                stmt.setString(2, "%" + keyword.toLowerCase() + "%");
                break;
            case 4: // author
                stmt = conn.prepareStatement(SQL_SEARCH_AUTHOR);
                stmt.setString(1, "%" + keyword.toLowerCase() + "%");
                break;
            default:
                
                break;
            }

            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Integer blogNo = rs.getInt(COL_BLOG_NO);
                String title = rs.getString(COL_TITLE);
                String content = rs.getString(COL_CONTENT);
                String author = rs.getString(COL_AUTHOR);
                LocalDateTime createTime = rs.getTimestamp(COL_CREATED_DATE).toLocalDateTime();
                LocalDateTime modifiedTime = rs.getTimestamp(COL_MODIFIED_DATE).toLocalDateTime();
                
                Blog blog = new Blog(blogNo, title, content, author, createTime, modifiedTime);
                
                blogList.add(blog);
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeResources(conn, stmt, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return blogList;
    }

}
