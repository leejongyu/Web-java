package edu.java.variable04;

import java.util.Scanner; // java.util 이라는 디렉토리의 Scanner 클래스를 import 한다.

public class variableMain04 {
	public static void main(String[] args) {
		// 콘솔 창에서 키보드로 숫자를 입력받아서 변수에 저장:
		
		// 1. scanner 타입의 변수를 선언하고 초기화
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		
		// 2. sccaner 객체를 사용해서 콘솔 창에서 정수를 입력받고 저장.
		int number = scanner.nextInt();
		System.out.println("Number = " + (number+3));
		
		
		// 과제 1
		// Java 시험 점수를 입력하세요. (시험점수 = 정수)
		Scanner Javatest = new Scanner(System.in);
		System.out.println("Java 시험 점수를 입력하세요");
		int JavaTest = scanner.nextInt();
		
		// SQL 시험 점수를 입력하세요. (시험점수 = 정수)
		Scanner SQLtest = new Scanner(System.in);
		System.out.println("SQL 시험 점수를 입력하세요");
		int SQLTest = scanner.nextInt();
		
		// JSP 시험 점수를 입력하세요. (시험점수 = 정수)
		Scanner JSP = new Scanner(System.in);
		System.out.println("JSP 시험 점수를 입력하세요");
		int JSPTest = scanner.nextInt();
		
		// 세 과목의 총점(정수)을 계산하고 출력 
		int sum = (JavaTest + SQLTest + JSPTest);
		System.out.println("총점 = " + sum);
		// 세 과목의 평균(실수)을 계산하고 출력 
		double avg = (JavaTest + SQLTest + JSPTest);
		System.out.println("평균 = " + avg);
	}
}
