package edu.java.lambda02;

import edu.java.lambda02.Calculator.Calculable;

public class LambdaMain {

    public static void main(String[] args) {

        String s1 = "blabla";
        String s2 = new String("lalala");
        
        System.out.println(s1.concat(s2).concat(s1).concat(s2));
        System.out.println(s2);
        
        
        double result;

        // 1.
        Calculator adder = new Calculator(1, 2);
        result = adder.calculate((x, y) -> x + y);
        System.out.println("adder result = " + result);

        // 2.
        Calculator subtracter = new Calculator(1, 2);
        result = subtracter.calculate((x, y) -> x - y);
        System.out.println("subtracter result = " + result);

        // 3.
        Calculator multiplier = new Calculator(1, 2);
        result = multiplier.calculate((x, y) -> x * y);
        System.out.println("multiplier result = " + result);

        // 4.
        Calculator divider = new Calculator(1, 2);
        result = divider.calculate((x, y) -> x / y);
        System.out.println("divider result = " + result);

        // 5. 더 크거나 같은 수를 return
        Calculator whoIsBig = new Calculator(1, 1);
        result = whoIsBig.calculate((x, y) -> (x >= y) ? x : y);
        System.out.println("bigger test : " + result);

        
        result = whoIsBig.calculate((x,y) -> {
            if (x>y) {
                return x;
            } else {
                return y;
            }
        });
        
        Calculable plus = (x, y) -> x + y;
        result = plus.calculate(7, 7);
        System.out.println("Lambda plus : " + result);

        Calculable minus = (x, y) -> x - y;
        result = minus.calculate(8, 7);
        System.out.println("Lambda minus : " + result);

        Calculable percent = (x, y) -> x % y;
        result = percent.calculate(9, 6);
        System.out.println("Lambda percent : " + result);

        Calculable whoIsSmall = (x, y) -> x < y ? x : y;
        result = whoIsSmall.calculate(77, 66);
        System.out.println("Lambda small : " + result);

        // 람다 변형 1.

        Blabla bla = s -> System.out.println(s);

        bla.blabla("루루루");

        Blabla bla2 = System.out::println;

        bla2.blabla("하하하");

        // 람다 변형 2.

        Speed xspeed = s -> s.length();
        System.out.println(xspeed.speed("asdfsdafsdag32132sdafsdafafasfd"));

        Speed xpeed = String::length;
        System.out.println(xpeed.speed("asdfsdafsdag32132sdafsdafafasfd"));

    }

}
