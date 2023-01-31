package edu.java.loop05;

public class LoopMainAnswer {

    public static void main(String[] args) {
        // 369 출력

        // 1번 유형
        for (int a = 1; a <= 100; a++) {
            // 1의 자릿수 - 10으로 나눈 나머지
            int a1 = a % 10;

            // 10의 자릿수 - 10으로 나눈 몫
            int a10 = a / 10;

            // boolean + if
            boolean b1 = (a1 == 3) || (a1 == 6) || (a1 == 9); // 1의 자릿수가 3, 6, 9 이면
            boolean b10 = (a10 == 3) || (a10 == 6) || (a10 == 9); // 10의 자릿수가 3, 6, 9 이면

            if (b1 && b10) { // 1의 자릿수, 10의 자릿수가 모두 3,6,9 이면
                System.out.print("★★\t");
            } else if (b1 || b10) { // 1의 자릿수, 또는 10의 자릿수가 3,6,9 이면
                System.out.print("★\t");
            } else {
                System.out.print(a + "\t");             // 가장 마지막에 들어와야함.
                                                        // b를 하다가 특별한 상황에 a를 해야지 : X
                                                        // -> 특정한 상황에는 a를 하고 나머지는 b를 해야지 : O }
            }

            // if 사용

            if ((a1 == 3) 
                    || (a1 == 6) 
                    || (a1 == 9) 
                    || (a10 == 3) 
                    || (a10 == 6) 
                    || (a10 == 9)) {
                if ((a == 33) 
                        || (a == 36) 
                        || (a == 39) 
                        || (a == 63) 
                        || (a == 66) 
                        || (a == 69) 
                        || (a == 93) 
                        || (a == 96)
                        || (a == 99)) {
                    System.out.print("♥♥\t");
                } else {
                    System.out.print("♥\t");
                }
            } else {
                System.out.print(a + "\t");             // 가장 마지막에 들어와야함.
                                                        // b를 하다가 특별한 상황에 a를 해야지 : X
                                                        // -> 특정한 상황에는 a를 하고 나머지는 b를 해야지 : O }
            }

            if (a % 10 == 0) {
                System.out.println();        // 다른 명령어이기 때문에 따로 IF를 작성
            }


        }

    }
}
