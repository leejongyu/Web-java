package edu.java.modifier04;

public class Test {

    private int a;
    private double b;
    private boolean c;
    private String d;
 
    
    // 마우스 우클릭 -> source(alt + shift + s) -> Generate constructor using field (o)
    // alt + shit + s -> o 
    public Test(int a, double b, boolean c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public int getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public boolean isC() {
        return c;
    }


    public String getD() {
        return d;
    }


    public void setA(int a) {
        this.a = a;
    }


    public void setB(double b) {
        this.b = b;
    }


    public void setC(boolean c) {
        this.c = c;
    }


    public void setD(String d) {
        this.d = d;
    }
    
 
    
    
}
