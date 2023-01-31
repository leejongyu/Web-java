// 주석(comment) : 프로그램에 대한 설명을 작성.
// 주석은 컴파일 할 때 제외됨. (실행되지 않는 코드)
// in line comment 

/* 이렇게 하면 
 * 범위를 지정해서
 * 주석처리가 가능하다. 
 * 문서화 주석(Documentation comment)을 
 * 만들 때 주로 사용(block comment) */

package edu.java.intro1; // 패키지 선언문. 어떤 폴더에 생성되는지 알려줌
// 자바에서 모든 문장은 세미콜론(;)으로 끝난다.;

// 클래스 선언(정의)
public class AppMain1 { // start class

	// main method : 자바 프로그램의 시작과 끝
	// start main : 프로그램이 시작되는 부분
	public static void main(String[] args) { // 중괄호는 세미콜론을 사용하지 않아도 됨
		System.out.println("Hello, 자바!"); // 소괄호는 세미콜론을 사용해야함;
		
	} // end main : 프로그램이 끝나는 부분

} // end class