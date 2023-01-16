package edu.java.array03;

import java.util.Random;

public class ArrayMain03 {

    public static void main(String[] args) {
        // random 객체를 생성
        Random random = new Random();

        // 정수 10개를 저장할 수 있는 (scores) 배열을 선언.

        int[] scores = new int[10];

        // 배열 scores에 0 이상 10 이하의 정수난수 10개를 저장

        for (int a = 0; a < scores.length; a++) {
            scores[a] = random.nextInt(11);
            System.out.print(scores[a] + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        for (int a = 0; a < scores.length; a++) {
            System.out.println((a+1) +"번 숫자 = " + scores[a] + " ");

        } 
        System.out.println();
        System.out.println("--------------");

        // 배열 scores에 저장된 모든 점수들의 합계를 계산하고 출력
        int sum = 0;
        for (int b = 0; b < scores.length; b++) {
            sum = sum + scores[b];
            System.out.println(" + " + scores[b] + " = " +  sum + " ");
        } 
        

        
        System.out.println();
        System.out.println("합계 = " + sum);

        // 배열 scores에 저장된 모든 점수들의 평균을 실수(double)로 계산하고 출력

        double avg = (double)sum / (double)scores.length;
        System.out.println("총원 = " + scores.length);
        System.out.println("평균 = " + avg);
        
    }

}
