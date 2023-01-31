package edu.java.variable01;

public class variableMain01 {
	
	public static void main(String[] args) {
		// 변수(Variable) : 프로그램에서 필요한 데이터를 저장하는 메모리 공간.
		// int(정수 : integer), string, boolean 
		
		// 변수 선언 : 변수의 데이터 타입과 변수의 이름을 선언.
		int age; // int : 변수의 데이터 타입. age : 변수의 이름 . /
				 // 정수의 데이터타입을 갖는 변수 age
		
		
		// 변수 초기화 : 변수에 값을 할당(저장).
		age = 28;  // = > 오른쪽의 값(28)을 왼쪽(age)에 할당(저장) . 변수 age에 값 16을 저장

		System.out.println(age);	// 변수 age가 저장한 값을 출력
		
		age = age + 1;
		
		System.out.println(age);
		
		age = age + 1;
		
		System.out.println(age);
		
		// 아래와 같이 변수 선언과 초기화를 한 문장에서 작성 가능
		int salary = 240;
		System.out.println(salary * 0.9);
		
		
		long k = 10000000000L; 
				// 정수는 기본적으로 Int로 표기되기 때문에 한계 숫자를 넘기면 L로 바꿔주어야 함
		        // long k = 100000000000 / 오류 발생
		
		System.out.println(k);
		
		
		// 변수를 찾아갈 수 있는 기능 = Ctrl + 마우스
		
		/* 자바의 기본 데이터 타입
		   정수 타입 : byte, short, int, long > 숫자 
		               char > 문자
		   실수 타입 : float, double
		   논리 타입 : boolean / 참과 거짓
		 */
		
		// 변수 이름을 만드는 문법과 관습 : 
		/*
		 *  1. 변수 이름은 알파벳과 숫자, "_" 를 사용할 수 있다. 단, 숫자로 시작할 수 없음
		 *  2. 변수 이름은 소문자로 시작하는 것이 좋음. (Class 는 대문자로)
		 *  3. 변수 이름이 2개 이상의 단얼 이루어질 때는 camel 표기법을 사용하는 것을 권장.
		 *     camel 표기법 : 다음 단어의 시작을 대문자로 사용 / ex) myPhoneNumber 
		 *  4. 같은 이름으로 변수를 2번 이상 선언 할 수 없음 
		 *     ex) int a = 1; int a = 2; : X
		 *         int a = 1; a = 2;     : O
		 *  5. 데이터타입(int, boolean 등...)으로 변수의 이름을 선언할 수 없음
		 *   // 지역변수 (Local variable) : 메서드 안에서 선언한 변수.
         *   \\ 지역변수는 선언된 곳에서부터 변수가 속한 블록({...}) 안에서만 사용 가능. 
		 */
		
		int x = 123;
		int y = 10;
		int result;

		result = x + y;
		System.out.println(result);
		
		result = x - y;
		System.out.println(result);
		
		result = x * y;
		System.out.println(result);
		
		result = x / y; // (정수) / (정수) = 나눈 몫 (소수점까지 계산하지 않음)
		System.out.println(result);
		
		result = x % y; // (정수) / (정수) = 나눈 나머지 (소수점만 계산함)
		System.out.println(result);
		
		// 나누기 연산자(/)가 (실수)에서 사용되면 소수점을 포함하는 계산을 시행함
		
		double z = 123.0;
	
		// result = z/y; : 실수를 정수로 변환하지 못하기 때문에 오류 발생
		double div = z/y;
		System.out.println(div);
		
	}
	
}
