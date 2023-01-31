package edu.java.condition01;

public class ConditionMain01 {
    public static void main(String[] args){
        // 조건문 (conditional statement)
        int number = -123;
      
        if (number >= 0) {
            System.out.println("양수");
        } else {
            System.out.println("음수");
        }
        
        if (number % 2 == 0) {
            System.out.println("짝수");    
        } else {
            System.out.println("홀수");
        }
        
        
        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("zero");
        }
        
    }
}

