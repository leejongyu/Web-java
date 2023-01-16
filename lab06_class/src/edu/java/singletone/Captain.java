package edu.java.singletone;

// singleton : 오직 한 번만 생성될 수 있는 객체. 
// > private static field + private constructor + public static method

public class Captain {

    // (1) private static field 
    // 생성할 클래스 타입 객체의 주소(참조)값을 저장하기 위한 필드.
    // 생성자 호출 전에 메모리(method / static) area에 생성되어 있어야 하는 필드. 
    private static Captain instance = null; // 클래스 이름 = 변수의 타입 이름
    // 객체타입(클래스 이름) 
    
    
    private String name = "아이언맨";
    
    // (2) private constructor
    
    private Captain() { 
    // 다른 클래스에서 생성자가 안보임 > 다른 클래스에서는 객체를 생성할 수 없음
        
    }
    
    // (3) public static Captain type을 return하는 method
    
    public static Captain getInstance() {
        if (instance == null) {   // 최초 호출시 (instance = null)
            instance = new Captain();
        } 
        return instance;         // 최초 호출 이후 (instance가 null이 아니기 때문에)
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
