package edu.java.modifier07;

public class StaticTest {

    
    int instanceVariable; // instance 변수
    static int staticVariable; // static 변수
 
    
    public void printVariables() { 
        System.out.println("---instance method---");
        System.out.println(" 인스턴스 변수 = " + instanceVariable);  // 생성자를 생성하면서 memory(Heap area)에 instance 변수가 생성되어 있어서 시행 o
        System.out.println(" 스태틱 변수 = " + staticVariable);      // 생성자를 생성하기 전에 이미 method area에 static 변수가 생성되어 있어서 시행 o
    }
    
    
    public static void printVariables2() {
        System.out.println("---static method---");
//        System.out.println(" 인스턴스 변수 = " + instanceVariable); // memory(Heap area)에 instance 변수가 생성되지 않아서 시행 x 
         // static 멤버는 static이 아닌 멤버를 사용할 수 없다.
        System.out.println(" 스태틱 변수 = " + staticVariable);     // memory(method area)에 static 변수가 생성되어 있어서 시행 o
    }
}
