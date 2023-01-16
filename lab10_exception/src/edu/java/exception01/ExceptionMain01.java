package edu.java.exception01;

public class ExceptionMain01 {

    public static void main(String[] args) {

    
        String s = null;
        
        if (s == null) {
            System.out.println("null");
        } else {
            System.out.println("문자열의 길이 = "+ s.length());
        }
        
        
    }

}
