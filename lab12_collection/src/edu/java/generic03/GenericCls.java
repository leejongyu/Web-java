package edu.java.generic03;

public class GenericCls<A, B> {

    // field
    private A item1;
    private B item2;

    // constructor
    public GenericCls(A item1, B item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public A getItem1() {
        return item1;
    }

    public B getItem2() {
        return item2;
    }

    public void setItem1(A item1) {
        this.item1 = item1;
    }

    public void setItem2(B item2) {
        this.item2 = item2;
    }

}
