package edu.java.file06;

import java.io.Serializable;

public class Product implements Serializable {

    private int cord;
    private String name;
    private int price;

    public Product() {

    }

    public Product(int cord, String name, int price) {
        this.cord = cord;
        this.name = name;
        this.price = price;
    }

    public int getCord() {
        return cord;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public void setCord(int cord) {
        this.cord = cord;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[상품 코드번호 : " + cord + ", 상품 이름 : " + name + ", 상품 가격 : " + price + "]";
    }

    
    
}
