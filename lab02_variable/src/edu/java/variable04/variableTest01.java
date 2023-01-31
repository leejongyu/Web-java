package edu.java.variable04;

import java.util.Scanner;

public class variableTest01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 과제 1
		// Java 시험 점수를 입력하세요. (시험점수 = 정수)
		Scanner Javatest = new Scanner(System.in);
		System.out.print("Java 시험 점수를 입력하세요");
		int JavaTest = scanner.nextInt();
		
		// SQL 시험 점수를 입력하세요. (시험점수 = 정수)
		Scanner SQLtest = new Scanner(System.in);
		System.out.print("SQL 시험 점수를 입력하세요");
		int SQLTest = scanner.nextInt();
		
		// JSP 시험 점수를 입력하세요. (시험점수 = 정수)
		Scanner JSP = new Scanner(System.in);
		System.out.print("JSP 시험 점수를 입력하세요");
		int JSPTest = scanner.nextInt();
		
		// 세 과목의 총점(정수)을 계산하고 출력 
		int sum = (JavaTest + SQLTest + JSPTest);
		System.out.println("세 과목의 총점 = " + sum);
		
		// 세 과목의 평균(실수)을 계산하고 출력 
		double avg = sum/3;
		System.out.println("세 과목의 평균 = " + avg);
	}
}
