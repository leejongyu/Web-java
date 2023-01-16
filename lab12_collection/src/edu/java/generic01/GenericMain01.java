package edu.java.generic01;

public class GenericMain01 {

    public static void main(String[] args) {

        // 사과박스 객체 생성
        AppleBox appleBox = new AppleBox();
        AppleBox moneyBox = new AppleBox();

        // 사과박스 객체 저장
        appleBox.put(new Apple("진짜사과"));
        moneyBox.put(new Money("검은돈"));

        // 사과 상자에서 객체를 꺼내기
        System.out.println(appleBox.getApple().getType());
        System.out.println(moneyBox.getMoney().getType());
        
        // 오렌지박스 객체 생성
        OrangeBox orangeBox = new OrangeBox();
        
        // 오렌지 객체 저장
        orangeBox.put(new Orange(48));
        
        // 오렌지상자에서 객체 꺼내기
        System.out.println(orangeBox.getOrange().getSugar());

    }

}
