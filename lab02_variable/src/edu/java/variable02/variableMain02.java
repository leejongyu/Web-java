package edu.java.variable02;

public class variableMain02 {
	public static void main(String[] args) {
		
		// 문자(Character : char) : 문자 1개. 작은 따옴표(' ') 사용
		// 문자열(String) : 문자들로 이루어진 집합. 큰 따옴표(" ") 사용
		
		char ch00 ='a';
		char ch01 = 'b';
		
		System.out.println(ch00);
		System.out.println(ch01);
		System.out.println((int) ch00); // ((데이터타입) 변수이름); casting 강제 타입 변환. 
		System.out.println((int) ch01);
		System.out.println(ch00 + ch01);
		System.out.println(ch00 + "" + ch01);
		
		ch00 = '학';
		System.out.println((int)ch00);
		
		String s = "한글";
		System.out.println(s);
		
	}
}
