package edu.java.class03;

public class RectangleAnswer {

    double width;
    double height;

    public RectangleAnswer() { // argument가 없는 기본 생성자

    }

    public RectangleAnswer(double width, double height) { // argument가 있는 생성자
        this.width = width;
        this.height = height;
    }

    public double perimeter() { // 둘레의 길이
        return 2 * (this.width + this.height);
    }

    public double area() { // 넓이
        return this.width * this.height;
    }
}
