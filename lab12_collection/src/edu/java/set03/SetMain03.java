package edu.java.set03;

import java.util.HashSet;
import java.util.Random;

public class SetMain03 {

    public static void main(String[] args) {

        // HashSet<E> 사용. 0 이상 10 미만 범위의 정수 난수 5개를 저장.
        Random rd = new Random();

        HashSet<Integer> randomFive = new HashSet<>();

        for (int i = 0 ; ; i++) {
            randomFive.add(rd.nextInt(10));
            if (randomFive.size() == 5) {
                break;
            }
        }
                
        System.out.println(randomFive);
        
        
        HashSet<Integer> numbers = new HashSet<>();
        
        while (true) {
            numbers.add(rd.nextInt(10));
            System.out.println(numbers);
            
            if (numbers.size() == 5) {
                break;
            }
        }
        
        
    }

}
