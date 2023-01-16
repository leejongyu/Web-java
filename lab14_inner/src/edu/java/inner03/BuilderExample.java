package edu.java.inner03;

public class BuilderExample {

    public static void main(String[] args) {

        // 생성자를 이용한 객체 생성
        Book book1 = new Book("범죄도시 2", "박밈미", "범죄 / 코미디");

        System.out.println(book1);

        Book book2 = new Book("박밈미", "범죄 / 코미디", "범죄도시 2");

        System.out.println(book2);

        // Builder, Factory Pattern을 사용한 객체 생성
        Book book3 = Book.builder()
                .title("범죄도시 2")
                .author("박밈미")
                .category("범죄 / 코미디")
                .build();

        System.out.println(book3);

        Book book4 = Book.builder()
                .author("박밈미")
                .category("범죄 / 코미디")
                .title("범죄도시 2")
                .build();
        System.out.println(book4);
        
        // 생성자 패턴 (세부 사항을 모를 때)
        Book book5 = new Book(null,"박밈미", null);
        
        System.out.println(book5);
        
        // Builder 패턴 (세부 사항을 모를 때)
        Book book6 = Book.builder().author("박밈미").build();
        
        System.out.println(book6);
    
    
    }

}
