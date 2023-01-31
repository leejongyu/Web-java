package edu.java.loop01;

import java.util.Random;

public class LoopMain01 {

    public static void main(String[] args) {
        // 반복문 
        // 증가연산자 (++) = 값을 1증가
        // 감소연산자 (--) = 값을 1감소
            Random random = new Random();
            int i = 0;
        // for 문
        for (i = random.nextInt(11) ; i <= 8 ; i= random.nextInt(11) ) {
            System.out.println("숫자는 " + i + " 입니다");
            
            if (i % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
            
            System.out.println("숫자 = "+ i + " : 조건에 부합하지 않습니다. 반복합니다.");
        }
         System.out.println("i의 값은 " + i + " 입니다. 반복을 종료합니다." );
        
        
    }
}
