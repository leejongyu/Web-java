package edu.java.file08;

import java.io.Serializable;

public class Score implements Serializable {
    // field
    private int korean;
    private int english;
    private int math;
  
    public Score() {
        
    }
    
    public Score(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "[korean=" + korean + ", english=" + english + ", math=" + math + "]";
    }

    // getters/setters

    
    
    // toString
    
    
}