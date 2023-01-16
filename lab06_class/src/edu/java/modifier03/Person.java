package edu.java.modifier03;

public class Person {

    // field 
    
    private String name;
    private int age;
    
    
    // constructor
    public Person(String name, int age) {
        this.name = name;
        if (age >=0) {
            this.age = age;
        } else {
            System.out.println("나이는 0보다 작을 수 없음");
        }
    }
    
    // method
    
    public String getName() { // getter method : 관습적으로 get + 변수이름(대문자 시작) 으로 사용 
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) { // setter method : set + 변수이름(대문자 시작)
      if (age >= 0) {
          this.age = age;
          
      } else {
          System.out.println("나이는 0보다 작을 수 없음");
      }
        
        
    }
    
    
}
