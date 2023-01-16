package edu.java.inner03;

public class Book {
    
    // Builder / Factory pattern 
    
    public static class BookBuilder {
        
        private String title;
        private String author;
        private String category;

        private BookBuilder() {}     
        
        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }
        
        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }
        
        public BookBuilder category(String category) {
            this.category = category;
            return this;
        }
        
        
        public Book build() {
            return new Book(title, author, category);
        }
        
    }
    
    public static BookBuilder builder() {
        // 외부 클래스에서 내부 클래스의 private 생성자를 호출할 수 있음.
        return new BookBuilder();
    }
    
    
    private String title;
    private String author;
    private String category;

    private Book() {}
    
    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    
    @Override
    public String toString() {
        if (title == null) {
            System.out.println("제목이.. 빠졌어!"); ;
        } if (author == null) {
            System.out.println("옮긴이는 아는데요.. 김경식씨");
        } if (category == null) {
            System.out.println("찌릿찌릿한거... 빠떼리?");
        }
        return "[제목 : " + title + ", 저자 : " + author + ", 카테고리 : " + category + "]";
    }
    
    
    
    
    
    
}
