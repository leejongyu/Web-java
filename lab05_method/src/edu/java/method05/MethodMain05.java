package edu.java.method05;

public class MethodMain05 {

    public static void main(String[] args) {
        // 메서드 작성 연습

        
        int[] scores = { 70, 60, 100, 50, 81, 100 };
        sum(scores); // sum 이라는 메서드는 " 총점 = " + sum
        int sum = sum2(scores);
        System.out.println("총점 : " + sum);
        
        mean(scores); // mean 메서드 : "평균 = " + mean
        double mean = mean2(scores);
        System.out.println("평균 : " + mean);
        
        max(scores); // max 메서드 : "최댓값 = " + max
        int max = max2(scores);
        System.out.println("최댓값 : " + max);
        
        min(scores); // min 메서드 : "최솟값 = " + min
        int min = min2(scores);
        System.out.println("최솟값 : " + min);
        sqrt(scores);
    }

    /**
     * 배열의 합계를 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     */
    public static void sum(int[] x) {
        int sum = 0;
        for (int a : x) {
            sum += a;
        }
        System.out.println(" 총점 : " + sum);
    }

    public static int sum2(int[] x) {
        int sum = 0;
        for (int a : x) {
            sum += a;
        }
        return sum;
    }

    /**
     * 배열의 평균을 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     */
    public static void mean(int[] x) {
        int sum = 0;
        for (int a : x) {
            sum += a;
        }
        double mean = (double) sum / x.length;
        System.out.println(" 평균 : " + mean);
    }

    public static double mean2(int[] x) {
        double sum = 0;
        for (int a : x) {
            sum += a;
        }
        double mean = sum / x.length;
        return mean;
    }

    /**
     * 배열의 원소 중 최댓값을 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     */
    public static void max(int[] x) {
        int max = x[0];
        for (int a : x) {
            max = (max < a) ? a : max;
        }
        System.out.println(" 최댓값 : " + max);
    }

    public static int max2(int[] x) {
        int max = x[0];
        for (int a : x) {
            max = (max < a) ? a : max;
        }
        return max;
    }

    /**
     * 배열의 원소 중 최솟값을 구하는 메서드입니다.
     * 
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     */
    public static void min(int[] x) {
        int min = x[0];
        for (int a : x) {
            min = (min > a) ? a : min;
        }
        System.out.println(" 최솟값 : " + min);
    }

    public static int min2(int[] x) {
        int min = x[0];
        for (int a : x) {
            min = (min > a) ? a : min;
        }
        return min;
    }

    // {x1. x2. x3}
    // 평균 = (x1 + x2 + x3) / 3
    // 분산 = [(x1 - 평균)제곱 + (x2 - 평균)제곱 + (x3 - 평균)제곱] /3
    
    /**
     * 표준편차를 구하는 메서드입니다.
     * @param x 정수를 원소로 하는 일차원 배열을 입력하세요.
     */
    public static void sqrt(int[] x) {
        int sum = 0;
        for (int a : x) {
            sum += a;
        }
        double mean = (double) sum / x.length;
        double sqrt = 0;
        double sq = 0;
        for (double a : x) {
            sq = (a - mean)*(a-mean);
            sqrt += sq;
        } double a = sqrt/x.length;
        System.out.println(sqrt);
        System.out.println(a);
        System.out.println(Math.sqrt(a));
    }

}
