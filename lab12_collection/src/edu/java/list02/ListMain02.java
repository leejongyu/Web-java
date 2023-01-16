package edu.java.list02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class ListMain02 {

    public static void main(String[] args) {

        // 1. 정수를 저장하는 LikedList 객체 선언/ 생성>
        LinkedList<Integer> numbers = new LinkedList<>();

        // 2. 생성한 리스트에 0 이상 100 미만의 범위의 정수 난수 20개를 저장.
        Random rd = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(rd.nextInt(0, 100));
        }

        // 3. 난수가 저장된 리스트를 출력
        System.out.println("numbers size : " + numbers.size());
        System.out.println(numbers);

        // 4. 홀수들만 저장하는 LinkedList 변수(odds) 선언, 객체 선언
        LinkedList<Integer> odds = new LinkedList<>();

        // 5. 난수들이 저장된 리스트에서 홀수들만 저장.
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) {
                odds.add(numbers.get(i));
            }
        }

        // 6. odds 출력.
        System.out.println("odds size : " + odds.size());
        System.out.println(odds);
        // 7. 짝수 제곱들을 저장하는 LnkedList 변수(evenSquares) 선언, 객체 생성
        LinkedList<Integer> evenSquares = new LinkedList<>();

        LinkedList<String> even2 = new LinkedList<>();
        // 8. 난수들이 저장된 리스트에서 짝수들을 찾아서 그 제곱을 e- 에 저장.
        for (int i = 0; i < numbers.size(); i++) {
            Integer x = numbers.get(i);
            if (x % 2 == 0) {
                evenSquares.add(x * x);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                Integer x = numbers.get(i);
                even2.add(x + "의 제곱 = " + x * x);
            }
        }
        // 9. e- 출력
        System.out.println("even... size : " + evenSquares.size());
        System.out.println(evenSquares);
        System.out.println(even2);
    }

}
