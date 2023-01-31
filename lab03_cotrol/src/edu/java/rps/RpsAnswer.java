package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsAnswer {

    public static void main(String[] args) {
        // 가위 - 0 , 바위 - 1 , 보 -2

        // 컴퓨터의 가위, 바위, 보는 난수(정수)로 만듦
        Random random = new Random();
        int cpu = random.nextInt(3);
        System.out.println("가위, 바위 , 보 게임 시작");
        System.out.println(
                "==============================================================================================================");
        System.out.println("[0] - 가위 , [1] - 바위, [2] - 보");
        System.out.println(
                "==============================================================================================================");
        System.out.print("선택하세요 > ");

        // 사용자는 콘솔창에서 키보드로 가위, 바위 보에 해당하는 정수를 입력하도록 함
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        // print (computer : user)
        System.out.println("Computer(" + cpu + ") : user(" + user + ")");
        // 승/패 출력 1 (if)
        System.out.println(
                "===================================================1번 유형===================================================");

        if (user == 0) { // 사용자 = 가위
            if (cpu == 0) { // 컴퓨터 = 가위
                System.out.print("tie");
            } else if (cpu == 1) { // 컴퓨터 = 바위
                System.out.print("Computer win");
            } else if (cpu == 2) { // 컴퓨터 = 보
                System.out.print("You win");
            }
        } else if (user == 1) { // 사용자 = 바위
            if (cpu == 0) { // 컴퓨터 = 가위
                System.out.print("You win");
            } else if (cpu == 1) { // 컴퓨터 = 바위
                System.out.print("Tie");
            } else if (cpu == 2) { // 컴퓨터 = 보
                System.out.print("Computer win");
            }
        } else if (user == 2) { // 사용자 = 보
            if (cpu == 0) { // 컴퓨터 = 가위
                System.out.print("Computer win");
            } else if (cpu == 1) { // 컴퓨터 = 바위
                System.out.print("You win");
            } else if (cpu == 2) { // 컴퓨터 = 보
                System.out.print("Tie");
            }
        }

        System.out.println();

        // 승/패 출력 2 (if)
        System.out.println(
                "===================================================2번 유형===================================================");
        if (cpu == user) { // 비긴 경우
            System.out.print("Tie");
        } else if (user == 0) { // 사용자 = 가위
            if (cpu == 1) { // 컴퓨터 = 바위
                System.out.print("Computer win");
            } else { // 컴퓨터 == 보
                System.out.print("You win");
            }
        } else if (user == 1) { // 사용자 = 바위
            if (cpu == 0) { // 컴퓨터 = 가위
                System.out.print("You win");
            } else { // 컴퓨터 = 보
                System.out.print("Computer win");
            }
        } else { // 사용자 = 보
            if (cpu == 0) { // 컴퓨터 = 가위
                System.out.print("Computer win");
            } else { // 컴퓨터 = 바위
                System.out.print("You win");
            }
        }
        System.out.println();

        // 승/패 출력3 (if)
        System.out.println(
                "===================================================3번 유형===================================================");
        if (user == cpu) {
            System.out.print("Tie");
        } else if ((user == 0 && cpu == 2) || (user == 1 && cpu == 0) || (user == 2 && cpu == 1)) {
            System.out.print("You win");
        } else {
            System.out.print("Computer win");
        }
        System.out.println();
        
        // 승/패 출력4 (if)
        System.out.println(
                "===================================================4번 유형===================================================");
        int diff = user - cpu;
        if (diff == 0) {
            System.out.print("Tie");
        } else if (diff == 1 
                || diff == -2) {
            System.out.print("You win");
        } else {
            System.out.print("Computer win");
        }
    }
}
