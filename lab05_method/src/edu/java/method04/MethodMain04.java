package edu.java.method04;

public class MethodMain04 {

    public static void main(String[] args) {
        // 메서드 오버로딩(Method overloading)
        // 메서드의 파라미터 타입, 개수가 다를. 때 같은 이름으로 여러개의 메서드를 정의할 수 있음
        // (주의) 파라미터는 동일하고 리턴 타입만 다르게 오버로딩 할 수 없음.
        
    }
    
    public static void newLine() {
        System.out.println();
    }

    public static void newLine(int n) { // 같은 이름. 파라미터가 달라서 생성 가능
     for (int i = 0; i< n ; i++) {
         System.out.println("*");
     }
    }
    
 
    
}
