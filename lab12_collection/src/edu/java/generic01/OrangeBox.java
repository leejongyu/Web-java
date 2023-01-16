package edu.java.generic01;

public class OrangeBox {
    private Orange realOrange;

    public void put(Orange orange) {
            this.realOrange = orange;
        
    }

    public Orange getOrange() {
        return realOrange;
        }
    

}

class Orange {
    private int sugar;

    public Orange(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }
}