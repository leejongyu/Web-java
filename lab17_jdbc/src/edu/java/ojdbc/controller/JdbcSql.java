package edu.java.ojdbc.controller;

import static edu.java.ojdbc.model.Blog.Entity.*;

public interface JdbcSql {

    // %s > 문자열로 대체,
    // %d > 정수로 대체
    // %f > 실수로 대체

    // 전체검색 : 블로그 글 번호 내림차순 정렬
    String SQL_SELECT_ALL = String.format(
            "select * from %s order by %s desc",
            TBL_BLOGS, COL_BLOG_NO);

    // 블로그 글 번호로 검색
    String SQL_SELECT_BY_NUM = String.format(
            "select * from %s where %s = ?",
            TBL_BLOGS, COL_BLOG_NO);

    // 블로그에 새 글 저장하기
    String SQL_INSERT = String.format(
            "insert into %s (%s, %s, %s) values (?, ?, ?)", 
            TBL_BLOGS, COL_TITLE, COL_CONTENT, COL_AUTHOR);

    // 블로그 글 수정하기
    String SQL_UPDATE = String.format(
            "update %s set %s = ?, %s = ?, %s = sysdate where %s = ?",
            TBL_BLOGS, COL_TITLE, COL_CONTENT, COL_MODIFIED_DATE, COL_BLOG_NO);

    // 블로그 글 삭제하기
    String SQL_DELETE = String.format(
            "delete from %s where %s = ?",
            TBL_BLOGS, COL_BLOG_NO);

    // 제목/내용/작성자로 검색하기
    String SQL_SEARCH_TITLE = String.format(
            "select * from %s where lower(%s) like ? order by %s desc",
            TBL_BLOGS, COL_TITLE, COL_BLOG_NO);

    String SQL_SEARCH_CONTENT = String.format(
            "select * from %s where lower(%s) like ? order by %s desc",
            TBL_BLOGS, COL_CONTENT, COL_BLOG_NO);

    String SQL_SEARCH_AUTHOR = String.format(
            "select * from %s where lower(%s) like ? order by %s desc", 
            TBL_BLOGS, COL_AUTHOR, COL_BLOG_NO);

    String SQL_SEARCH_BY_TITLE_OR_CONTENR = String.format(
            "select * from %s where lower(%s) like ? or lower(%s) like ? order by %s desc", 
            TBL_BLOGS, COL_TITLE, COL_CONTENT, COL_BLOG_NO);
    
    String SQL_SEARCH_BY_ALL = String.format(
            "select * from %s where lower(%s) like ? or lower(%s) like ? or lower(%s) like ? order by %s desc", 
            TBL_BLOGS, COL_TITLE, COL_CONTENT, COL_AUTHOR ,COL_BLOG_NO);
            
    
}
