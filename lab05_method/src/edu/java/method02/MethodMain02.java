package edu.java.method02;

public class MethodMain02 {

    public static void main(String[] args) {
        // 리턴 타입과 argument를 갖는 메서드 작성/호출 연습

        // 같은 클래스의 메서드를 호출할 때에는 메서드 이름으로만 호출.

        // add() 메서드 호출
        double r = add(1, 2);
        System.out.println(r);

        // subtract() 메서드 호출
        double r2 = subtract(1, 2);
        System.out.println(r2);
        
        // multiply 메서드 호출
        System.out.println(multiply(10.0,9.9));
        
        // divide 메서드 호출
        System.out.println(devide(10.0,9.9));
        
        
    }

    /**
     * double type의 두 실수를 더해줍니다.
     * 
     * @param x double type의 실수를 입력해주세요.
     * @param y double type의 실수를 입력해주세요.
     * @return x + y = 결과물입니다.
     */
    public static double add(double x, double y) {
        return x + y;
        // return : (1) 메서드를 호출한 곳에 값을 반환.
        // (2) 메서드를 종료
    }

    /**
     * double x, y의 차를 구합니다.
     * 
     * @param x double 타입의 실수를 입력해주세요.
     * @param y double 타입의 실수를 입력해주세요.
     * @return x - y = 결과물입니다.
     */
    public static double subtract(double x, double y) {
        if (x < y) {
            return y - x;
        } else {
            return x - y;
        }

    }

    /**
     * double 타입의 두 실수를 곱한 값을 double 타입으로 반환합니다.
     * @param x double 타입의 실수를 입력해주세요.
     * @param y double 타입의 실수를 입력해주세요.
     * @return x * y 의 결과물입니다.
     */
    public static double multiply(double x, double y) {
        return   x*y ;
    }
    
    /**
     * double 타입의 두 실수를 나눈 값을 double 타입으로 반환합니다.
     * @param x double 타입의 실수를 입력해주세요.
     * @param y double 타입의 실수를 입력해주세요.
     * @return x * y 의 결과물입니다.
     */ 
    public static double devide(double x, double y) {
        return x/y;
    }
    
}
