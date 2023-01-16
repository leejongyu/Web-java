package lab07_inheritance02;

public class Person {

    
    // field
    private String name;
    
    
    public Person() {
        System.out.println("Person() 생성자 호출");
    }
    
    
    public Person(String name) {
        this.name = name;
        System.out.println("Person(name) 생성자 호출");
    }
    
    
    public String getName() {
        return this.name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
