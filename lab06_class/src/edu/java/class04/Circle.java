package edu.java.class04;

public class Circle {

    double width;
    
    public Circle() {
        
    }
    
    public Circle(double width) {
        this.width = width;
    }
    
    public double perimeter() {
        return width*2*3.14;
    }
    
    public double area() {
        return width*width*3.14;
    }
}
