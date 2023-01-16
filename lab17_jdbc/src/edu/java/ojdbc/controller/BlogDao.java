package edu.java.ojdbc.controller;

import java.util.List;

import edu.java.ojdbc.model.Blog;

public interface BlogDao {

    List<Blog> select(); // SQL_SELECT_ALL

    Blog select(Integer blogNo); // SQL_SELECT_BY_NO

    int insert(Blog blog); // SQL_INSERT > get 사용

    int update(Blog blog); // SQL_UPDATE

    int delete(Integer blogNo); // SQL_DELETE

    // int type에 따라서 달라지는 문장.
    List<Blog> search(int type, String keyword);
    
}
