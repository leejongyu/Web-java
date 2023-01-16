package edu.java.class05;

public class ClassMain05 {

    public static void main(String[] args) {

        Score score1 = new Score(77, 88, 95);
        Student stu1 = new Student(1, "이존규", score1);
        score1.total();

        System.out.println("총점 : " + score1.sum());
        System.out.println("평균 : " + score1.mean());
        System.out.println(stu1.stuNo + ", " + stu1.stuName + ", " + stu1.score.korean + ", " + stu1.score.english
                + ", " + stu1.score.math + ", " + stu1.score.sum() + ", " + stu1.score.mean());

        System.out.println("===================줄 바꾸기====================");
        Score score2 = new Score();
        score2.korean = 67;
        score2.english = 78;
        score2.math = 85;

        score2.total();
        System.out.println("총점 : " + score2.sum());
        System.out.println("평균 : " + score2.mean());

        System.out.println("===================줄 바꾸기====================");

        Score score3 = new Score(57, 68, 75);
        Student stu3 = new Student(2, "이존규3", score3);

//        Student stu3 = new Student();
//        System.out.println(stu3.score);
        stu3.total2();

        System.out.println("===================줄 바꾸기====================");
        Student stu4 = new Student(3, "이존규4", null);
        stu4.total2();

        System.out.println("===================줄 바꾸기====================");
        Student stu5 = new Student(4, "이존규5", new Score(47, 58, 65));
        stu5.total2();

        System.out.println("===================줄 바꾸기====================");
        Student stu6 = new Student(5,"이존규6",37,48,55);
        stu6.total2();
        
        
        
    }

}
