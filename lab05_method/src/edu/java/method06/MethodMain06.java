package edu.java.method06;

public class MethodMain06 {

    public static void main(String[] args) {
        // 가변 인수(variable argument) : 개수가 정해져 있지 않은 argument.

        // %d= 정수, %f= 실수, %s = 문자열
        System.out.printf("scores %d \n", 1234);
        System.out.printf("scores %d > [%d] %s \n", 2, 100, "입니다");
        System.out.printf("%s %d > %f \n", "scores", 3, 12.3);

        System.out.println("===========================");

        System.out.println(addAllIntegers()); // 가변인수를 갖는 메서드를 입력할 때 값을 입력하지 않아도 됨 : 자동으로 0이 입력
        System.out.println(addAllIntegers(1));
        System.out.println(addAllIntegers(1, 2, 3));

        System.out.println("===========================");
        System.out.println(calculate("*" , 2,4,6));
    }

    // 가변 인수를 갖는 메서드 정의 :
    // 가변 인수를 저장하는 파라미터는 "변수 타입... 변수이름 ex)(int...args)" 형식으로 선언.
    // 가변 인수는 메서드 안에서는 배열처럼 취급.
    // (주의) 가변 인수를 저장하는 파라미터는 반드시 가장 마지막 파라미터로 선언. // 가변인수의 갯수가 정해져있지 않기 때문에
    // (주의) 가변 인수는 2개 이상 정의할 수 없음. // 가변인수의 갯수가 정해져 있지 않기 때문에

    public static int addAllIntegers(int... args) {
        int sum = 0;
        for (int a : args) { // < args를 배열처럼 취급
            sum += a;
        }
        return sum;
    }

    /**
     * op가 + 인 경우 : 모든 가변인수들의 합계를 반환하고, op가 * 인 경우 : 모든 가변인수들의 곱을 반환.
     * 
     * @param op   문자열. "+" or "*" 만 사용 가능
     * @param args double type 숫자
     * @return 합 or 곱
     */
    public static double calculate(String op, double... args) {
        double result = 0;

        switch (op) {
        case "+":
            for (double x : args) {
                result += x;
            }
            break;
//          if (op == "+") {
//          double sum = 0;
//          for (double x : args) {
//              sum += x;
//          }
//          result = sum;
        case "*":
            result = 1;
            for (double x : args) {
                result *= x;
            }
            break;
//          } else if (op == "*") {
//          double a = 1;
//          for (double x : args) {
//              a *= x;
//          }
//          result = a;
        default:
//          } else {
//          result = 0;
//      }
        }
        return result;
    }

}
