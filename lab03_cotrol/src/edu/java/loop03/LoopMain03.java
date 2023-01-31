package edu.java.loop03;

public class LoopMain03 {

    public static void main(String[] args) {
//         구구단 2단을 완성하세요

        for (int t = 1; t < 10; t++) {
            System.out.println("2 x " + t + " = " + t * 2);
            // ctrl + / : 현재 커서가 있는 라인을 주석 토글

            System.out.printf("= 2 x %d = %d\n", t, (t * 2));
            // printf = format. 문자열 포맷(템플릿)대로 화면에 출력
            // 2 x ?(%d 1) = ?(%d 2)\n(next line), t(%d 1), t*2 (%d 2)
            // System.out.printf(a %d = %d\n) : 문자열을 포맷에 맞춰서 출력
            // %d= 정수, %f= 실수, %s = 문자열
            // escape 문자열 = \n : 줄바꿈, \t : 탭(일정 간격 띄움)...
        }

        for (int i = 1; i <= 100; i++) {

            if (i % 10 == 0) {
                System.out.println(i + "\t");
            } else {
                System.out.print(i + "\t");
            }

        }
        System.out.println("=========================================");  
        // 강사님 해설
        

        for (int x = 1; x <= 100; x++) {
            System.out.print(x + "\t");
            if (x % 10 == 0) {
                System.out.println();
            }
        }

    }
}
