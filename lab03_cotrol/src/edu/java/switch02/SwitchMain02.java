package edu.java.switch02;

import java.util.Scanner;

public class SwitchMain02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 = ");
        
        int n = scanner.nextInt();

        
        switch (n % 2) {
        case 0:
            System.out.println("짝수");
            break;
        default :
            System.out.println("홀수");
            break;
        }
        
        
        if (n % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
        
    }
}
