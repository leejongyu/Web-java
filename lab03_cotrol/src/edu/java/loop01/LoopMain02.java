package edu.java.loop01;

public class LoopMain02 {
    public static void main(String[] args) {
   
        // 1번 for 문
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i); 
        }
        
        // 2번 for 문 
        for (int i = 0; i < 5 ; i++) {
            System.out.println(i); // for 문에서 선언한 변수는 for문을 벗어나면 사라짐 = 중복선언 x
                            //     \\ 1번 for 문과 2번 for 문의 변수가 i로 같지만 오류 발생 x
        }
        // int i = 10;
        // System.out.println(i); // i를 찾을 수 없다는 에러 발생
        // int i = 10; // print 하는 문장 아래에 있어서 i = 10이 성립되지 않음 
        
        // 지역변수 (Local variable) : Method 안에서 선언한 변수.
        // 지역변수는 선언된 곳에서부터 변수가 속한 블록({...}) 안에서만 사용 가능.
        // 
        
    }
}
