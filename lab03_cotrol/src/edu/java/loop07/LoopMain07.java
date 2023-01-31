package edu.java.loop07;

public class LoopMain07 {

    public static void main(String[] args) {
        // do-while => do { 실행문; 증감식(조건변경); } while(조건식);

        int n = 1; // => 초기화

        do { // => do {
            System.out.print(n + " "); // => 실행문
            n++; // => 증감식(조건변경)
        } while (n <= 5); // => } (조건식) + ;

        System.out.println();

        // while 문은 반복을 시작하기 전에 반복조건()을 먼저 검사하기 때문에,
        // 실행 블록이 한 번도 실행 되지 않는 경우가 발생할 수 있음
        // ex)
        n = 5;
        while (n < 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("end while");
        
        
        // do-while 문에서는 무조건 실행 블록을 먼저 한 번 실행하고 난 후,
        // 반복을 계속할지 조건검사를 진행.
        do {
            System.out.println(n);
            n--;
        } while (n < 0);
        System.out.println("end do-while");
        
        // for문 무한반복 
        
        for (;;) { // = (; true;) 
        // 비워두면 무한반복 가능
        }
    
    
        // while문 무한반복

    }
}