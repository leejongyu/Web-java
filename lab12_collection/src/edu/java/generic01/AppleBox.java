package edu.java.generic01;


public class AppleBox {

    private Apple apple;
    private Money money;
    
    public void put(Apple apple) {
        this.apple = apple;
    }
    
    public void put(Money money) {
        this.money = money;
    }
    
    public Apple getApple() {
        return apple;
    }
    public Money getMoney() {
        return money;
    }
    
}


class Apple {
    private String type;
    public Apple(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Money {
    private String type;
    public Money(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
}