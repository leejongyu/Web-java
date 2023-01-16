package edu.java.class05;

public class Score {

    // field : 시험점수, int 타입
    
    int korean;
    int english;
    int math;
    
    public Score() {
        
    }
    
    public Score(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    
    public void total() {
        System.out.println("국어점수 : " + korean);
        System.out.println("영어점수 : " + english);
        System.out.println("수학점수 : " + math);
    }
    
    public int sum() {
        return this.korean + this.english + this.math;
    }
    
    public double mean() {
        return (double) sum()/3 ;
    }
}
