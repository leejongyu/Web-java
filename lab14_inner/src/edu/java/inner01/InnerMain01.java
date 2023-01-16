package edu.java.inner01;

import edu.java.inner01.Enclosing.Nested;

public class InnerMain01 {

    

    public static int MAX = 3;  // static field
    
    private int x; // instance field
    
    
    public static void main(String[] args) {
      
        
        // 1) static field
        System.out.println(MAX + " static "); // static field는 바로 호출 가능
        
        
        
        // 2) instance filed
        InnerMain01 app = new InnerMain01(); // 여기서 선언된 app은 main 메서드에서만 사용 가능 => 지역변수
        
        
        System.out.println(app.x +" = instance ");   // instance field 인 x 를 호출하기 위해서 app이라는 참조변수를 이용
        
        
        
        // Outer 타입의 변수 선언, 객체 생성
        System.out.println("--- Outer class ---");
        Outer outer1 = new Outer(1, 2);
        System.out.println(outer1);
        
        // (non-static) Inner 타입의 변수 선언, 객체 생성 방법 
        
        Outer.Inner inner1 = outer1.new Inner(3);
        inner1.printInfo();
        
        Outer outer2 = new Outer(100, 200);
        Outer.Inner inner2 = outer2.new Inner(300);
        inner2.printInfo();
        
        // static 내부 클래스 타입의 변수 선언, 객체 생성
        Enclosing.Nested nested = new Enclosing.Nested(3);
        nested.test();
        
        
    } // end main

    
    
} // end class
