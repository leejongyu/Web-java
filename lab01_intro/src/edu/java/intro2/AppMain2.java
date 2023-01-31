package edu.java.intro2;

public class AppMain2 {

	public static void main(String[] args) {
		System.out.println("자바 프로그램 실행 방법");
		System.out.println("Menu -> Run -> Run");
		System.out.println("Ctrl + F11");
		System.out.println("버튼 클릭");
		// 문자열(String) : 문자들의 집합(Sequence). 큰 따옴표("")를 사용.
		
		// Tip : Ctrl+space : 코드 추천 및 자동 완성
		System.out.println("문자열"+' '+"합치기" + '+' + 1); // + : 문자열을 이어주는 연산자
		System.out.println(1 + 2); // + : 덧셈 연산자 (계산 결과)
		System.out.println("1"+"2"); // + : 문자열 1 + 문자열 2 = 12
		System.out.println("1 + 2 = 3");
		System.out.println("1 + 2 = " + (1+2)); // "1 + 2 = "에 먼저 계산한 3을 이어줌 = 1 + 2 = 3 
		System.out.println("1 + 2 = " + 1 + 2); // "1 + 2 = "에 정수 1과 2를 이어줌 = 1 + 2 = 12
		
		System.out.print("프린트");
		System.out.print("print");
	}
	
}
