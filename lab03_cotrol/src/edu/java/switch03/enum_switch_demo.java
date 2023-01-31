package edu.java.switch03;

import java.util.Scanner;

public class enum_switch_demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("무슨 계절을 제일 좋아하세요? = ");
        Season2 s2 = Season2.valueOf(scanner.next());

        switch (s2) {
        case 봄:
            System.out.println("봄이 그렇게도 좋냐.");
            break;
        case 여름:
            System.out.println("핵더움 ㅋㅋ 개짜증");
            break;
        case 가을:
            System.out.println("빨리 가을 왔으면..");
            break;
        case 겨울:
            System.out.println("ㅋㅋ 역시 갓-울이지");
            break;
        }
    }
}