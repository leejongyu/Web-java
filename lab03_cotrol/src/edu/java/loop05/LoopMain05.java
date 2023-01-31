package edu.java.loop05;

public class LoopMain05 {

    public static void main(String[] args) {
        // 369369

        for (int tsn = 1; tsn <= 100; tsn++) {

            if (tsn % 10 == 3) {
                System.out.print("☆" + "\t");
            } else if (tsn % 10 == 6) {
                System.out.print("☆" + "\t");
            } else if (tsn % 10 == 9) {
                System.out.print("☆" + "\t");
            } else if (tsn >= 30 && tsn < 40) {
                System.out.print("☆" + "\t");
            } else if (tsn >= 60 && tsn < 70) {
                System.out.print("☆" + "\t");
            } else if (tsn >= 90 && tsn < 100) {
                System.out.print("☆" + "\t");
            } else {
                System.out.print(tsn + "\t");
            }

            if (tsn % 10 == 0) {
                System.out.println();
            }

        }

    }

}
