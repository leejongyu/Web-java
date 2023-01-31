package edu.java.condition04;

import java.util.Random;

public class conditionMain04 {
    public static void main(String[] args) {
     // 과제 제출 주소 :  jake.oh.lecture@gmail.com

        /*  제어문
         *  IF 조건문
          
         *  if(조건식 : boolean) {
            
            실행문1; (boolean 조건 충족시)
            
            } else (생략가능) {
            
            실행문2; (boolean 조건 불충족시)
            
            }
            
         *  Else if 조건문
         
         *  if(조건식 1 : boolean) {
            
            실행문1; (조건1 충족시)
            
            } else if (조건식2) {
            
            실행문2; (조건2 충족시)
            
            } else 
            
            실행문3; (조건 불충족시)
          *  
        */
        // Random 클래스 : 난수를 발생시키는 기능을 가지고 있는 클래스.
        Random random = new Random(); // 대부분 변수를 선언할 때 선언한 변수와 같은 이름을 new 뒤에 사용
                                      // Random 타입의 변수를 선언 및 초기화(저장)

        // 0 이상 10 이하의 정수 난수 생성.
        int x = random.nextInt(11);
        System.out.println("x = " + x);

        int y = random.nextInt(11);
        System.out.println("y = " + y);

        // 두 숫자의 차이(큰 수 - 작은 수)를 계산.
        int diff;

        if (x == y) {
            System.out.println("Lucky");
            diff = (x - y);
        } else if (x > y) {
            diff = (x - y);
        } else {
            diff = (y - x);
        }
        System.out.println("diff = " + diff);
        
        
        // 삼항 연산자
        // (조건식) ? (조건이 참일 때 선택 할 값) : (조건이 거짓일 때 선택할 값)
        // 연산자 && : and / || : or / !  : not
        
        int diff2 = (x > y) ? (x - y) : (y - x);
        System.out.println("diff2 = " + diff2);

        // 0 이상 10 이하의 정수 난수를 생성해서 초기화
        // 문자열 변수를 선언하고, 난수가 짝수(x % 2 == 0)이면 even 홀수이면 odd
        // 문자열을 출력
        int z = random.nextInt(11);
        System.out.println(z);
        
        String c = (z % 2 == 0) ? ("even") : ("odd");
        System.out.println(c);
        
        // 강사님 해설
        
        // 1. If - else 사용
        int z2 = random.nextInt(11);
        String answer1;
        if (z2 % 2 == 0) {
            answer1 = "Even";
        } else {
            answer1 = "Odd";
        }
        System.out.println(z + " = " + answer1);
        
        
        // 0이상 10 이하의 정수난수 2개를 저장
        // int 타입 변수 bigger에 두 난수 중에서 더 크거나 같은 숫자를 저장
        // bigger를 출력
        
        int r = random.nextInt(11);
        System.out.println(r);
        int t = random.nextInt(11);
        System.out.println(t);
        
        int bigger = (r >= t) ? (r) : (t);
        System.out.println(bigger);

        
        
        
    }
}