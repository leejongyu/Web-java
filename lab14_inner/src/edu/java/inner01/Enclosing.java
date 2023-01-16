package edu.java.inner01;

public class Enclosing {
    // field

    public static int classVariable = 123; // static 변수

    private int instanceVariable; // instance 멤버

    // constructor
    public Enclosing(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // method
    // 1 - 1) static method : static으로 선언된 멤버(필드, 메서드)만 사용 가능.
    public static void classMethod() {
        System.out.println("--- static class ---");
        System.out.println("static Var : " + classVariable);
//      System.out.println("non - static Var : "  + instanceVariable); <- static이 아니어서 에러 발생
    }

    // 1 - 2) instance method : static & non - static 선언된 멤버들 모두 사용 가능
    public void instanceMethod() {
        System.out.println("--- non - static class ---");
        System.out.println("static Var : " + classVariable);
        System.out.println("non - static Var : " + instanceVariable);

    }

    // 2 - 1) static inner class (Nested class)
    // 외부 클래스의 객체 생성 여부와 상관 없이 생성자 호출하고 사용할 수 있는 클래스
    // 외부 클래스의 static 멤퍼들만 사용 가능.
    public static class Nested {
        // field
        private int a;

        // constructor
        public Nested(int a) {
            this.a = a;
        }

        // method
        public void test() {

            System.out.println("--- Nested class ---");
            System.out.println("Nested(static inner class) 의 변수 : " + a);
            System.out.println("외부 클래스의 static 변수 : " + classVariable);
//          System.out.println("외부 클래스의 non - static 변수 : " + instanceVariable); <- static이 아니어서 에러 발생
        }

    }
}
