package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain {

    public static void main(String[] args) {
        // 가위바위보
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int cpu = random.nextInt(3);
        System.out.print("안내면 진다 가위 바위 보 !" + "\n" + "가위 = 0, 바위 = 1, 보 =2 를 입력하세요 : ");

        System.out.println();
        int user = scanner.nextInt();
        switch (cpu) {
        case 1:
            System.out.println("\t" + "\t" + "컴퓨터 : 바위");
            break;
        case 2:
            System.out.println("\t" + "\t" + "컴퓨터 : 보");
            break;
        case 0:
            System.out.println("\t" + "\t" + "컴퓨터 : 가위");
            break;
        }

        switch (user) {
        case 1:
            System.out.println("\t" + "\t" + "나 : 바위");
            break;
        case 2:
            System.out.println("\t" + "\t" + "나 : 보");
            break;
        case 0:
            System.out.println("\t" + "\t" + "나 : 가위");
            break;

        }

        if ((user > 2) || (user < 0)) {
            System.out.println("\t" + "\t" + "나 : 잘못 내셨습니다." + "\n" + "\t"
                    + "※ 가위 = 0, 바위 = 1, 보 = 2 입니다. 잘 보고 다시 내주세요. (다시하기 = (Ctrl + f11)");
        } else if ((cpu == 0 && user == 1) 
                || (cpu == 1 && user == 2) 
                || (cpu == 2 && user == 0)) {
            System.out.print("\t" + "\t" + "당신이 이겼습니다." + "\n" + "\t" + "나 : 말 안듣는 기계는 맞아야 정신차리지");
        } else if (cpu == user) {
            System.out
                    .println("\t" + "\t" + "승부가 비겼습니다. 다시 게임을 진행 해 주세요" + "\n" + "\t" + "\t" + "(다시하기 = (Ctrl + f11)");
        } else {
            System.out.println("\t" + "\t" + "당신이 졌습니다." + "\n" + "\t" + "컴퓨터 : 인간시대의 끝이 도래했다.");
        }

    }
}