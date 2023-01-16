package edu.java.class05;

public class Student {

    // field
    
    int stuNo; // 학번
    String stuName; // 학생이름
    Score score; // 국/ 영/ 수 성적
    
    public Student() {
        
    }
    
    
    public Student(int stuNo, String stuName, Score score) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.score = score;
    }
    

    public Student(int stuNo, String stuName, int korean, int english, int math) {
        this(stuNo, stuName, new Score(korean, english, math)); // 코드 다이어트
//        this.stuNo = stuNo;
//        this.stuName = stuName;
//        this.score = new Score(korean, english, math); // 이렇게 하면 된다 존규야..
    }
    
    public void total2() {
        System.out.println("=== 학생 정보 ===");
        System.out.println(this.stuNo);             
        System.out.println(this.stuName);
        if (score != null) {
            this.score.total();     
            System.out.println(this.score.sum());       //  this 활용법
            System.out.println(this.score.mean());      //  this 활용법
        } else {
            System.out.println("값을 입력해주세요");
        }
        
    }
    

    
}
