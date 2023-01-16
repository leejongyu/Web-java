package edu.java.exception06;

public class Calculator {
//    Java의 Exception class
//    1) 반드시 예외 처리를 해야 하는 exception class
//     -> try catch 문장 또는 throws 선언을 하지 않으면 compile error 발생
//          = try catch 문장 또는 throws 선언을 반드시 사용해야 하는 Exception
//        ex) Exception
//
//    2) 예외처리를 하지 않아도 괜찮은 unchecked exception class
//    ※ 처리를 하지 않아도 오류발생이 안되는 것이 아님
//     -> try catch 문장 또는 throws 선언이 없어도 컴파일 에러가 발생하지 않음.
//        
//        ex) IllegalArgumantException

    // 예외를 던질(throw) 수 있는 메서드.

    public int devide(int x, int y) {  // unchecked exception class
        
        if (y != 0) {
            return x / y;    // method를 호출 한 곳으로 값을 반환
        }
        
        throw new IllegalArgumentException("y는 0이 될 수 없음"); // throw (s 안들어감)
        // method를 호출한 곳으로 예외를 던짐
    }

    
    public int devide2(int x, int y) throws Exception {  // try catch로 하지 않으면 error가 발생
        
        if (y != 0) {
            return x / y;    
        }
        
        throw new Exception("y는 0이 될 수 없음"); // IlligalArgument는 상관 없지만, Exception에서는 꼭 throws 해줘야함
        // method를 호출한 곳으로 예외를 던짐
    }

}
