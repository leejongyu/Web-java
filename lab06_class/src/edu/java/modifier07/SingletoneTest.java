package edu.java.modifier07;

public class SingletoneTest {
    
    
    private static SingletoneTest single = new SingletoneTest();
    
    private SingletoneTest() {
        
    }
    
    static SingletoneTest getInstance() {
        return single;
    }
    
    
}
