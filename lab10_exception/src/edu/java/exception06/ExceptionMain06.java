package edu.java.exception06;

public class ExceptionMain06 {

    public static void main(String[] args) {

        Calculator a = new Calculator();

        try {

            int result = a.devide(7, 0);
            System.out.println(result);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int x = a.devide(100, 30);
        try {
            int y = a.devide2(100, 0); // => [(반드시 예외처리를 해야하는 exception을), throw 한다고 선언된 메서드]를 호출 할 때에는 try catch 구문을
                                        // 사용하거나 throws 선언문을 메서드 선언에 추가해야 함.
            System.out.println(y);
        } catch (Exception e) {
            e.printStackTrace();
            // 예외가 발생한 이유, 예외가 발생되기까지의 코드 호출 순서를 출력.
            
            System.out.println(e.getMessage());
        }
        System.out.println("정상종료");
    }

}
