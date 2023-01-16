package edu.java.method03;

public class MethodMain03 {

    public static void main(String[] args) {

        countdown(50);
   
        
    }
    
    /**
     * 입력한 숫자 n부터 0까지 나올 수 있도록 출력합니다.
     * @param n int값 n을 입력하세요.
     */
    public static void countdown(int n) {
        if (n<0) {
            System.out.println("n 은 0 이상의 정수여야 합니다.");
             return; // 메서드 종료(= break는 사용하지 못함)
        }
        for (int i = n; i >= 0 ; i--) {
            if (i % 10 == 4) {
                System.out.println(" ");
            } else {
                System.out.println(i);
            }
        }
    }
}
