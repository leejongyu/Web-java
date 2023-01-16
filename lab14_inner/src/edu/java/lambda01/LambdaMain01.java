package edu.java.lambda01;

public class LambdaMain01 {

    public static void main(String[] args) {

        // 인터페이스를 사용

        // 1. 인터페이스를 구현하는 별도의 Java 파일에서 클래스 정의

        Adder adder = new Adder();

        double result = adder.calculate(7, 8);

        System.out.println(result);

        // 2. 지역 클래스 (local class)

        class Subtracter implements Calculable {
            @Override
            public double calculate(double x, double y) {
                return x - y;
            }
        }

        Calculable subtracter = new Subtracter();
        result = subtracter.calculate(7, 8);
        System.out.println(result);

        // 3. 익명 클래스 (Anonymous class)
        Calculable multiplier = new Calculable() {

            @Override
            public double calculate(double x, double y) {
                return x * y;
            }
        };

        result = multiplier.calculate(7, 8);
        System.out.println(result);

        // 4. 람다 표현식 (lambda expression)
        Calculable devider = (x, y) -> { return x / y; };
        Calculable devider2 = (x, y) -> x / y;

        result = devider.calculate(7, 8);
        System.out.println(result);

        result = devider2.calculate(7, 8);
        System.out.println(result);
        // 람다 표현식 (Lambda expression - 함수 표기법)
        // 클래스 정의와 객체 생성을 동시에 하는 익명 클래스를 간단히 작성하기 위한 문법.
        // 함수형 interface만 람다 표현식으로 작성할 수 있음.

        // printable 익명 클래스

        Printable print1 = new Printable() {

            @Override
            public void print(String msg) {
                System.out.println(msg.toString());
            }
        };
        print1.print("안녕. Lambda야!");

        // printable 람다 클래스

        Printable print2 = msg -> System.out.println(msg.toUpperCase());
        print2.print("hellowwwwwwwwwww");

        // 람다 응용 - 메서드 참조(Method reference)
        // (1) 람다 표현식에서 파라미터가 1개이고, 메서드 body의 실행 문장도 1개 뿐인데,
        // 람다표현식의 파라미터가 실행문장의 argument로 그대로 전달되는 경우.

        Printable print3 = System.out::print; // 
        print3.print("라라라");

        // (2) 람다 표현식에서 파라미터가 1개이고, 실행문장도 1개인 경우
        // 그 실행 문장이 파라미터의 메서드를 호출하는 경우.
        Mapper mapper = s -> {
            return s.length();
        };
        Mapper mapper2 = String::length;

        System.out.println(mapper.map("oooooooooooooooooooooolleh"));

    } // end main

} // end Main class
