package edu.java.variable04;

import java.util.Scanner;

public class test01Sollution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("java 점수를 입력하세요 = ");
        int java = scanner.nextInt();

        System.out.print("SQL 점수를 입력하세요 = ");
        int sql = scanner.nextInt();

        System.out.print("JSP 점수를 입력하세요 = ");
        int jsp = scanner.nextInt();

        int sum = java + sql + jsp;
        System.out.println("세 과목의 총점 = " + sum);

        // double avg = sum / 3 : 정수 / 정수 = 몫만 계산함. = avg.0
        double avg = sum / 3.0; // : 정수 / 실수 = 소수점까지 계산함 = avg.xxxxxxxx
        System.out.println("세 과목의 평균 = " + avg);

        double avg1 = (double) sum / 3;
        System.out.println("세 과목의 평균2 = " + avg1);

        // Ctrl+Shift+F = 소스코드 포맷팅(자동 정렬)
        System.out.println("메롱");
    }
}
