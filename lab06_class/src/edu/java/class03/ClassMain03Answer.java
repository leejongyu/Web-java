package edu.java.class03;

public class ClassMain03Answer {

    public static void main(String[] args) {
        
        // 기본 생성자
        RectangleAnswer sq0 = new RectangleAnswer();
        System.out.println("(가로 길이 : " + sq0.width + " , 세로길이 : " + sq0.height + ")");
        System.out.println("직사각형 둘레의 길이 : " + sq0.perimeter());
        System.out.println("직사각형의 넓이 : " + sq0.area());
        System.out.println(" ");
        
        // 변수 입력
        sq0.width = 7.7;
        sq0.height = 11.5;
        System.out.println("(가로 길이 : " + sq0.width + " , 세로길이 : " + sq0.height + ")");
        System.out.println("직사각형 둘레의 길이 : " + sq0.perimeter());
        System.out.println("직사각형의 넓이 : " + sq0.area());
        
        System.out.println(" ");
        
        // argument를 갖는 생성자
        RectangleAnswer sq1 = new RectangleAnswer(8.7, 10.5);
        System.out.printf("(가로길이 : %f , 세로길이 : %f)\n", sq1.width,sq1.height);
        System.out.println("직사각형 둘레의 길이 : " + sq1.perimeter());
        System.out.println("직사각형의 넓이 : " + sq1.area());
        
    }
}
