package edu.java.exception05;

public class ExceptionMain05 {

    public static void main(String[] args) {

        //multi-catch 블록 (Java 7 이후)
        
        // catch ( Exception1 | Excption2 | Exception 3 | ..... + 변수이름) { ... } ( | 는 1개만 사용 )
        
        // 하나의 catch 구문에서 여러개의 Exception 클래스를 선언하고 예외를 처리하는 방법
        
        // ※ 상속관계가 있는 클래스들을 함께 사용할 수 없음!

        // catch(Exception1 | Exception2 | RuntimeException | Exception....) { ... }
//                                                                  |__ 상속 관계이기 때문에 오류 발생
        
        try {
            int x = 100;
            int y = 0;
            System.out.println(" % : " + x/y); //Arithmatic 
            
            String[] names = new String[0];
            names[0] = "존규"; // OutOfBoundIndex
            
            System.out.println("names" + names[0]); 
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Multicatch
            System.out.println(e.getMessage());
        }
    }

}
