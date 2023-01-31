package edu.java.loop08;

public class LoopMain08 {

    public static void main(String[] args) {
        // 중첩 반복문
        for (int i = 2; i < 10; i++) {
            System.out.println("구구단 " + i + " 단");
            for (int n = 1; n < 10; n++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
            System.out.println();
        }

        // while
        int w = 2;
        int w2 = 1;

        while (w < 10) {
            System.out.println("구구단 " + w + " 단");

            w2 = 1; // 초기화를 작업이 다시 필요함
            while (w2 < 10) {
                System.out.println(w + " x " + w2 + " = " + (w * w2) + ".");
                w2++;
            }

            System.out.println();
            w++;

        }
        System.out.println();

        // 구구단 2단부터 9단까지
        // 2단은 2*2 까지, 3단은 3*3까지 .....
        // 방법 = for문과 while문 중첩으로

        for (int x = 2; x < 10; x++) {
            System.out.println("구구단 " + x + " 단");
            for (int y = 1; y < 10; y++) {
                System.out.println(x + " x " + y + " = " + (x * y) + "..");
                if (x == y) {
                    break;
                }
            }

        }
        System.out.println(
                "==============================================================================================================");

        for (int i = 2; i < 10; i++) {
            System.out.println("---- " + i + "단 ----");
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " x " + j + " = " + (i * j) + " 맞나요?");
            }
        }

        System.out.println(
                "==============================================================================================================");

        int x = 2;
        int y = 1;
        while (x < 10) {
            System.out.println("구구단 " + x + " 단 " + "입니다.");

            y = 1;
            while ((y < 10) && (x >= y)) {
                System.out.println(x + " x " + y + " = " + (x * y) + " 입니다. ");
                y++;
            }
            x++;
        }

        System.out.println(
                "==============================================================================================================");
        x = 2;
        while (x < 10) {
            System.out.println(x + "단");
            y = 1;
            while (y < 10) {
                System.out.println(x + " x " + y + " = " + (x * y) + "?");
                if (x == y) {
                    break;
                }
                y++;
            }
            x++;
        }
        System.out.println(
                "==============================================================================================================");

        x = 2;
        while (x < 10) {
            System.out.println(x + "단을 외자");

            y = 1;
            while (y <= x) {
                System.out.println(x + " x " + y + " = " + (x * y) + "!");
                y++;
            }
            x++;

        }

        System.out.println(
                "==============================================================================================================");

    }
}