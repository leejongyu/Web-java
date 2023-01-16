package edu.java.class03;

import java.util.Scanner;

public class ClassMain03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle square = new Rectangle(12, 9);

        System.out.println("세로길이 : " + square.sero + " , " + " 가로길이 : " + square.garo);

        square.rectangleSum();
        System.out.println(square.sum);

        square.rectangleArea();
        System.out.println(square.area);

        Rectangle sq2 = new Rectangle();
        sq2.sero = 12;
        sq2.garo = 10;

        sq2.rectangleSum();
        System.out.println(sq2.sum);

        sq2.rectangleArea();
        System.out.println(sq2.area);

        Rectangle sq3 = new Rectangle();
        System.out.print("직사각형의 세로 길이를 입력하세요 : ");
        sq3.sero = sc.nextInt();

        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        sq3.garo = sc.nextInt();

        sq3.rectangleSum();
        System.out.println("직사각형 모든 변의 합 : " + sq3.sum);
        
        sq3.rectangleArea();
        System.out.println("직사각형의 넓이 : " + sq3.area);
        
    }

}
