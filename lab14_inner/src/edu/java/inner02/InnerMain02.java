package edu.java.inner02;

import edu.java.inner02.Button.OnClickListener;

public class InnerMain02 {

    public static void main(String[] args) {

        // 방법 1. 외부의 클래스를 생성하기.

        Button btnOpen = new Button("[열기]"); // Button 타입의 변수 선언, 객체 생성

        // 생성된 Button 타입의 객체의 setter 메서드를 호출하려면 OnClickListener의 객체를 argument로 전달해야함.

        OnClickListener l = new OpenButtonListener();
        btnOpen.setOnClickListener(l); // listen 변수 설정 = Button의 기능을 등록
        btnOpen.click(); // 버튼 클릭 -> 버튼클릭 기능 실행

        // 방법 2. 지역 (내부) 클래스 생성 (local class) : 메서드 안에서 선언된 클래스

        Button btnSave = new Button("[저장]");
        class CloseButtonListener implements OnClickListener {
            @Override
            public void onClick() {
                System.out.println("파일 저장");

            }
        }

        OnClickListener l2 = new CloseButtonListener();
        btnSave.setOnClickListener(l2);
        btnSave.click();

        // 방법 3-1. 변수를 사용한 익명클래스 (anonymous)

        Button btnClose = new Button("[닫기]");

        OnClickListener l3 = new OnClickListener() { // 클래스의 이름이 없기 떄문에 선언과 동시에 정의 (1회용)
            @Override
            public void onClick() {
                System.out.println("파일 닫기");
            }
        };
        btnClose.setOnClickListener(l3);
        btnClose.click();

        // 방법 3-2. 생성자를 이용한 익명클래스

        Button btnEdit = new Button("[수정]");

        btnEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("파일 수정");
            }
        });
        btnEdit.click();

    }

}
