package edu.java.generic03;

public class GenericMain03 {

    public static void main(String[] args) {

        // Integer를 저장하는 Box 객체를 생성
        Box<Integer> intBox = new Box<>();
        intBox.put(Integer.valueOf(0));
        System.out.println(intBox.get());
        
        // String을 저장하는 Box 객체를 생성
        Box<String> strBox = new Box<>();
        strBox.put(String.format("안녕하세용%d%d%d",12,3121,23));
        System.out.println(strBox.get());
        
        
        // Integer, String을 타입파라미터로 갖는 GenericCls 타입 객체를 생성
        GenericCls<Integer, String> test1 = new GenericCls<Integer, String>(159,  "Java"); // new GenericCls<>(159,  "Java")로 생략 가능
        
        System.out.println(test1.getItem1());
        System.out.println(test1.getItem2());
        
        // String, Box<String>을 파라미터로 갖는 GenericCls 타입 객체를 생성
        GenericCls<String, Box<String>> test2 = new GenericCls<String, Box<String>>("냠냠", strBox);
        System.out.println(test2.getItem1() + " + " + test2.getItem2().get());
        
    }

}
