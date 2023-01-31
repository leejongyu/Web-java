package edu.java.loop02;

public class LoopTest01 {

    public static void main(String[] args) {
        // 복합 할당 연산자 : +=, -=, *=, /=, ...
        int x = 1;
        x = x + 3;
        x += 3;

        // 0 2 4 6 8 10 을 한줄 씩 출력

        System.out.println("------ 방법 1) 조건식 이용 1 : i = i+2 ------");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);

        }
        System.out.println("------ 방법 2) 조건식 이용 2 : i += 2 ------");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("------ 방법 3) 출력값 이용 : i * 2 ------");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i * 2);
        }

        System.out.println("------ 방법 4) IF문 사용 ");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}