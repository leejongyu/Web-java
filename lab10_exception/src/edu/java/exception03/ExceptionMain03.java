package edu.java.exception03;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExceptionMain03 {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ExceptionMain03 app = new ExceptionMain03();

        int x = app.inputIntager();

        System.out.println("x = " + x);

    }

    private int inputIntager() {

        boolean run = true;
        int x = 0;
        int a = 0;
        int b = 0;

        while (run) {

            try {

                System.out.println("x를 입력하세요");
                a = Integer.parseInt(sc.nextLine());
                run = false;
                x = a;

            } catch (NumberFormatException e) {

                System.out.println("숫자를 입력하세요 ^^");

                while (run) {

                    try {
                        b = Integer.parseInt(sc.nextLine());
                        run = false;
                        x = b;

                    } catch (NumberFormatException e2) {
                        System.out.println("아니.. 숫자를 입력하시라구요 ㅡㅡ");

                    }
                }
            }

        }
        return x;

    }

    private int inputInt() {

        System.out.println("숫자를 입력하세요.");
        int x = 0;

        while (true) {
            try {
                x = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("정수가 아닙니다.");
            }

        }
        return x;
    }

    private int inputInto() {

        System.out.println("숫자를 입력하세요.");

        while (true) { // 변수가 아닌 true로 하면 try 안에서 return 해도 오류 안됨
            try {
                int x = Integer.parseInt(sc.nextLine());
                return x;
            } catch (NumberFormatException e) {
                System.out.println("정수가 아닙니다.");
            }

        }
    }

    private int inputInta() {

        System.out.println("숫자를 입력하세요.");
        int x = 0;

        while (true) {
            try {
                x = Integer.parseInt(sc.nextLine());
                return x;
            } catch (NumberFormatException e) {
                System.out.println("정수가 아닙니다.");
            }

        }
    }

}
