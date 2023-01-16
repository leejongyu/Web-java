package edu.java.ojdbc.model;

import java.time.LocalDateTime;

// DB에 생성된 테이블(BLOGS)의 각 컬럼들을 필드(멤버 변수)로 선언한 모델 클래스
public class Blog {

    public interface Entity {
        String TBL_BLOGS = "BLOGS"; 
        String COL_BLOG_NO = "BLOG_NO"; 
        String COL_TITLE = "TITLE";
        String COL_CONTENT = "CONTENT";
        String COL_AUTHOR = "AUTHOR";
        String COL_CREATED_DATE = "CREATED_DATE";
        String COL_MODIFIED_DATE = "MODIFIED_DATE";
    }
 
    private Integer blogNo;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    
    public Blog() {}

    public Blog(Integer blogNo, String title, String content, String author, LocalDateTime createdDate,
            LocalDateTime modifiedDate) {
        this.blogNo = blogNo;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Integer getBlogNo() {
        return blogNo;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public String toString() {
        return "Blog [No." + blogNo + ", 제목 = " + title + ", 본문 = " + content + ", 작성자 = " + author
                + ", 생성시간 = " + createdDate + ", 수정시간 = " + modifiedDate + "]";
    }
    
        

    
}
