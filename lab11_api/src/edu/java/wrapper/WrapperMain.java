package edu.java.wrapper;

import java.math.BigDecimal;

// Wrapper class ? : Java의 기본 데이터 타입(boolean, byte, short, int, long, char, float, double)의 값을 하나만 저장하는 클래스.
// Wrapper class : Boolean, Byte, Short, Integer, Long, Character, Float, Double 의 형식처럼 첫 글자가 대문자. 줄여서 사용하는 int, char이 각각 Integer, Character로 사용.
// Wrapper class는 java.lang 패키지에 포함되어 있어서 import 없이 사용 가능
// Wrapper class를 사용하는 목적 : 
// 1. 기본타입 데이터들을 이용하는 메서드를 제공
// 2. 상속과 다형성을 사용하기 위해서
// 3. generic class에서 사용하기 위해서.


public class WrapperMain {

    public static void main(String[] args) {
        
            // Integer type의 객체 생성
        Integer number1 = Integer.valueOf(100); // int type -> integer class(Wrapper)
        System.out.println(number1);
    
        Integer number2 = Integer.valueOf("12"); // String type -- > Integer class (Wrapper)
        System.out.println(number2);
        
        int x = Integer.parseInt("123"); // String -> int type (기본타입)
        System.out.println(x);
        
        // auto-boxing, auto-unboxing
        Integer number3 = 1; // auto-boxing => int 타입(기본 데이터 타입)의 값을 Integer 타입(class)의 객체로 자동변환
        System.out.println(number3.toString());
        
        int add = number1 + number2; // auto-unboxing => Integer 타입(class) 객체를 int 타입(기본 데이터 타입)으로 자동변환
        System.out.println(add);

        
        // float, double type은 값을 저장하는 방식 때문에 소수점 이하 오차가 생길 수 있음.
        double d1 = 1.1; 
        double d2 = 0.9;
        System.out.println(d1-d2);
        
        // Double type의 오차를 원하는 수준까지 작게 줄일 수 있는 클래스 - BigDecimal (import 해야 사용할 수 있음)
        BigDecimal b1 = new BigDecimal("1.1"); // 생성자 호출해서 객체를 생성
        BigDecimal b2 = new BigDecimal("0.9");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.subtract(b2)); // 메서드를 호출해서 산술 연산
        // BigDecimal 클래스는 Wrapper 클래스(Double)의 auto-boxing이나 auto-unboxing 기능이 없음
        
        
        
    }

}
