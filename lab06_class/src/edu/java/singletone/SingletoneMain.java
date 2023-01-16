package edu.java.singletone;

public class SingletoneMain {

    public static void main(String[] args) {
        
        Captain cap = Captain.getInstance();
        System.out.println(cap);
        System.out.println(cap.getName());
    
        Captain cap2 = Captain.getInstance();
        System.out.println(cap2);
        System.out.println(cap2.getName());

        cap2.setName("캡틴 아메리카");
        System.out.println(cap);
        System.out.println(cap.getName());
        
        System.out.println(cap2);
        System.out.println(cap2.getName());
    }

}
