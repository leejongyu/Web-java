package edu.java.switch01;

public class SwitchMain01 {

    public static void main(String[] args) {
        String weekday = "화";

        switch (weekday) { // 일종의 레이블 역할
        case "월":
            System.out.println("월(원)래 하기 싫은 날");
            break; // 해당하는 블록에서 끝내는 역할
        case "화":
            System.out.println("화나게 하기 싫은 날");
        case "수":
            System.out.println("수업하기 싫은 날");
        case "목":
            System.out.println("목빠지게 시간 안가는 날");
            break;
        case "금":
            System.out.println("금방 시간 가는 날");
            break;
        case "토":
            System.out.println("토 나오는 알바");
        case "일":
            System.out.println("일하는 일요일");
            break;
        default:
            System.out.println("맏춤뻡좀 맏쳐라. 외않맏쳐. 귀신이 고칼로리넹");

        }
        // switch - case 구문은 해당 케이스 위치로 이동해서 break를 만날 때 까지 실행.
        // default는 항상 마지막에 사용
        // case에서 사용가능한 값의 타입은
        // 1) 정수 : byte, short, int, long, char
        // 2) 문자열 : String
        // 3) enum : 열거형 타입 .상수들의 집합 
        // 주의 : 실수타입 (float, double), boolean(true, false)은 사용할 수 없다.
        // switch 조건식에 부등호는 사용되지 않음.
        
      /*
        double x = 1.0;

        switch (x) {
            case 0.0:
                break;
            case 1.0:
                break;
            case 1.1:
                break;
            default:

        }
        */

    }
}
