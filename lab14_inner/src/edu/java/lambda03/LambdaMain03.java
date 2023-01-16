package edu.java.lambda03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.DocFlavor.INPUT_STREAM;

public class LambdaMain03 {

    public static void main(String[] args) {

        // 정수들을 저장하는 리스트
        List<Integer> numbers = Arrays.asList(8, 7, 5, 4, 3, 2, 1); // 안에 있는 내용물들을 리스트로 만듬

        System.out.println(numbers);

        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) { // -> 필터링
            if (numbers.get(i) % 2 == 0) {
                evens.add(numbers.get(i));
            }
        }
        System.out.println("e1 : " + evens);

        // stream + 람다 표현식을 이용한 필터링
        List<Integer> evens2 = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        // List객체.stream() : List객체의 흐름(통로. index 순서)대로
        // => .filter( 조건 ) : 넘겼을 때 (조건) 에 맞는다면
        // => .collect(Collerctors.toList) 리스트에 저장한다.

        System.out.println("e2 : " + evens2);

        List<Integer> odds = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 != 0) {
                odds.add(i);
            }
        }
        System.out.println("o1 : " + odds);

        List<Integer> odds2 = numbers.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
        System.out.println("o2 : " + odds2);

        List<Integer> result = new ArrayList<>();

        for (Integer i : numbers) {
            if (i % 2 == 1) {
                result.add(i * i);
            }
        }
        System.out.println(result);

        List<Integer> result2 = numbers.stream().filter(x -> x % 2 == 1).map(x -> x * x).collect(Collectors.toList());
        // List객체.stream() : List객체의 흐름(통로. index 순서)대로
        // => .filter( 조건 ) : 넘겼을 때 (조건) 에 맞는다면
        // => .map( 조건 ) : 조건에 맞는 형식으로 (람다)
        // => .collect(Collerctors.toList) 리스트에 저장한다.
        System.out.println(result2);
        
        
        List<String> langs = Arrays.asList("Java", "SQL" , "HTML", "JavaScript","Python");
        
        System.out.println(langs);
        
        List<String> five = langs.stream().filter(x -> x.length() > 5).map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println("s1 : " + five);

        List<String> five2 = langs.stream().filter(x -> x.length() > 5).map(String::toLowerCase).collect(Collectors.toList());
        
        List<String> five3 = new ArrayList<>();
        
        for (String s : langs) {
            if (s.length() > 5) {
                five2.add(s.toLowerCase());
            }
        }
        System.out.println("s2 : " + five3);
    }

}

@FunctionalInterface
interface MakeArray {
    ArrayList<Integer> plus(ArrayList<Integer> a);
}

class MakeList {

    List<Integer> newClass;

    MakeArray targetClass;

}
