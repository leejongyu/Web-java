package edu.java.switch03;

import java.util.Scanner;

public class SwitchMain03 {

    public static void main(String[] args) {
        // enum을 사용한 switch case
        Scanner scanner = new Scanner(System.in);
        
        Season s = Season.SUMMER; // 값을 넣으려면 해당 enum이 가진 상수를 입력해야함.

        switch (s) {
        case SPRING: // 변수를 선언할 때 데이터 타입을 선언 했기에 case에서는 enum의 이름을 입력하지 않고 enum에 저장된 변수이름만 입력
            System.out.println("봄이 그렇게도 좋냐.");
            break;
        case SUMMER:
            System.out.println("ㄹㅇ ㅋㅋ 핵더움.");
            break;
        case FALL:
            System.out.println("빨리 가을 왔으면..");
            break;
        case WINTER:
            System.out.println("??? 미치심?");
            break;

        }

    }

}
