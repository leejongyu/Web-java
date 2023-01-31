package edu.java.variable04;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("JAVA 점수를 입력하세요 :");
		int JAVA = scanner.nextInt();
		System.out.print("SQL 점수를 입력하세요 :");
		int SQL = scanner.nextInt();
		System.out.print("JSP 점수를 입력하세요 :");
		int JSP = scanner.nextInt();
		
		int sum = JAVA + SQL + JSP;
		double avg = sum;
		
		System.out.println("시험 점수의 합계 = " + sum);
		System.out.println("시험 점수의 평균 = " + avg/3);
	}
}
