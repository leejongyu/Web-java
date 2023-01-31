package edu.java.variable03;

public class variableMain03 {
	public static void main(String[] args) {
		// boolean : 참(true) 또는 거짓(false) 형태로 저장하는 타입
		// 비교 연산자 : == (같다), !=(같지 않다), >(크다), >=(크거나 같다), <(작다), <=(작거나 같다) 
		// 논리 연산자 : && (and), ||(or) , !(not)

		boolean isEqual = (2 == 3);
		System.out.println(isEqual);
		
		boolean isNotEqual = (2 != 3);
		System.out.println(isNotEqual);
		
		int x = 99;
		
		boolean bool = (x >= 90) && (x < 100);
		// 연산 순서 : 괄호 -> 등호 이전에 입력된 연산자들
		System.out.println(bool);
		
	}
}
