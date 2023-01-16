package edu.java.list02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Homework {

    public static void main(String[] args) {

        // 정수를 저장하는 변수선언
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        // 난수를 저장
        Random rd = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(rd.nextInt(100));
        }

        // 출력
        System.out.println(numbers);

        // 홀수를 저장하는 변수 선언
        LinkedList<Integer> odds = new LinkedList<>();

        // 짝수를 저장하는 변수 선언
        LinkedList<Integer> even = new LinkedList<>();

        // numbers에 저장된 홀수들을 odds에 저장
        for (Integer n : numbers) {
            if (n % 2 == 1) {
                odds.add(n);
            } else {
                // numbers에 저장된 짝수들의 제곱을 even에 저장
                even.add(n * n);
            }
        }

        // odds 출력
        System.out.println(odds);

        // even 출력 (iterator 연습)
        Iterator<Integer> evenItr = even.iterator();
        System.out.print("[");
        while(evenItr.hasNext()) {
            System.out.printf(" %d,",evenItr.next());
        } System.out.print("]");

    } // end main
} // end class
