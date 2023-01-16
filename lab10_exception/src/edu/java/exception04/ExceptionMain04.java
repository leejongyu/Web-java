package edu.java.exception04;

public class ExceptionMain04 {

    public static void main(String[] args) {

//        finally 블록 :
//
//            예외 발생 여부와 상관없이 try 블록이 끝나거나 catch 블록이 끝났을 때 항상 실행되는 블록.
//
//            ※ try블록 또는 catch블록 안에 return이 있을 경우, finally 블록이 실행 된 후에 return 문장이 실행됨.

        try {
            int x = 100;
            int y = 4;
            int a = Integer.parseInt("a");
            System.out.println(" 몫 = " + x / y);
            System.out.println("end try");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("end catch");
            return;
        } finally {
            System.out.println("end finally");
        }

        System.out.println("end main");
    }

}
