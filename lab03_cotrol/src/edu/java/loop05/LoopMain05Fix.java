package edu.java.loop05;

public class LoopMain05Fix {

    public static void main(String[] args) {
        // 369369

        for (int a = 1; a <= 100; a++) {

            if (a % 10 == 3) {
                if (a == 33) {
                    System.out.print("☆☆" + "\t");
                } else if (a == 63) {
                    System.out.print("☆☆" + "\t");
                } else if (a == 93) {
                    System.out.print("☆☆" + "\t");
                } else {
                    System.out.print("☆" + "\t");
                }

            } else if (a % 10 == 6) {
                if (a == 66) {
                    System.out.print("☆☆" + "\t");
                } else if (a == 36) {
                    System.out.print("☆☆" + "\t");
                } else if (a == 96) {
                    System.out.print("☆☆" + "\t");
                } else {
                    System.out.print("☆" + "\t");
                }

            } else if (a % 10 == 9) {
                if (a == 99) {
                    System.out.print("☆☆" + "\t");
                } else if (a == 39) {
                    System.out.print("☆☆" + "\t");
                } else if (a == 69) {
                    System.out.print("☆☆" + "\t");
                } else {
                    System.out.print("☆" + "\t");
                }

            } else if ((a >= 30 && a < 40) || (a >= 60 && a < 70) || (a >= 90 && a < 100)) {
                System.out.print("☆" + "\t");

            } else {
                System.out.print(a + "\t");
            }
            if (a % 10 == 0) {
                System.out.println();
            }
        }
    }
}