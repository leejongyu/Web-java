package edu.java.variable04;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("JAVA 점수를 입력하세요 :");
        int JAVA = scanner.nextInt();
        System.out.print("SQL 점수를 입력하세요 :");
        int SQL = scanner.nextInt();
        System.out.print("JPL 점수를 입력하세요 :");
        int JPL = scanner.nextInt();

        System.out.println("점수의 합 = " + (JAVA + SQL + JPL));
        System.out.println("점수의 평균 = " + ((double) (JAVA + SQL + JPL)) / 3);
    }
}
