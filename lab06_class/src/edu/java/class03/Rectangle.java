package edu.java.class03;

// Class = field + constructor + method ==> Data type
public class Rectangle {

    int sero;
    int garo;
    int sum;
    int area;

    public Rectangle() {
    }

    public Rectangle(int sero, int garo) {
        this.sero = sero;
        this.garo = garo;
    }

    public int rectangleSum() {
        this.sum = (sero + garo) * 2;
        return sum;
    }

    public int rectangleSum(int sero, int garo) {
        this.sum = (sero + garo) * 2;
        return sum;
    }

    public int rectangleArea() {
        this.area = sero * garo;
        return area;
    }

    public int rectangleArea(int sero, int garo) {
        this.area = sero * garo;
        return area;
    }

}
