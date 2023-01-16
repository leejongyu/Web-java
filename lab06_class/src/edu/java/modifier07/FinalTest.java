package edu.java.modifier07;

public class FinalTest {

    // private final int number; // final field의 number가 초기화 되지 않을 수 있음.
    private final int number = 10; // (1) 선언과 동시에 초기화 하면 문제 발생X
    
    private final int number2;

    public static final int VERSION = 1;
 
    
//    public FinalTest() { // 기본 생성자 생성 시 초기화 오류        
//    }
    
    public FinalTest(int number) { // (2) 선언과 동시에 초기화 하지 않으면 argument를 갖는 생성자를 정의해서 final 멤버 변수를 초기화 해주어야 함
        this.number2 = number;
    }
    
    
    public int getNumber() {
        return this.number;
    }
    

    
    
}
