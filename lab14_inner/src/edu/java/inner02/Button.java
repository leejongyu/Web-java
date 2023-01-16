package edu.java.inner02;

public class Button {

    // static inner interface
    public static interface OnClickListener {
        void onClick(); // 추상메서드(public abstract)

    }

    // field
    private String btnName;
    private OnClickListener listener; // 인터페이스로 멤버변수 선언

    // constructor
    public Button(String btnName) {
        this.btnName = btnName;

    }

    // method
    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.print(btnName + "버튼 : ");
        listener.onClick();
        
    }

    
    
    
    
}
