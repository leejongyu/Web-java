package edu.java.method05;

public class MethodMain05tr {

    public static void main(String[] args) {

        int[] scores = { 70, 60, 100, 50, 81};
        System.out.println("총점 : " + sum(scores));
        System.out.println("평균 : " + mean(scores));
        System.out.println("최댓값 : " + max(scores));
        System.out.println("최솟값 : " + min(scores));
        System.out.println("분산 : " + variance(scores));
        System.out.println("표준편차 : " + standardDeviation(scores));
    }

    /**
     * 배열의 분산값을 double type으로 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     * @return 입력한 배열 원소의 분산값
     */
    public static double variance(int[] x) {
        // 데이터 : {x1, x2, x3, x4 .... , xn};
        // 평균 : mu = ( x1 + x2 + x3 + x4 .... + xn) / n ;
        // 분산 : var = ((x1 - mu)^2 + (x2 -mu)^2 + (x3 - mu)^2 ..... + (xn - mu)^2) / n
        // 표준편차 : std = sqrt(var)

        // 배열의 평균을 먼저 계산
        double mu = mean(x);
        double total = 0;
        for (int a : x) {
            total += (a - mu) * (a - mu);
        }
        double var = total / x.length;
        return var;
    }

    /**
     * 배열의 표준편차를 double type으로 구하는 메서드입니다.
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     * @return 입력한 배열 원소의 표준편차
     */
    public static double standardDeviation(int[] x) {
        return Math.sqrt(variance(x));
    }

    /**
     * 배열의 합계를 int type으로 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     * @return 입력한 배열 원소의 합계.
     */
    public static int sum(int[] x) {
        int sum = 0;
        for (int a : x) {
            sum += a;
        }
        return sum;
    }

    /**
     * 배열의 평균을 double type으로 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     * @return 입력한 배열 원소의 평균
     */
    public static double mean(int[] x) {
        double mean = (double) sum(x) / x.length;
        return mean;
    }

    /**
     * 배열의 원소 중 최댓값을 int type으로 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     * @return 입력한 배열 원소 중 최댓값
     */
    public static int max(int[] x) {
        int max = x[0];
        for (int a : x) {
            max = (max < a) ? a : max;
        }
        return max;
    }

    /**
     * 배열의 원소 중 최솟값을 int type으로 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     * @return 입력한 배열 원소 중 최솟값
     */
    public static int min(int[] x) {
        int min = x[0];
        for (int a : x) {
            min = (min > a) ? a : min;
        }
        return min;
    }
    
}
