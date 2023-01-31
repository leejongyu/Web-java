package edu.java.condition03;

import java.util.Scanner;

public class ConditionMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시험 점수를 입력하세요 : ");

        int n1 = scanner.nextInt();
        String s = "당신의 성적은 ";
        String t = " 입니다.";
        
        if (n1 >= 90) {
            System.out.println(s + "A" + t);
        } else if (
                n1 >= 80) {
            System.out.println(s + "B" + t);
        } else if (n1 >= 70) {
            System.out.println(s + "C" + t);
        } else if (n1 >= 60) {
            System.out.println(s + "D" + t);
        } else {
            System.out.println(s + "F" + t);
        }

    }
}
