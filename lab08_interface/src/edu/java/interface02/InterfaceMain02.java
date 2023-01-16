package edu.java.interface02;

// Interface가 가질 수 있는 멤버들
//      (Java 7 이전)
// 1. [public static final] 필드(멤버 변수)
// 2. [public abstract] 메서드
//      (Java 8 버전 이후)
// 3. [public] default 메서드 : body가 구현된 메서드.
//      -> Interface를 구현하는 (하위) 클래스의 객체를 생성한 후에 참조 변수를 이용해서 호출(사용)하는 메서드.
// 4. [public] static 메서드 :  body가 구현된 static 메서드.
//      -> 객체 생성 없이 인터페이스 이름으로 참조해서 호출(사용)하는 메서드.
//      (Java 9 버전 이후)
// 5. private static 메서드 : body가 구현된 static 메서드
//      -> Interface의 [public] static, [public] default 메서드 안에서 사용하시 위한 목적의 메서드.
// 6. private 메서드 : body가 구현된 메서드
//      -> Interface의 [public] default 메서드 안에서만 사용하기 위한 목적의 메서드.



interface Test {
 //  (Java 7 이전)
// 1. [public static final] 필드(멤버 변수)
    int VERSION = 1;
    
// 2. [public abstract] 메서드
    void test2();
    
 //  (Java 8 버전 이후)
//3. [public] default 메서드 : body가 구현된 메서드.
    default void defaultMethod() {
        System.out.println("default method");
        privateStaticMethod();
        
    }
// 4. [public] static 메서드 :  body가 구현된 static 메서드.
    static void staticMethod() {
        System.out.println("static method");
        privateStaticMethod();
        
    }
    
 //  (Java 9 버전 이후)
// 5. private static 메서드 : body가 구현된 static 메서드
    private static void privateStaticMethod() {
        System.out.println("비공개 static 메서드");
    }
    
// 6. private 메서드 : body가 구현된 메서드
    private void privateMethod() {
        System.out.println("비공개 이미 구현된 메서드");
    }
    
    
}


class TestImpl implements Test {
    @Override
    public void test2() {
        System.out.println("test 구현 메서드 ");
        
    }
}


public class InterfaceMain02 {

    public static void main(String[] args) {
        // (1) [public static final] 필드(멤버 변수)
        System.out.println(Test.VERSION);
        
        // (4) [public] static 메서드 :  body가 구현된 static 메서드.
        Test.staticMethod();
        
        // (3) [public] default 메서드 : body가 구현된 메서드.
        Test t = new TestImpl(); // interface(Test)를 구현하는 하위 클래스의 객체(TestImpl)를 생성

        // (2) [public abstract] 메서드 
        t.test2(); // 구현된 메서드가 있어야 사용 가능
    }

}
